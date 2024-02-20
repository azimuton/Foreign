package com.azimuton.foreign.fragments.spain

import android.annotation.SuppressLint
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
import com.azimuton.foreign.R
import com.azimuton.foreign.databinding.FragmentWriteSpainBinding
import com.azimuton.foreign.viewmodels.spain.LearnedSpainViewModel
import com.azimuton.foreign.viewmodels.spain.WriteSpainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

@AndroidEntryPoint
class WriteSpainFragment : Fragment() {
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private lateinit var binding : FragmentWriteSpainBinding
    lateinit var database : AppRoomDatabase
    private lateinit var randomWord : LearnedSpainWordEntity
    private val viewModel : LearnedSpainViewModel by activityViewModels()
    private var countRight = 0
    private var countFail = 0
    var susp : Int = 0
    private lateinit var corcheck : Job
    private lateinit var corchoose : Job

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWriteSpainBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        database = AppRoomDatabase.getDatabase(requireActivity())
        coroutineScope.launch {
            susp = database.learnedSpainWordDao().count()
        }
        binding.tvWriteChooseWordForCheckSpain.setOnClickListener {
           corchoose =  coroutineScope.launch(Dispatchers.Main) {
                binding.tvWriteChooseWordForCheckSpain.background = resources.getDrawable(R.drawable.button_resource_two)
                delay(350)
                binding.tvWriteChooseWordForCheckSpain.background = resources.getDrawable(R.drawable.button_resource)
               corchoose.cancel()
            }
            coroutineScope.launch {
                if (susp != 0) {
                    activity?.runOnUiThread {
                        binding.tvWriteHintWord.text = ""
                        binding.etWriteWordForCheckingSpain.text.clear()
                        binding.ivWriteOkSpain.visibility = View.GONE
                        binding.ivWriteBadSpain.visibility = View.GONE
                    }
                    randomWord = database.learnedSpainWordDao().randoms()
                    activity?.runOnUiThread {
                        binding.tvWriteWordSpain.text = randomWord.learnedTranslateSpainWord
                    }
                } else {
                    activity?.runOnUiThread {
                        Toast.makeText(requireActivity(), "No words!", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
        binding.tvWriteCheckSpain.setOnClickListener {
            corcheck = coroutineScope.launch(Dispatchers.Main) {
                binding.tvWriteCheckSpain.background = resources.getDrawable(R.drawable.button_resource_two)
                delay(350)
                binding.tvWriteCheckSpain.background = resources.getDrawable(R.drawable.button_resource)
                corcheck.cancel()
            }
            if(susp != 0){
                hideSystemUI()
                if(binding.tvWriteWordSpain.text != ""){
                    if(binding.etWriteWordForCheckingSpain.text.isNotEmpty()){
                        if(randomWord.learnedSpainWord.contentEquals(binding.etWriteWordForCheckingSpain.text.toString(), true) ){
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
                coroutineScope.launch(Dispatchers.Main) {
                    binding.tvWriteHintWord.visibility = View.VISIBLE
                    binding.tvWriteHintWord.text = randomWord.learnedSpainWord
                    binding.tvWriteHintTapSpain.background = resources.getDrawable(R.drawable.button_resource_two)
                    delay(1500)
                    binding.tvWriteHintWord.visibility = View.GONE
                    binding.tvWriteHintTapSpain.background = resources.getDrawable(R.drawable.button_resource)
                }
            } else{
                Toast.makeText(requireActivity(), "No words for a tip !", Toast.LENGTH_SHORT).show()
            }

        }
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