package com.example.libraryplayground.user

import org.springframework.stereotype.Repository

@Repository
internal class UserEntityRepository(
    private val userJpaRepository: UserJpaRepository,
): UserRepository {
    override fun register(name: String, age: Int): User {
        return userJpaRepository.save(
            UserEntity(
                name = name,
                age = age,
            )
        ).toDomain()
    }
}
