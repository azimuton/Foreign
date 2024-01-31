package com.azimuton.foreign.fragments.english

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.azimuton.data.networkstorage.apimodelsentity.english.API
import com.azimuton.data.networkstorage.RetrofitClient
import com.azimuton.domain.apimodels.english.News
import com.azimuton.domain.apimodels.english.Result
import com.azimuton.domain.usecase.english.GetNewsUseCase
import com.azimuton.foreign.R
import com.azimuton.foreign.fragments.english.adapters.NewsAdapter
import com.azimuton.foreign.databinding.FragmentNewsBinding
import com.azimuton.foreign.viewmodels.NewsDataViewModel
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
class NewsFragment : Fragment() {
    private val coroutineScope = CoroutineScope(Dispatchers.Main + Job())

    @Inject
    lateinit var getNewsUseCase : GetNewsUseCase
    private lateinit var binding: FragmentNewsBinding
    lateinit var newsList: ArrayList<News>
    lateinit var resultList: ArrayList<Result>
    private val dataModel: NewsDataViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewsBinding.inflate(inflater, container, false)
        return binding.root
    }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val isLoaded = true
        if (isLoaded) {
            binding.rvNews.visibility = View.VISIBLE
            val retrofit = RetrofitClient()
                .getClient("https://newsdata.io/api/1/")
                //.getClient("https://newsapi.org/v2/")
                .create(API::class.java)
            coroutineScope.launch(Dispatchers.Main) {
                retrofit.getNews().enqueue(object : Callback<News>, NewsAdapter.ItemClickListener {
                    override fun onResponse(call: Call<News>, response: Response<News>) {
                        newsList = ArrayList<News>()
                        val adapter = NewsAdapter(
                            requireActivity(), response.body()!!.results, this
                        )
                        binding.rvNews.layoutManager = LinearLayoutManager(context)
                        binding.rvNews.adapter = adapter
                        binding.progressBar.visibility = View.GONE
                    }
                    override fun onFailure(call: Call<News>, t: Throwable) {

                    }
                    override fun onItemClick(position: Int) {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.replace(R.id.flMain, NewsDetailsFragment())
                            ?.commit()
                    }
                    override fun details(position: Int, listNews: List<Result>) {
                        dataModel.vmTitle.value = listNews[position].title
                        dataModel.vmDesc.value = listNews[position].description
                        dataModel.vmContent.value = listNews[position].content
                        dataModel.vmImage.value = listNews[position].image_url
                    }
                })
            }
        }
        val  w : Window? = activity?.window
        w?.decorView?.systemUiVisibility = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
    }
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        val isLoaded = true
//        if (isLoaded) {
//            binding.rvNews.visibility = View.VISIBLE
//            newsList = ArrayList<News>()
//            val adapter = NewsAdapter(
//                requireActivity(), getNewsUseCase.execute(), this
//            )
//            binding.rvNews.layoutManager = LinearLayoutManager(context)
//            binding.rvNews.adapter = adapter
//            binding.progressBar.visibility = View.GONE
//        }
//        val  w : Window? = activity?.window
//        w?.decorView?.systemUiVisibility = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // скрываем нижнюю панель навигации
//                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY) //появляется поверх активити и исчезает
//    }

//    override fun onItemClick(position: Int) {
//        activity?.supportFragmentManager
//            ?.beginTransaction()
//            ?.replace(R.id.flMain, NewsDetailsFragment())
//            ?.commit()
//    }
//
//    override fun details(position: Int, listNews: List<Result>) {
//        dataModel.vmTitle.value = listNews[position].title
//        dataModel.vmDesc.value = listNews[position].description
//        dataModel.vmContent.value = listNews[position].content
//        dataModel.vmImage.value = listNews[position].image_url
//    }

}


