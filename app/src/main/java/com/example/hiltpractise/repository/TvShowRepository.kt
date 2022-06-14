package com.example.hiltpractise

import javax.inject.Inject

class TvShowRepository
@Inject
constructor(private val apiService: ApiService) {
    suspend fun getTvShows() = apiService.getTvShows()
}