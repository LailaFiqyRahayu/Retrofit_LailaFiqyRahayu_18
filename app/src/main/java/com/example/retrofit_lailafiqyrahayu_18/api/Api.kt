package com.example.retrofit_lailafiqyrahayu_18.api

import com.example.retrofit_lailafiqyrahayu_18.model.IndonesiaResponse
import com.example.retrofit_lailafiqyrahayu_18.model.ProvinceResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api{
    @GET ("https://learn-retrofit-data.netlify.app/casenumber.json")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>

    @GET ("https://learn-retrofit-data.netlify.app/casenumberprovince.json")
    fun getProvince(): Call<ArrayList<ProvinceResponse>>
}
