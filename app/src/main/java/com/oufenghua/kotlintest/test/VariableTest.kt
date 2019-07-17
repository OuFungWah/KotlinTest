package com.oufenghua.kotlintest.test


// TODO 自从 Kotlin 1.3 后，main 函数中的参数已经不需要了

// main 函数
fun main() {
    var num = 1
    println("$num")

    // 类型，数字类型与 Java 无异，Int Short Long Float Double Byte
    var int1 = 0
    var long1 = 0L
    var double1 = 0.0
    var float1 = 0f

    var long2 = 0x001L

    // 数字可以增加下划线
    var long3 = 999_999_999_999

    println("$long3")
    println("${plus(9, 9)}")

    //变量与常量
//    var 用与声明变量，变量即科多次改变的值
//    val 用于声明常量，常量即只能在开始时赋值，其后不可改变的值
    val flag1 = 0
    var variable1 = 200
//    flag1 = 1  是编译错误的

    // 在类型后面添加 '?' 表示该变量可以为空
    var string: String?
    string = "我是一个字符串"
    println(string)
    string = null
    println(string)

    // 类型检测使用 'is' 关键字， 或 '!is'
    // Any，类似于 Object
    var obj : Any
    obj = "哈哈哈哈哈"
    if( obj is String){
        println("$obj 是一个字符串并且长度为${obj.length}")
    }

}

// 函数的声明： fun+[函数名]+(参数列表)+[: 返回值] {}
fun plus(a: Int, b: Int): Int {
    return a + b
}

fun noReturn(): Unit {
//    无返回值
    return
}