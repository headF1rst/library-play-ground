package com.example.libraryplayground.user

import java.time.LocalDateTime

data class UserLoanHistory(
    val id: Long,
    val userId: Long,
    val bookName: String,
    val isReturned: Boolean,
    val dueDate: LocalDateTime,
)
