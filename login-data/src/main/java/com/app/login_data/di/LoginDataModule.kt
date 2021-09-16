package com.app.login_data.di

import com.app.login_data.LoginRepositoryImpl
import com.app.login_domain.repo.LoginRepository
import dagger.Binds
import dagger.Module

@Module
abstract class LoginDataModule {

    @Binds
    abstract fun bindLoginRepository(loginRepositoryImpl: LoginRepositoryImpl): LoginRepository
}