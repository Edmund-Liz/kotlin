package com.easy.kotlin

class AnEmptyClass

fun main(args: Array<String>){
    val anEmptyClass=AnEmptyClass()
    println(anEmptyClass)
    println(anEmptyClass is AnEmptyClass)
    println(anEmptyClass::class)
}