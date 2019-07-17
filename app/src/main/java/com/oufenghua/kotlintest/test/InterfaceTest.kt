package com.oufenghua.kotlintest.test

// 本文件可见
private const val FLAG1 : Int = 1

// 模块（一个工程内、Maven项目内）内可见
internal const val FLAG2 : Int = 2
// 默认为 public 随处可见
const val FLAG3 : Int = 3

fun main() {
    C.C_FLAG1
}

interface A {

    var index1: Int
    var index2: Int

    fun a()
    fun b()
}

interface B {
    fun c()
    fun d()
}

class C : A, B {

    companion object{
        const val C_FLAG1 = 0
        const val C_FLAG2 = 1
    }

    override var index2: Int = 0
        get() {
            field = 0
            return 0
        }
        set(value) {

        }
    override var index1: Int = 0
        get() {
            field = 0
            return 0
        }
        set(value) {

        }

    override fun a() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun b() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun c() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun d() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

object InterfaceTest2{
    const val C_FLAG1 = 0
    const val C_FLAG2 = 1
}