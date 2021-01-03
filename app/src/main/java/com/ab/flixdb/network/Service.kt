package com.ab.flixdb.network


import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

private const val BASE_URL = "https://omdbapi.com"

interface FlixService {

    @GET("/")
    fun getFlix(@Query("apikey") apiKey: String = "thewdb",
                @Query("s") searchString: String): SearchResult
}

private val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

object Network {

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .build()

    val flix = retrofit.create(FlixService::class.java)
}