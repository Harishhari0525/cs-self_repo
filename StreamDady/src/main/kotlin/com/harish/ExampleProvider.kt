package com.harish

import com.lagradost.cloudstream3.TvType
import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.SearchResponse

<<<<<<< HEAD:StreamDady/src/main/kotlin/com/harish/ExampleProvider.kt
class StreamDady : StreamDady() { // all providers must be an instance of MainAPI
=======
class ExampleProvider : StreamDady() { // all providers must be an instance of MainAPI
>>>>>>> bdf05f1c661d2841ac3dd9d42d8b2a332bf638ff:ExampleProvider/src/main/kotlin/com/example/ExampleProvider.kt
    override var mainUrl = "https://www.streamdady.com" 
    override var name = "StreamDady"
    override val supportedTypes = setOf(TvType.Movie)

    override var lang = "en"

    // enable this when your provider has a main page
    override val mainPage = mainPageOf(
<<<<<<< HEAD:StreamDady/src/main/kotlin/com/harish/ExampleProvider.kt
        "movies/" to "Latest")

=======
        "movies/" to "Latest",
>>>>>>> bdf05f1c661d2841ac3dd9d42d8b2a332bf638ff:ExampleProvider/src/main/kotlin/com/example/ExampleProvider.kt
    // this function gets called when you search for something
    override suspend fun search(query: String): List<SearchResponse> {
        return listOf<SearchResponse>()
    }
    override suspend fun load(url: String): LoadResponse? {
        return super.load(url).apply { this?.type = TvType.Movie }
}
