package com.example.myapplication

import MyData
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("users?page=1")
    fun  getUserData() : Call<MyData>

}