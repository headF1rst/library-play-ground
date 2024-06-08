package com.example.libraryplayground.user

import com.example.libraryplayground.support.ApiResponse
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
    private val userUseCase: UserUseCase,
) {

    @PostMapping("/user")
    fun registerUser(
        @RequestBody request: UserRegisterRequest,
    ): ApiResponse<UserRegisterResponse> {
        val user = userUseCase.register(request.toDomain())
        return ApiResponse.success(UserRegisterResponse.of(user))
    }
}
