package com.easy.kotlin

abstract class Shape{
    abstract var width:Double
    abstract var height:Double
    abstract var radius:Double
    abstract fun area():Double

    open fun onClick(){
        println("I am clicked!")
    }
}

class Rectangle(override var width: Double, override var height: Double,
                override var radius: Double):Shape(){
    override fun area(): Double {
        return width*height
    }

    override fun onClick() {
        println("${this::class.simpleName} is clicked!")
    }
                }

class Circle(override var width: Double, override var height: Double,
             override var radius: Double):Shape(){
    override fun area(): Double {
        return 3.14*radius*radius
    }
             }

//class Triangle:Shape()

fun main(args:Array<String>){
    val r=Rectangle(3.0,4.0,0.0)
    println(r.area())
    r.onClick()
    val c=Circle(0.0,0.0,4.0)
    println(c.area())
    c.onClick()
}