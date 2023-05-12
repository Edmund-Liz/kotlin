package com.easy.kotlin

 data class LoginUser(val username:String,val password:String)

fun main(args:Array<String>){
    val loginUser=LoginUser("admin","admin")
    val (username,password)=loginUser
    println("username='$username',password='$password'")

    val map= mapOf(1 to "C",2 to "B",3 to "C")
    println(map)
}