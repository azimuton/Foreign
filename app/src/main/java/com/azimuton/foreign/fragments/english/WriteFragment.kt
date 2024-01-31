package com.azimuton.foreign.fragments.english

import android.content.Context.INPUT_METHOD_SERVICE
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.azimuton.data.roomstorage.models.english.LearnedWordEntity
import com.azimuton.data.roomstorage.room.AppRoomDatabase
import com.azimuton.foreign.databinding.FragmentWriteBinding
import com.azimuton.foreign.viewmodels.WriteViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WriteFragment : Fragment() {
    lateinit var binding : FragmentWriteBinding
    lateinit var database : AppRoomDatabase
     lateinit var randomWord : LearnedWordEntity
    private val viewModel : WriteViewModel by activityViewModels()
    private var countRight = 0
    private var countFail = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWriteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        database = AppRoomDatabase.getDatabase(requireActivity())
        binding.tvWriteChooseWordForCheck.setOnClickListener {
            if(database.learnedWordDao().count() != 0){
                binding.tvWriteHintWord.text = ""
                binding.etWriteWordForChecking.text.clear()
                binding.ivWriteOk.visibility = View.GONE
                binding.ivWriteBad.visibility = View.GONE
                randomWord = database.learnedWordDao().randoms()
                binding.tvWriteWord.text = randomWord.learnedTranslateWord
            } else {
                Toast.makeText(requireActivity(), "Нет ни одного выученного слова!", Toast.LENGTH_SHORT).show()
            }
        }
        binding.tvWriteCheck.setOnClickListener {
            if(database.learnedWordDao().count() != 0){
                val  w : Window? = activity?.window
                w?.decorView?.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                            or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
                if(binding.tvWriteWord.text != ""){
                    if(binding.etWriteWordForChecking.text.isNotEmpty()){
                        if(randomWord.learnedEnglishWord.equals(binding.etWriteWordForChecking.text.toString(), true) ){
                            countRight++
                            binding.tvRight.text = countRight.toString()
                            binding.ivWriteBad.visibility = View.GONE
                            binding.ivWriteOk.visibility = View.VISIBLE
                            val ims = activity?.getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                            ims.hideSoftInputFromWindow(binding.etWriteWordForChecking.windowToken, 0)
                            Toast.makeText(requireActivity(), "Правильно!", Toast.LENGTH_SHORT).show()
                        } else{
                            countFail++
                            binding.tvFail.text = countFail.toString()
                            binding.ivWriteOk.visibility = View.GONE
                            binding.ivWriteBad.visibility = View.VISIBLE
                            val ims = activity?.getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                            ims.hideSoftInputFromWindow(binding.etWriteWordForChecking.windowToken, 0)
                            Toast.makeText(requireActivity(), "Неправильно!", Toast.LENGTH_SHORT).show()
                        }
                    } else {
                        Toast.makeText(requireActivity(), "Не забудьте написать слово!", Toast.LENGTH_SHORT).show()
                    }
                }else{
                    Toast.makeText(requireActivity(), "Выберите новое слово для проверки!", Toast.LENGTH_SHORT).show()
                }

            }else {
                Toast.makeText(requireActivity(), "Нет ни одного выученного слова!", Toast.LENGTH_SHORT).show()
            }
        }
        binding.ivWriteClear.setOnClickListener {
            binding.etWriteWordForChecking.text.clear()
        }
        binding.tvWriteHintTap.setOnClickListener {
            if(binding.tvWriteWord.text.isNotEmpty()){
                binding.tvWriteHintWord.text = randomWord.learnedEnglishWord
            } else{
                Toast.makeText(requireActivity(), "Нет слов для подсказки !", Toast.LENGTH_SHORT).show()
            }

        }
        val  w : Window? = activity?.window
        w?.decorView?.systemUiVisibility = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
    }
}