package com.oufenghua.kotlintest

interface IMainActivityPresenter {

    fun getInfo(): List<User>
    fun addUser(user: User)
    fun removeUser(user: User): Boolean
    fun notifyUI()

}