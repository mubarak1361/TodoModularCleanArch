package com.app.login_domain.di

import com.app.login_domain.usecase.LoginUseCase
import com.app.login_domain.usecase.LoginUseCaseImpl
import dagger.Binds
import dagger.Module

@Module
abstract class LoginDomainModule {

    @Binds
    abstract fun bindLoginUseCase(loginUseCaseImpl: LoginUseCaseImpl):LoginUseCase
}