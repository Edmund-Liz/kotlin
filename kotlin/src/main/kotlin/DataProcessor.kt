package com.easy.kotlin

class DataProcessor {
    companion object DataProcessor{
        fun processor(){
            println("I am a processing data...")
        }
    }
}
fun main(args:Array<String>){
    DataProcessor.processor()
}