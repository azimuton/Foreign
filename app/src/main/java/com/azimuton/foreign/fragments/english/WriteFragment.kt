package com.azimuton.foreign.fragments.english

import android.annotation.SuppressLint
import android.content.Context.INPUT_METHOD_SERVICE
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
import com.azimuton.data.roomstorage.models.english.LearnedWordEntity
import com.azimuton.data.roomstorage.room.AppRoomDatabase
import com.azimuton.foreign.R
import com.azimuton.foreign.databinding.FragmentWriteBinding
import com.azimuton.foreign.viewmodels.english.LearnedViewModel
import com.azimuton.foreign.viewmodels.english.WriteViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@AndroidEntryPoint
class WriteFragment : Fragment() {
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    lateinit var binding : FragmentWriteBinding
    lateinit var database : AppRoomDatabase
     lateinit var randomWord : LearnedWordEntity
    private val viewModel : LearnedViewModel by activityViewModels()
    private var countRight = 0
    private var countFail = 0
     var susp : Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWriteBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        database = AppRoomDatabase.getDatabase(requireActivity())
        coroutineScope.launch {
             susp = database.learnedWordDao().count()
        }

        binding.tvWriteChooseWordForCheck.setOnClickListener {
            coroutineScope.launch(Dispatchers.Main) {
                binding.tvWriteChooseWordForCheck.background = resources.getDrawable(R.drawable.button_resource_two)
                delay(350)
                binding.tvWriteChooseWordForCheck.background = resources.getDrawable(R.drawable.button_resource)
            }
            coroutineScope.launch {
                if (susp != 0) {
                    activity?.runOnUiThread {
                        binding.tvWriteHintWord.text = ""
                        binding.etWriteWordForChecking.text.clear()
                        binding.ivWriteOk.visibility = View.GONE
                        binding.ivWriteBad.visibility = View.GONE
                    }
                    randomWord = database.learnedWordDao().randoms()
                    activity?.runOnUiThread {
                        binding.tvWriteWord.text = randomWord.learnedTranslateWord
                    }
                } else {
                    activity?.runOnUiThread {
                        Toast.makeText(
                            requireActivity(),
                            "No words!",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            }
        }
        binding.tvWriteCheck.setOnClickListener {
            coroutineScope.launch(Dispatchers.Main) {
                binding.tvWriteCheck.background = resources.getDrawable(R.drawable.button_resource_two)
                delay(350)
                binding.tvWriteCheck.background = resources.getDrawable(R.drawable.button_resource)
            }
            if(susp != 0){
                hideSystemUI()
                if(binding.tvWriteWord.text != ""){
                    if(binding.etWriteWordForChecking.text.isNotEmpty()){
                        if(randomWord.learnedEnglishWord.equals(binding.etWriteWordForChecking.text.toString(), true) ){
                            countRight++
                            binding.tvRight.text = countRight.toString()
                            binding.ivWriteBad.visibility = View.GONE
                            binding.ivWriteOk.visibility = View.VISIBLE
                            val ims = activity?.getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                            ims.hideSoftInputFromWindow(binding.etWriteWordForChecking.windowToken, 0)
                            Toast.makeText(requireActivity(), "Write!", Toast.LENGTH_SHORT).show()
                        } else{
                            countFail++
                            binding.tvFail.text = countFail.toString()
                            binding.ivWriteOk.visibility = View.GONE
                            binding.ivWriteBad.visibility = View.VISIBLE
                            val ims = activity?.getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                            ims.hideSoftInputFromWindow(binding.etWriteWordForChecking.windowToken, 0)
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
        binding.ivWriteClear.setOnClickListener {
            binding.etWriteWordForChecking.text.clear()
        }
        binding.tvWriteHintTap.setOnClickListener {
            if(binding.tvWriteWord.text.isNotEmpty()){
                coroutineScope.launch(Dispatchers.Main) {
                    binding.tvWriteHintWord.visibility = View.VISIBLE
                    binding.tvWriteHintWord.text = randomWord.learnedEnglishWord
                    binding.tvWriteHintTap.background = resources.getDrawable(R.drawable.button_resource_two)
                    delay(1500)
                    binding.tvWriteHintWord.visibility = View.GONE
                    binding.tvWriteHintTap.background = resources.getDrawable(R.drawable.button_resource)
                }

            } else{
                Toast.makeText(requireActivity(), "No words for a tip!", Toast.LENGTH_SHORT).show()
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