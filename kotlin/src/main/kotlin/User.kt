package com.easy.kotlin

object User {
    val username:String="admin"
    val password:String="admin"
    fun hello(){
        println("Hello,User!")
    }
}
fun main(args:Array<String>){
    println(User.username)
    println(User.password)
    User.hello()
}