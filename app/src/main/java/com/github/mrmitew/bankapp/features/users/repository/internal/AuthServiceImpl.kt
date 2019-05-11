package com.github.mrmitew.bankapp.features.users.repository.internal

import com.github.mrmitew.bankapp.features.users.repository.AuthService
import com.github.mrmitew.bankapp.features.users.repository.RemoteUserRepository

class AuthServiceImpl(private val remoteUserRepository: RemoteUserRepository) :
    AuthService {
    override suspend fun getToken(username: String): String {
        // TODO: Implement inflight request caching
        return remoteUserRepository.getToken(username)
    }
}