package com.example.hiltpractise


import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET(Constants.END_POINT)
    suspend fun getTvShows():Response<TvShowResponse>

}