package com.example.sampleprojectarchitecture.ni.retrofit

import com.example.sampleprojectarchitecture.util.constants.Constants
import retrofit2.Call
import retrofit2.http.GET
/**
 * Created by Darshan Patel 24/02/2020
 * Usage: list all your network api here withtheir request and response parameter
 * How to call: with instance of MainApiInterface and call method to access the api
 * Useful parameter: response and request classes of respective methods
 */
interface MainApiInterface {

    @GET(Constants.ApiEndpoints.MAIN_API)
    fun mainApiCall(): Call<String>
}