package com.example.i_cuisinier

class UserProfile {
    data class UserProfile(val name: String, val email: String, val preferences: MutableSet<String>)


}