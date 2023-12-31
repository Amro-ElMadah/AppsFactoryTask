package com.tasks.appsfactorytask.data.remote.network.retrofit

import com.tasks.appsfactorytask.data.remote.network.response.ArtistAlbumsResponse
import com.tasks.appsfactorytask.data.remote.network.response.ArtistSearchResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface LastFMServiceAPI {
    @GET("2.0/?method=artist.search&format=json")
    fun search(@Query("artist") artist: String, @Query("page") page: Int, @Query("limit") limit: Int, @Query("api_key") apiKey: String): Single<ArtistSearchResponse>

    @GET("2.0/?method=artist.gettopalbums&format=json")
    fun getArtistAlbums(@Query("artist") artist: String, @Query("api_key") apiKey: String): Single<ArtistAlbumsResponse>
}