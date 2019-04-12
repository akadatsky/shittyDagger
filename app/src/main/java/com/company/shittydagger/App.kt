package com.company.shittydagger

import com.company.shittydagger.di.AppComponent
import com.company.shittydagger.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import timber.log.Timber

class App : DaggerApplication() {

    companion object {
        lateinit var injector: AppComponent
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        injector = DaggerAppComponent.builder().application(this).build()
        Timber.i("asdf: applicationInjector")
        return injector
    }

    override fun onCreate() {
        if (BuildConfig.DEBUG) {
            Timber.plant(object : Timber.DebugTree() {
                override fun createStackElementTag(element: StackTraceElement): String {
                    return super.createStackElementTag(element) + "~" + element.lineNumber
                }
            })
        }
        super.onCreate()
        Timber.i("asdf: App.onCreate")
    }

}