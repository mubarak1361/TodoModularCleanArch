package com.app.todomodularcleanarch

import com.app.todomodularcleanarch.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class TodoModularCleanArchApp : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().application(this).build()
    }
}