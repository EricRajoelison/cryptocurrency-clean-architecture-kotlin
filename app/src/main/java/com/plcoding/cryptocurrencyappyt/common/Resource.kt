package com.plcoding.cryptocurrencyappyt.common

/**
 * Created by Eric Rajoelison on 28/02/2023.
 */
sealed class Resource<T> (val data: T?= null, val message: String?  = null){
    class Success<T> (data: T) : Resource<T> (data)
    class Error<T>(message:  String) : Resource<T>(message= message)
    class Loading<T>(data: T? = null) : Resource<T>(data)
}