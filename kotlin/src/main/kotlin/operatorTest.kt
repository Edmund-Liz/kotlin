package com.easy.kotlin


data class Point(val x:Int,val y:Int)
operator fun Point.unaryMinus()=Point(-x,-y)

data class Counter(var index:Int)
operator fun Counter.plus(increment:Int):Counter{
    return Counter(index+increment)
}

data class Person(var name:String,var age:Int,var Sex:String){

    override fun toString(): String {
        return "Person(name='$name',age='$age',sex='$Sex')"
    }
    fun say(msg:String){
        println("$name say:$msg")
    }
}
infix fun Person.grow(year:Int):Person{
    return Person(name,age+year,"M")
}

fun what(){
    println("This is WHAT?")
}

fun main(args:Array<String>){
    val n=Point(1,1)
    val np=-n
    println(np)

    var a=" "+1
//    var b=1+""
    var c=1.toString()+" "
    println(a)
    println(c)

    val x=Counter(1)
    val y=x+10
    println(y)

    val x1=true
    val x2=x1?:"111"//?:操作符限定和null做比较，专门检查是否为空
    println(x2)

    val one=Person("liz",18,"M")
    val one1=one grow 10
    println(one1)
}