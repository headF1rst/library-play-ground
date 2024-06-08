package com.example.libraryplayground.user

class UserRegisterResponse(
    val name: String
) {
    companion object {
        fun of(user: User): UserRegisterResponse {
            return UserRegisterResponse(user.name)
        }
    }

}
