package com.example.profilecardlayout

data class UserProfile constructor(val name:String, val status: Boolean, val drawableId:Int)

val userProfileList = arrayListOf(
    UserProfile(name = "Ben", status = true, drawableId = R.drawable.profile),
    UserProfile(name = "Jonas", status = false, drawableId = R.drawable.profile),
    UserProfile(name = "Jina", status = true, drawableId = R.drawable.profile),
    UserProfile(name = "Keninha", status = true, drawableId = R.drawable.profile),
    UserProfile(name = "Brazuca", status = true, drawableId = R.drawable.profile),
    UserProfile(name = "Clever", status = false, drawableId = R.drawable.profile),
    UserProfile(name = "Almaral", status = true, drawableId = R.drawable.profile),
    UserProfile(name = "Ozio", status = false, drawableId = R.drawable.profile),
    UserProfile(name = "Binario", status = false, drawableId = R.drawable.profile),
    UserProfile(name = "Ternario", status = false, drawableId = R.drawable.profile),
)