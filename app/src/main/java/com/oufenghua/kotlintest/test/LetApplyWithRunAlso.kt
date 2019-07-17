package com.oufenghua.kotlintest.test

fun main() {

//    LetApplyWithRunAlso().testApply()

    LetApplyWithRunAlso().testWith()

//    LetApplyWithRunAlso().testRun()

//    LetApplyWithRunAlso().testTag()

}

class LetApplyWithRunAlso {

    fun testLet() {
        var value = "Test".let { string ->
            println(this)
            println(string)
            println(string.substring(1, 2))
            println(string.length)
            string
        }
    }

    fun testApply() {
        TestClass().apply {
            this.speakPublically()
        }.speakPublically("testApply")
    }

    fun testWith() {
        with(TestClass()) {
            this.speakPublically()
            this.speakPublically()
            this.speakPublically()
            0
        }
        println("testWith 收尾代码")
    }

    fun testRun() {
        TestClass().run {
            this.speakPublically()
            this.speakPublically()
            this
        }.speakPublically("testRun")
    }

    fun testAlso(){
        TestClass().also {
            it.speakPublically()
            it.speakPublically()
            this.testWith()
        }.speakPublically()
    }

    var testContent : String? = null

    fun testTag(){
        run abc@ {
            println("尝试输出 : ${(testContent?:return@abc).length}")
            println("哈哈哈哈")
        }
        println("testTag 收尾代码")
    }

    class TestClass {

        private fun speakPrivately() {
            println("This is a private fun")
        }

        fun speakPublically(){
            speakPublically("")
        }

        fun speakPublically(content : String) {
            println("This is a private fun from $content")
            // 在 Kotlin 中，函数也是一种类型
//            val a = { a: Int, b: Int
//                ->
//                a + b
//            }
//            println("\n${a(3, 3)}")
//            println("\n${a.invoke(3, 3)}")
        }
    }

}