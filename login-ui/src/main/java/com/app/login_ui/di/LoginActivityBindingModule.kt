package com.app.login_ui.di

import com.app.login_ui.LoginActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class LoginActivityBindingModule {


    @ContributesAndroidInjector
    abstract fun bindLoginActivity(): LoginActivity
}
