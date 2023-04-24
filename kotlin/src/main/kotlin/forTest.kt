package com.easy.kotlin


fun sumFact(n: Int): Int {
    var sum = 0
    for (i in 1..10) {
        sum += fact(i)
    }
    return sum
}

fun main(args: Array<String>) {
    var b = arrayOf("1", "2", "3")

//for中range的使用
    for (i in 1..10) {
        print("$i ")
    }
    //等价于下面的
    (1..10).forEach { print("$it ") }

    for (i in b.indices) {
        println(b[i])
    }
    for ((index, value) in b.withIndex()) {
        println("the element at $index is $value")
    }
    println(sumFact(10))

//continue和break的区别
    for (i in 1..10) {
        if (i % 2 == 0) {
            continue
        }
        print("$i ")
    }
    for (i in 1..10) {
        if (i % 2 == 0) {
            break
        }
        print("$i ")
    }


}