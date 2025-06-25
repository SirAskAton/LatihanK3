package com.example.latihank3.auth

data class User(
    val fullName: String,
    val username: String,
    val email: String,
    val password: String
)

object AuthState {
    var registeredUser: User? = null
}
