package com.azimuton.foreign.fragments.english

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
import com.azimuton.domain.models.english.Word
import com.azimuton.foreign.Constants
import com.azimuton.foreign.R
import com.azimuton.foreign.databinding.FragmentTranslaterBinding
import com.azimuton.foreign.viewmodels.english.TranslaterViewModel
import com.google.mlkit.nl.translate.TranslateLanguage
import com.google.mlkit.nl.translate.Translation
import com.google.mlkit.nl.translate.TranslatorOptions
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class TranslaterFragment : Fragment() {
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    private lateinit var  russianEnglishTranslator : com.google.mlkit.nl.translate.Translator
    private lateinit var  englishRussianTranslator : com.google.mlkit.nl.translate.Translator
    var text : String = ""
    lateinit var binding : FragmentTranslaterBinding
    private val viewModel : TranslaterViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTranslaterBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.ivChangeLanguages.setOnClickListener(firstButtonListener)
        binding.ivClearET.setOnClickListener {
            binding.etEnterWordForTranslate.text.clear()
            binding.tvTranslatjngWord.text = ""
            binding.tvAlarmMessage.text = ""
            binding.tvSaveTranslate.isEnabled = true
            binding.tvSaveTranslate.alpha = 1f
           hideSystemUI()
        }
        binding.tvSaveTranslate.setOnClickListener {
            coroutineScope.launch(Dispatchers.Main) {
                binding.tvSaveTranslate.background = resources.getDrawable(R.drawable.button_resource_two)
                delay(350)
                binding.tvSaveTranslate.background = resources.getDrawable(R.drawable.button_resource)
            }
            if (binding.etEnterWordForTranslate.text.isNotEmpty() && binding.tvTranslatjngWord.text.isNotEmpty()) {
                if(binding.tvEnglish.text == Constants.ENG && binding.tvRussian.text == Constants.RUS){
                    val englishWord: String = binding.etEnterWordForTranslate.text.toString()
                    val translateWord: String = binding.tvTranslatjngWord.text.toString()
                    val word = Word(englishWord = englishWord, translateWord = translateWord)
                    viewModel.insert(word)
                    binding.etEnterWordForTranslate.text.clear()
                    binding.tvTranslatjngWord.text = ""
                    binding.tvAlarmMessage.text = ""
                    binding.tvSaveTranslate.isEnabled = true
                    binding.tvSaveTranslate.alpha = 1f
                } else {
                    val englishWord: String = binding.etEnterWordForTranslate.text.toString()
                    val translateWord: String = binding.tvTranslatjngWord.text.toString()
                    val word = Word(englishWord = englishWord, translateWord = translateWord)
                    viewModel.insert(word)
                    binding.etEnterWordForTranslate.text.clear()
                    binding.tvTranslatjngWord.text = ""
                    binding.tvAlarmMessage.text = ""
                    binding.tvSaveTranslate.isEnabled = true
                    binding.tvSaveTranslate.alpha = 1f
                }
            } else {
                Toast.makeText(
                    requireActivity(), "No data!", Toast.LENGTH_SHORT).show()
            }
        }
        binding.tvDoTranslate.setOnClickListener {
            coroutineScope.launch(Dispatchers.Main) {
                binding.tvDoTranslate.background = resources.getDrawable(R.drawable.button_resource_two)
                delay(350)
                binding.tvDoTranslate.background = resources.getDrawable(R.drawable.button_resource)
            }
            if(binding.tvTranslatjngWord.text.isEmpty()){
                binding.progressBarEnglishTranslate.visibility = View.VISIBLE
            }
            if (binding.etEnterWordForTranslate.text.isNotEmpty()){
                text = binding.etEnterWordForTranslate.text.toString()
                if(binding.tvEnglish.text == Constants.ENG && binding.tvRussian.text == Constants.RUS){
                    prepareLangTransMode2()
                }else{
                    prepareLangTransMode()
                }
            } else {
                Toast.makeText(requireActivity(), "Write the word for translation!", Toast.LENGTH_SHORT).show()
            }
            val ims = activity?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            ims.hideSoftInputFromWindow(binding.etEnterWordForTranslate.windowToken, 0)
           hideSystemUI()
        }
       hideSystemUI()
    }
    @SuppressLint("SetTextI18n")
    private fun prepareLangTransMode() {
        val options = TranslatorOptions.Builder()
            .setSourceLanguage(TranslateLanguage.RUSSIAN)
            .setTargetLanguage(TranslateLanguage.ENGLISH)
            .build()
        russianEnglishTranslator = Translation.getClient(options)
        russianEnglishTranslator.downloadModelIfNeeded()
            .addOnSuccessListener {
                translateWord()
            }
            .addOnFailureListener { exception ->
                binding.tvTranslatjngWord.text = "Error: ${exception.message}"
            }
    }
    @SuppressLint("SetTextI18n")
    private fun prepareLangTransMode2() {
        val options = TranslatorOptions.Builder()
            .setSourceLanguage(TranslateLanguage.ENGLISH)
            .setTargetLanguage(TranslateLanguage.RUSSIAN)
            .build()
        englishRussianTranslator = Translation.getClient(options)
        englishRussianTranslator.downloadModelIfNeeded()
            .addOnSuccessListener {
                translateWord2()
            }
            .addOnFailureListener {exception ->
                binding.tvTranslatjngWord.text = "Error: ${exception.message}"
            }
    }
    @SuppressLint("SetTextI18n")
    private fun translateWord() {
        russianEnglishTranslator.translate(text)
            .addOnSuccessListener { translatedText ->
                binding.tvTranslatjngWord.text = translatedText
                binding.progressBarEnglishTranslate.visibility = View.GONE
                if(binding.tvTranslatjngWord.text == text){
                    binding.tvAlarmMessage.text = "There is no such word in this language!"
                    binding.tvSaveTranslate.isEnabled = false
                    binding.tvSaveTranslate.alpha = 0.5f
                } else {
                    binding.tvAlarmMessage.text = ""
                    binding.tvSaveTranslate.isEnabled = true
                    binding.tvSaveTranslate.alpha = 1f
                }
            }
            .addOnFailureListener { exception ->
                binding.tvSaveTranslate.text = "Error: ${exception.message}"
            }
    }
    @SuppressLint("SetTextI18n")
    private fun translateWord2() {
        englishRussianTranslator.translate(text)
            .addOnSuccessListener { translatedText ->
                binding.tvTranslatjngWord.text = translatedText
                binding.progressBarEnglishTranslate.visibility = View.GONE
                if(binding.tvTranslatjngWord.text == text){
                    binding.tvAlarmMessage.text = "There is no such word in this language!"
                    binding.tvSaveTranslate.isEnabled = false
                    binding.tvSaveTranslate.alpha = 0.5f
                } else {
                    binding.tvAlarmMessage.text = ""
                    binding.tvSaveTranslate.isEnabled = true
                    binding.tvSaveTranslate.alpha = 1f
                }
            }
            .addOnFailureListener { exception ->
                binding.tvTranslatjngWord.text = "Error: ${exception.message}"
            }
    }
    private val firstButtonListener: View.OnClickListener = View.OnClickListener {
        binding.tvEnglish.text = Constants.RUS
        binding.tvRussian.text = Constants.ENG
        binding.ivChangeLanguages.setOnClickListener(secondButtonListener)
    }
    private val secondButtonListener: View.OnClickListener = View.OnClickListener {
        binding.tvEnglish.text = Constants.ENG
        binding.tvRussian.text = Constants.RUS
        binding.ivChangeLanguages.setOnClickListener(firstButtonListener)
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