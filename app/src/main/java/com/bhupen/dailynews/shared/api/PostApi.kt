package com.bhupen.dailynews.shared.api

/**
 * Created by Bhupen on 17/03/2018.
 */
import com.bhupen.dailynews.dataType.model.Post
import io.reactivex.Observable
import retrofit2.http.GET

/**
 * The interface which provides methods to get result of webservices
 */
interface PostApi {
    /**
     * Get the list of the pots from the API
     */
    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}