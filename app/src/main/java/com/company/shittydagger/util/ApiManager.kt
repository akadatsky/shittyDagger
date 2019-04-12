package com.company.shittydagger.util

import timber.log.Timber
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ApiManager @Inject constructor() {

    fun test() {
        Timber.i("asdf: test")
    }

}