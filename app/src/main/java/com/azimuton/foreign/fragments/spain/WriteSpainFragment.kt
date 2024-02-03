package com.azimuton.foreign.fragments.spain

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.azimuton.data.roomstorage.models.spain.LearnedSpainWordEntity
import com.azimuton.data.roomstorage.room.AppRoomDatabase
import com.azimuton.foreign.databinding.FragmentWriteSpainBinding
import com.azimuton.foreign.viewmodels.spain.WriteSpainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WriteSpainFragment : Fragment() {
    private lateinit var binding : FragmentWriteSpainBinding
    lateinit var database : AppRoomDatabase
    lateinit var randomWord : LearnedSpainWordEntity
    private val viewModel : WriteSpainViewModel by activityViewModels()
    private var countRight = 0
    private var countFail = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWriteSpainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        database = AppRoomDatabase.getDatabase(requireActivity())
        binding.tvWriteChooseWordForCheckSpain.setOnClickListener {
            if(database.learnedSpainWordDao().count() != 0){
                binding.tvWriteHintWord.text = ""
                binding.etWriteWordForCheckingSpain.text.clear()
                binding.ivWriteOkSpain.visibility = View.GONE
                binding.ivWriteBadSpain.visibility = View.GONE
                randomWord = database.learnedSpainWordDao().randoms()
                binding.tvWriteWordSpain.text = randomWord.learnedTranslateSpainWord
            } else {
                Toast.makeText(requireActivity(), "No words!", Toast.LENGTH_SHORT).show()
            }
        }
        binding.tvWriteCheckSpain.setOnClickListener {
            if(database.learnedSpainWordDao().count() != 0){
//                val  w : Window? = activity?.window
//                w?.decorView?.setSystemUiVisibility(
//                    View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
//                            or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
                hideSystemUI()
                if(binding.tvWriteWordSpain.text != ""){
                    if(binding.etWriteWordForCheckingSpain.text.isNotEmpty()){
                        if(randomWord.learnedSpainWord.equals(binding.etWriteWordForCheckingSpain.text.toString(), true) ){
                            countRight++
                            binding.tvRightSpain.text = countRight.toString()
                            binding.ivWriteBadSpain.visibility = View.GONE
                            binding.ivWriteOkSpain.visibility = View.VISIBLE
                            val ims = activity?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                            ims.hideSoftInputFromWindow(binding.etWriteWordForCheckingSpain.windowToken, 0)
                            Toast.makeText(requireActivity(), "Write!", Toast.LENGTH_SHORT).show()
                        } else{
                            countFail++
                            binding.tvFailSpain.text = countFail.toString()
                            binding.ivWriteOkSpain.visibility = View.GONE
                            binding.ivWriteBadSpain.visibility = View.VISIBLE
                            val ims = activity?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                            ims.hideSoftInputFromWindow(binding.etWriteWordForCheckingSpain.windowToken, 0)
                            Toast.makeText(requireActivity(), "Wrong!", Toast.LENGTH_SHORT).show()
                        }
                    } else {
                        Toast.makeText(requireActivity(), "Remember to write the word!", Toast.LENGTH_SHORT).show()
                    }
                }else{
                    Toast.makeText(requireActivity(), "Select a new word to test!", Toast.LENGTH_SHORT).show()
                }

            }else {
                Toast.makeText(requireActivity(), "No words!", Toast.LENGTH_SHORT).show()
            }
        }
        binding.ivWriteClearSpain.setOnClickListener {
            binding.etWriteWordForCheckingSpain.text.clear()
        }
        binding.tvWriteHintTapSpain.setOnClickListener {
            if(binding.tvWriteWordSpain.text.isNotEmpty()){
                binding.tvWriteHintWord.text = randomWord.learnedSpainWord
            } else{
                Toast.makeText(requireActivity(), "No words for a tip !", Toast.LENGTH_SHORT).show()
            }

        }
//        val  w : Window? = activity?.window
//        w?.decorView?.systemUiVisibility = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
//                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
        hideSystemUI()
    }
    private fun hideSystemUI () {
        val window : Window? = activity?.window
        if (window != null) {
            WindowCompat.setDecorFitsSystemWindows(window, false)
        }
        if (window != null) {
            WindowInsetsControllerCompat (window, window.decorView).let { controller ->
                controller.hide (WindowInsetsCompat.Type.systemBars ())
                controller.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
            }
        }
    }
}