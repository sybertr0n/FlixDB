package com.ab.flixdb.network

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SearchResult(
    @Json(name = "Search")
    val search: List<FlixInfoShort>,

    val totalResults: String,

    @Json(name = "Response")
    val response: String
)


data class FlixInfoShort(
    @Json(name = "Title")
    val title: String,

    @Json(name = "Year")
    val year: String,

    @Json(name = "imdbID")
    val imdbId: String,

    @Json(name = "Type")
    val type: String,

    @Json(name = "Poster")
    val poster: String
)