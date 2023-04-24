package com.easy.kotlin

import java.util.Date
import java.text.SimpleDateFormat

fun main(args: Array<String>) {
    var name="world"
    println("Hello $name")

//    var a="abc"
//    a=null;
    var b:String?="abc"
    b=null
    println(b?.length)

    var Enum=1
    var enum=2
    var abstract=3
    println("$Enum $enum $abstract")

    var list= listOf(1,2,3,4,5,6,7)
    println(list.filter { it%3!=0 })
    println(SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Date()))
}