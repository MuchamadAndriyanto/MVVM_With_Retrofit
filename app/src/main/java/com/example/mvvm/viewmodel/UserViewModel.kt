package com.example.mvvm.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm.model.GetAllUserItem
import com.example.mvvm.network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class UserViewModel : ViewModel(){
    var liveDataNews : MutableLiveData<List<GetAllUserItem>?> = MutableLiveData()

    fun callApiNews(){
        ApiClient.instance.getAllUser().enqueue(object : Callback<List<GetAllUserItem>> {
            override fun onResponse(
                call: Call<List<GetAllUserItem>>,
                response: Response<List<GetAllUserItem>>
            ) {
                if (response.isSuccessful) {
                    liveDataNews.postValue(response.body())
                } else {
                    liveDataNews.postValue(null)
                }
            }

            override fun onFailure(call: Call<List<GetAllUserItem>>, t: Throwable) {
                liveDataNews.postValue(null)
            }
        })
    }

}
