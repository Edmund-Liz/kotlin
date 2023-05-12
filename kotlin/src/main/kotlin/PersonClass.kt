package com.easy.kotlin

class PersonClass

class Person1 {
    lateinit var name: String
    var age: Int = 0
    lateinit var Sex: String
    override fun toString(): String {
        return "Person1(name='$name',age='$age',sex='$Sex')"
    }

}

class Person2 {
    lateinit var name: String
    var age: Int = 0
    lateinit var Sex: String

    override fun toString(): String {
        return "Person2(name='$name',age='$age',sex='$Sex')"
    }

    constructor(name: String) {
        this.name = name
    }

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    constructor(name: String, age: Int, Sex: String) {
        this.name = name
        this.age = age
        this.Sex = Sex
    }

    constructor()


}

fun main(args: Array<String>) {
    val person = Person("Liz", 18, "M")
    println("person=$person")

    var person1 = Person1()
    person1.name = "liz1"
    person1.age = 18
    person1.Sex = "M"
    println("person1=$person1")

    val person21 = Person2()
    person21.name = "Jack"
    person21.age = 29
    person21.Sex = "M"
    println("person21 = ${person21}")
    val person22 = Person2("Jack", 29)
    person22.Sex = "M"
    println("person22 = ${person22}")
    val person23 = Person2("Jack", 29, "M")
    println("person23 = ${person23}")
}
