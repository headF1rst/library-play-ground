package com.example.libraryplayground.user.e2e

import com.example.libraryplayground.user.UserRegisterRequest
import io.restassured.RestAssured
import io.restassured.response.ExtractableResponse
import io.restassured.response.Response
import org.springframework.http.MediaType

class UserSteps {

    companion object {
        fun 회원등록요청(request: UserRegisterRequest): ExtractableResponse<Response> {
            return RestAssured.given().log().all()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body(request)
                .`when`()
                .post("/user")
                .then()
                .log().all().extract()
        }

        fun `등록할 회원 정보 생성`(): UserRegisterRequest {
            return UserRegisterRequest(
                name = "홍길동",
                age = 20
            )
        }
    }
}
