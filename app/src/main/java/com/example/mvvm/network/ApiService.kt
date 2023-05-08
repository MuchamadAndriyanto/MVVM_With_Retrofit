package com.example.mvvm.network

import com.example.mvvm.model.GetAllUserItem
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("user")
    fun getAllUser() : Call<List<GetAllUserItem>>

}