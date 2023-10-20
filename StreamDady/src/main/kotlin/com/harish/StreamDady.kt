package com.harish

import com.lagradost.cloudstream3.TvType
import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.SearchResponse


class StreamDady : MainAPI() 
{ // all providers must be an instance of MainAPI

    override var mainUrl = "https://www.streamdady.com" 
    override var name = "StreamDady"
    override var lang = "en"
    override val supportedTypes = setOf(
            TvType.Movie,
        )

    // enable this when your provider has a main page
    override val hasMainPage = true
    //override val mainPage = mainPageOf(
      //  "movies/" to "Latest",)

    // this function gets called when you search for something
   // override suspend fun search(query: String): List<SearchResponse> {
     //   return listOf<SearchResponse>()
    //}
    //override suspend fun load(url: String): LoadResponse? {
      //  return super.load(url).apply { this?.type = TvType.Movie }
}
