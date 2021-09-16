package com.app.login_domain.usecase

import com.app.login_domain.repo.LoginRepository
import javax.inject.Inject

class LoginUseCaseImpl @Inject constructor(private val repository: LoginRepository) : LoginUseCase {
}