package com.easy.kotlin

fun max(a:Int,b:Int):Int{
    return if (a>b) a else b
}

fun max3(a:Int,b:Int):Int{
    var max=if (a>b){
        println("Max is a and a=$a")
        a
    }else{
        println("Max is b and b=$b")
        b
    }
    return max
}

fun casesWhen(obj:Any?){
    val s="123"
    when (obj){
        0,1,2,3,4,5,6,7,8,9 -> println("$obj ,这是一个0到9之间的数字")
        "hello"-> println("$obj ,这是字符串hello")
        is Char-> println("$obj ,这是一个Char类型数据")
        s-> println("$obj ,x==s 即$s")
        in 10..20-> println("$obj,这是一个10到20之间的数字")
        else -> println("$obj ,未判断出（else）")
    }
}

fun fact(n:Int):Int{
    var result=1
    result = when(n){
        0,1-> 1
        else-> n* fact(n-1)
    }
    return result
}

fun main(args:Array<String>){
    println(max(1,2))
    println(max3(3,4))

    casesWhen(1)
    casesWhen("hello")
    casesWhen('X')
    casesWhen(null)
    casesWhen("123")
    casesWhen(15)

    println(fact(10))
}