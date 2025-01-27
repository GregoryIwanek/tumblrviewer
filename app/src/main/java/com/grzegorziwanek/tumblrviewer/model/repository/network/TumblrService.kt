package com.grzegorziwanek.tumblrviewer.model.repository.network

import com.grzegorziwanek.tumblrviewer.model.data.entity.Blog
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

interface TumblrService {

    @GET("{name}$API_READ_JSON")
    fun getBlogByName(@Path("name") name: String): Observable<Blog>

    companion object {
        private const val API_READ_JSON = ".tumblr.com/api/read/json"
    }
}