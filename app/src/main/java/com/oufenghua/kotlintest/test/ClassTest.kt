package com.oufenghua.kotlintest.test

private val GENDER_UNKNOWN: Int = 0
private val GENDER_MALE = 1
private val GENDER_FEMALE = 2

fun main() {
    var person = Person("Tom", 19, GENDER_MALE)
    println("$person")
    lateinit var student: Student
}

//类的声明，和 Java 无异
open class Person constructor() {

    protected lateinit var name: String
    protected var age: Int = 0
    protected var gender: Int = 0

    init {
        println("这是主构造函数的函数体")
    }

    constructor(name: String, age: Int, gender: Int) : this() {
        this.age = age
        this.gender = gender
        this.name = name
    }

    fun say(content: String) {
        println(content)
    }

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun toString(): String {
        return " Person age = $age; name = $name; gender = ${if (gender == 1) "男" else "女"}"
    }

}

class PrivateConstructor private constructor() {

    init {
        println("这是个私有构造函数")
    }

}

class Student : Person {

    var num = 0

    init {

    }

    constructor(name: String, age: Int, gender: Int) : super(name, age, gender) {
    }

    override fun toString(): String {
        return "Student " + super.toString()
    }
}

// 变量的覆盖 ， var 可以覆盖 val ，反之不行，因为 val 是声明了一个 getter， var 是再额外声明了一个 setter
abstract class Animal {

    open var name: String? = null

    // 重写 getter 和 setter
    var index: Int = 0
        get():Int {
            return 0
        }
        set(value) {
            println(field)
            index = value
        }

    abstract fun yak()
    abstract fun eat()
}
