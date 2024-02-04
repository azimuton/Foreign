package com.azimuton.data.networkstorage.apimodelsentity.spain

import com.azimuton.data.networkstorage.RetrofitClient
import com.azimuton.domain.apimodels.english.News
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GetSpainNewsDataSource: SpainNewsDataSource {
    override  fun getSpainNews() {
        val retrofit = RetrofitClient()
            .getClient("https://newsdata.io/api/1/")
            .create(APISpain::class.java)
        retrofit.getSpainNews().enqueue(object : Callback<com.azimuton.domain.apimodels.spain.News> {
            override fun onResponse(
                call: Call<com.azimuton.domain.apimodels.spain.News>,
                response: Response<com.azimuton.domain.apimodels.spain.News>
            ) {
                response.body().let {
                    it?.let { }
                }
            }

            override fun onFailure(
                call: Call<com.azimuton.domain.apimodels.spain.News>,
                t: Throwable) {

            }
        })
    }
    }
