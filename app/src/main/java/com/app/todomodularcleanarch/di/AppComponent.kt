package com.app.todomodularcleanarch.di

import android.app.Application
import com.app.login_ui.di.LoginActivityBindingModule
import com.app.todomodularcleanarch.TodoModularCleanArchApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidSupportInjectionModule::class, LoginActivityBindingModule::class])
interface AppComponent : AndroidInjector<TodoModularCleanArchApp> {

    @Component.Builder
    interface Builder {
        fun build(): AppComponent

        @BindsInstance
        fun application(application: Application): Builder

    }
}