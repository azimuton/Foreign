package com.azimuton.data.networkstorage.apimodelsentity.spain

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface APISpain {

    //@GET("news?apikey=pub_1638954bac6dfcdfc508f94376b23f3b73d69&category=sports,top,science,technology,health&country=gb&size=10")
    //@GET("everything?q=Apple&from=2024-01-29&sortBy=popularity&apiKey=0ad4ff2c9ba5409693b869d6a70ca0cf")
    @GET("top-headlines?country=br&category=business&apiKey=0ad4ff2c9ba5409693b869d6a70ca0cf")
    fun getSpainNews() : Call<com.azimuton.domain.apimodels.spain.News>

    companion object {

        //var BASE_URL = "https://newsdata.io/api/1/"
        var BASE_URL = "https://newsapi.org/v2/"

        fun create() : APISpain {

            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(APISpain::class.java)

        }
    }
}