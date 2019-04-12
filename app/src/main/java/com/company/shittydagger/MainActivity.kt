package com.company.shittydagger

import android.os.Bundle
import com.company.shittydagger.util.ApiManager
import dagger.android.support.DaggerAppCompatActivity
import timber.log.Timber
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var apiManager: ApiManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Timber.i("asdf: MainActivity.onCreate")

        apiManager.test()
    }

}
