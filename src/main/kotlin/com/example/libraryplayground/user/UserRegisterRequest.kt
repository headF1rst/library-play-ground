package com.example.libraryplayground.user

data class UserRegisterRequest(
    val name: String,
    val age: Int,
) {
    fun toDomain(): User {
        return User(name = name, age = age)
    }
}
