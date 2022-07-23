package com.example.simplemoviecatalog.services


import com.example.simplemoviecatalog.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApilnterface {
@GET("/3/movie/popular?api_key=bbf5a3000e95f1dddf266b5e187d4b21")
fun getMoviestList(): Call<MovieResponse>

}