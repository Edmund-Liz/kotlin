package com.easy.kotlin

fun strLength(s: String?):Int{
//    s.length                  //编译不通过，不可对可空类型直接使用"."点操作符
//    println(s!!.length)       //!!.断言操作符，此时若s为空将抛出空指针异常

    return s?.length ?:0
}

fun main(args:Array<String>){
    println(strLength(null))
    println(strLength("abc"))

    println(null==null)
    println(null!=null)
    println(null is Any)
    println(null is Any?)
//    var a=null
//    a=1  编译不通过




}
