package com.azimuton.foreign.fragments.spain

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.fragment.app.activityViewModels
import com.azimuton.domain.models.english.Word
import com.azimuton.domain.models.spain.WordSpain
import com.azimuton.foreign.Constants
import com.azimuton.foreign.R
import com.azimuton.foreign.databinding.FragmentTranslaterBinding
import com.azimuton.foreign.databinding.FragmentTranslaterSpainBinding
import com.azimuton.foreign.databinding.FragmentWriteBinding
import com.azimuton.foreign.fragments.english.TranslaterFragment
import com.azimuton.foreign.viewmodels.english.TranslaterViewModel
import com.azimuton.foreign.viewmodels.spain.TranslateSpainViewModel
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
class TranslaterSpainFragment : Fragment() {
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    lateinit var binding : FragmentTranslaterSpainBinding
    private lateinit var  russianSpainTranslator : com.google.mlkit.nl.translate.Translator
    private lateinit var  spainRussianTranslator : com.google.mlkit.nl.translate.Translator
    var text : String = ""
    private val viewModel : TranslateSpainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTranslaterSpainBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.ivChangeLanguagesSpain.setOnClickListener(firstButtonListener)
        binding.ivClearETSpain.setOnClickListener {
            binding.etEnterWordForTranslateSpain.text.clear()
            binding.tvTranslatjngWordSpain.text = ""
            binding.tvAlarmMessageSpain.text = ""
            binding.tvSaveTranslateSpain.isEnabled = true
            binding.tvSaveTranslateSpain.alpha = 1f
            hideSystemUI()
        }
        binding.tvSaveTranslateSpain.setOnClickListener {
            coroutineScope.launch(Dispatchers.Main) {
                binding.tvSaveTranslateSpain.background = resources.getDrawable(R.drawable.button_resource_two)
                delay(350)
                binding.tvSaveTranslateSpain.background = resources.getDrawable(R.drawable.button_resource)
            }
            if (binding.etEnterWordForTranslateSpain.text.isNotEmpty() && binding.tvTranslatjngWordSpain.text.isNotEmpty()) {
                if(binding.tvSpain.text == Constants.SPN && binding.tvRussian.text == Constants.RUS){
                    val spainWord: String = binding.etEnterWordForTranslateSpain.text.toString()
                    val translateSpainWord: String = binding.tvTranslatjngWordSpain.text.toString()
                    val word = WordSpain(spainWord = spainWord, translateSpainWord = translateSpainWord)
                    viewModel.insert(word)
                    binding.etEnterWordForTranslateSpain.text.clear()
                    binding.tvTranslatjngWordSpain.text = ""
                    binding.tvAlarmMessageSpain.text = ""
                    binding.tvSaveTranslateSpain.isEnabled = true
                    binding.tvSaveTranslateSpain.alpha = 1f
                } else {
                    val spainWord: String = binding.etEnterWordForTranslateSpain.text.toString()
                    val translateSpainWord: String = binding.tvTranslatjngWordSpain.text.toString()
                    val word = WordSpain(spainWord = spainWord, translateSpainWord = translateSpainWord)
                    viewModel.insert(word)
                    binding.etEnterWordForTranslateSpain.text.clear()
                    binding.tvTranslatjngWordSpain.text = ""
                    binding.tvAlarmMessageSpain.text = ""
                    binding.tvSaveTranslateSpain.isEnabled = true
                    binding.tvSaveTranslateSpain.alpha = 1f
                }
            } else {
                Toast.makeText(
                    requireActivity(), "No data !", Toast.LENGTH_SHORT).show()
            }
        }
        binding.tvDoTranslateSpain.setOnClickListener {
            coroutineScope.launch(Dispatchers.Main) {
                binding.tvDoTranslateSpain.background = resources.getDrawable(R.drawable.button_resource_two)
                delay(350)
                binding.tvDoTranslateSpain.background = resources.getDrawable(R.drawable.button_resource)
            }
            if (binding.etEnterWordForTranslateSpain.text.isNotEmpty()){
                text = binding.etEnterWordForTranslateSpain.text.toString()
                if(binding.tvSpain.text == Constants.SPN && binding.tvRussian.text == Constants.RUS){
                    prepareLangTransMode2()
                }else{
                    prepareLangTransMode()
                }
            } else {
                Toast.makeText(requireActivity(), "Write the word for translation!", Toast.LENGTH_SHORT).show()
            }
            val ims = activity?.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            ims.hideSoftInputFromWindow(binding.etEnterWordForTranslateSpain.windowToken, 0)
            hideSystemUI()
            if(binding.tvTranslatjngWordSpain.text.isEmpty()){
                binding.progressBarSpainTranslate.visibility = View.VISIBLE
            }
        }
        hideSystemUI()
    }
    @SuppressLint("SetTextI18n")
    private fun prepareLangTransMode() {
        val options = TranslatorOptions.Builder()
            .setSourceLanguage(TranslateLanguage.RUSSIAN)
            .setTargetLanguage(TranslateLanguage.SPANISH)
            .build()
        russianSpainTranslator = Translation.getClient(options)
        russianSpainTranslator.downloadModelIfNeeded()
            .addOnSuccessListener {
                translateWord()
            }
            .addOnFailureListener { exception ->
                binding.tvTranslatjngWordSpain.text = "Error: ${exception.message}"
            }
    }
    @SuppressLint("SetTextI18n")
    private fun prepareLangTransMode2() {
        val options = TranslatorOptions.Builder()
            .setSourceLanguage(TranslateLanguage.SPANISH)
            .setTargetLanguage(TranslateLanguage.RUSSIAN)
            .build()
        spainRussianTranslator = Translation.getClient(options)
        spainRussianTranslator.downloadModelIfNeeded()
            .addOnSuccessListener {
                translateWord2()
            }
            .addOnFailureListener {exception ->
                binding.tvTranslatjngWordSpain.text = "Error: ${exception.message}"
            }
    }
    @SuppressLint("SetTextI18n")
    private fun translateWord() {
        russianSpainTranslator.translate(text)
            .addOnSuccessListener { translatedText ->
                binding.tvTranslatjngWordSpain.text = translatedText
                binding.progressBarSpainTranslate.visibility = View.GONE
                if(binding.tvTranslatjngWordSpain.text == text){
                    binding.tvAlarmMessageSpain.text = "There is no such word in this language!"
                    binding.tvSaveTranslateSpain.isEnabled = false
                    binding.tvSaveTranslateSpain.alpha = 0.5f
                } else {
                    binding.tvAlarmMessageSpain.text = ""
                    binding.tvSaveTranslateSpain.isEnabled = true
                    binding.tvSaveTranslateSpain.alpha = 1f
                }
            }
            .addOnFailureListener { exception ->
                binding.tvSaveTranslateSpain.text = "Error: ${exception.message}"
            }
    }
    @SuppressLint("SetTextI18n")
    private fun translateWord2() {
        spainRussianTranslator.translate(text)
            .addOnSuccessListener { translatedText ->
                binding.tvTranslatjngWordSpain.text = translatedText
                binding.progressBarSpainTranslate.visibility = View.GONE
                if(binding.tvTranslatjngWordSpain.text == text){
                    binding.tvAlarmMessageSpain.text = "There is no such word in this language!"
                    binding.tvSaveTranslateSpain.isEnabled = false
                    binding.tvSaveTranslateSpain.alpha = 0.5f
                } else {
                    binding.tvAlarmMessageSpain.text = ""
                    binding.tvSaveTranslateSpain.isEnabled = true
                    binding.tvSaveTranslateSpain.alpha = 1f
                }
            }
            .addOnFailureListener { exception ->
                binding.tvTranslatjngWordSpain.text = "Error: ${exception.message}"
            }
    }
    private val firstButtonListener: View.OnClickListener = View.OnClickListener {
        binding.tvSpain.text = Constants.RUS
        binding.tvRussian.text = Constants.SPN
        binding.ivChangeLanguagesSpain.setOnClickListener(secondButtonListener)
    }
    private val secondButtonListener: View.OnClickListener = View.OnClickListener {
        binding.tvSpain.text = Constants.SPN
        binding.tvRussian.text = Constants.RUS
        binding.ivChangeLanguagesSpain.setOnClickListener(firstButtonListener)
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