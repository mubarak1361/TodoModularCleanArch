package com.app.todomodularcleanarch

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class TodoModularCleanArchApp : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication>? {
        return null
    }
}