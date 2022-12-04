package com.muhammed.fibonacci

fun main(){
    fibonacci(10)
}
fun fibonacci(count:Int){

    var firstValue = 0
    var secondValue = 1
    var arrayFibonacci= arrayListOf<Int>()
    arrayFibonacci.add(firstValue)
    arrayFibonacci.add(secondValue)

    for (i in 0..count-3) {
        val sum = arrayFibonacci[i] + arrayFibonacci[i+1]
        arrayFibonacci.add(sum)
    }
    println(arrayFibonacci)
}
fun plus(a:Int,b:Int,c:Int,d:Int):Int{
    return a+b+c+d
}
