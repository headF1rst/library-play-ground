package com.example.libraryplayground.user

data class User(
    val id: Long? = null,
    val name: String,
    val nickName: NickName? = null,
    val age: Int? = null,
    val userLoanHistories: List<UserLoanHistory>? = emptyList(),
)
