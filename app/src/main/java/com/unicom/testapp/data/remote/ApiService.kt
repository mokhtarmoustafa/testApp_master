package com.unicom.testapp.data.remote

import com.unicom.testapp.BuildConfig
import com.unicom.testapp.ui.gallery.model.GalleryPhotoResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiService {

    companion object {
        const val BASE_URL="https://api.unsplash.com/"
        const val CLIENT_ID = BuildConfig.UNSPLAH_ACCESS_KEY
    }

    @Headers("Accept-Version: V1", "Authorization: Client-ID $CLIENT_ID")
    @GET("search/photos")
    suspend fun getAllPhotos(
        @Query("query") query: String,
        @Query("page") page: Int,
        @Query("per_page") per_page: Int

    ): GalleryPhotoResponse
}