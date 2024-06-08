package com.example.libraryplayground.user

import org.springframework.stereotype.Component

@Component
class UserAppender(
    private val userRepository: UserRepository,
) {
    fun add(user: User): User {
        return userRepository.register(user.name, user.age!!)
    }
}
