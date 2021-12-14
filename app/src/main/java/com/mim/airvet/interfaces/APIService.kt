package com.mim.airvet.interfaces

import com.mim.airvet.classes.Users
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface APIService {

    /* @GET("5")
     fun getUsers(@Path("path") path: String?): Observable<Users>
 */

    @GET("/api/?results=5")
    fun getUsers(): Observable<Users>

}