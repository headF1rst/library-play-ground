package com.example.libraryplayground.user

interface UserRepository {

    fun register(name: String, age: Int): User
}
