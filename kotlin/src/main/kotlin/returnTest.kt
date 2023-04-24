package com.easy.kotlin

import java.lang.IllegalArgumentException

fun sum(a: Int, b: Int): Int = a + b

fun max0(a: Int, b: Int): Int = if (a > b) a else b

fun voidReturn(msg:String):Unit{
    println(msg)
}
fun voidReturn0(msg: String):Nothing{
    throw IllegalArgumentException(msg)
}
fun main(args: Array<String>) {
    println(sum(1, 10))
    println(max0(1, 2))

    val sum0 = fun(a: Int, b: Int) = a + b
    println(sum0(3, 4))

    val sumf = fun(a: Int, b: Int) = { a + b }
    println(sumf(2, 3).invoke())

    var array = intArrayOf(1, 2, 3, 4, 5)
    array.forEach here@{
        if (it == 3)return@here
        print("$it ")
    }
    array.forEach(fun(a:Int) {
        print("$a ")
    })
    voidReturn("你到底报不报错？？ ")
}