package com.example.libraryplayground.user.e2e

import com.example.libraryplayground.ApiTest
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test
import org.springframework.http.HttpStatus

class UserApiTest: ApiTest() {

    @Test
    fun `신규 회원등록`() {
        val response = UserSteps.회원등록요청(UserSteps.`등록할 회원 정보 생성`())

        response.statusCode() shouldBe HttpStatus.OK.value()
    }
}
