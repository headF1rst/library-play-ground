package com.example.libraryplayground.user

import org.springframework.stereotype.Service

@Service
class UserService(
    private val userAppender: UserAppender,
): UserUseCase {
    override fun register(user: User): User {
        return userAppender.add(user)
    }
}
