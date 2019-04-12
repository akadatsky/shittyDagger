package com.company.shittydagger.util

import timber.log.Timber
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class StorageManager @Inject constructor() {

    fun store() {
        Timber.i("asdf: store")
    }

}