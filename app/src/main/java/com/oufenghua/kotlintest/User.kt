package com.oufenghua.kotlintest

data class User(var name: String,var age: Int,var gender : Int) {

    companion object{
        var GENDER_UNKNOWN = 0
        var GENDER_MALE = 1
        var GENDER_FEMALE = 2
    }

}