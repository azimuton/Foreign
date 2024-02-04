package com.azimuton.foreign.fragments.spain

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.azimuton.data.networkstorage.RetrofitClient
import com.azimuton.data.networkstorage.apimodelsentity.english.API
import com.azimuton.data.networkstorage.apimodelsentity.spain.APISpain
import com.azimuton.domain.apimodels.english.News
import com.azimuton.domain.apimodels.english.Result
import com.azimuton.domain.apimodels.spain.Article
import com.azimuton.domain.usecase.english.GetNewsUseCase
import com.azimuton.domain.usecase.spain.SpainGetNewsUseCase
import com.azimuton.foreign.R
import com.azimuton.foreign.databinding.FragmentNewsBinding
import com.azimuton.foreign.databinding.FragmentNewsSpainBinding
import com.azimuton.foreign.fragments.english.NewsDetailsFragment
import com.azimuton.foreign.fragments.english.adapters.NewsAdapter
import com.azimuton.foreign.fragments.spain.adapters.NewsSpainAdapter
import com.azimuton.foreign.viewmodels.english.NewsDataViewModel
import com.azimuton.foreign.viewmodels.spain.NewsDataSpainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@AndroidEntryPoint
class NewsSpainFragment : Fragment() {
    lateinit var binding: FragmentNewsSpainBinding
    private val coroutineScope = CoroutineScope(Dispatchers.IO + Job())
    @Inject
    lateinit var getNewsUseCase : SpainGetNewsUseCase
    lateinit var newsList: ArrayList<com.azimuton.domain.apimodels.spain.News>
    lateinit var resultList: ArrayList<Article>
    private val dataModel: NewsDataSpainViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewsSpainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val isLoaded = true
        if (isLoaded) {
            binding.rvNewsSpain.visibility = View.VISIBLE
            val retrofit = RetrofitClient()
                //.getClient("https://newsdata.io/api/1/")
                .getClient("https://newsapi.org/v2/")
                .create(APISpain::class.java)
            coroutineScope.launch(Dispatchers.Main) {
                retrofit.getSpainNews().enqueue(object : Callback<com.azimuton.domain.apimodels.spain.News>,
                    NewsSpainAdapter.ItemClickListener {
                    override fun onResponse(
                        call: Call<com.azimuton.domain.apimodels.spain.News>,
                        response: Response<com.azimuton.domain.apimodels.spain.News>) {
                        newsList = ArrayList<com.azimuton.domain.apimodels.spain.News>()
                        val adapter = NewsSpainAdapter(
                            requireActivity(), response.body()!!.articles, this)
                        binding.rvNewsSpain.layoutManager = LinearLayoutManager(context)
                        binding.rvNewsSpain.adapter = adapter
                        binding.progressBarSpain.visibility = View.GONE
                    }

                    override fun onFailure(call: Call<com.azimuton.domain.apimodels.spain.News>, t: Throwable) {

                    }
                    override fun onItemClick(position: Int) {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.replace(R.id.flMain, NewsDetailsSpainFragment())
                            ?.commit()
                    }
                    override fun details(position: Int, listNews: List<Article>) {
                        dataModel.vmsTitle.value = listNews[position].title
                        dataModel.vmsDesc.value = listNews[position].description
                        dataModel.vmsContent.value = listNews[position].content
                        dataModel.vmsImage.value = listNews[position].urlToImage
                    }


                })
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