package org.example.lessons.lesson11.homework

// Задачи на сигнатуру метода

fun printHello() {
    println("Hello")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun printMessage(message: String) {
    println(message)
}

fun average(numbers: List<Int>): Double {
    return numbers.average()
}

private fun getLength(str: String?): Int? {
    return str?.length
}

fun getNullableDouble(): Double? {
    return null
}

private fun printNullableList(list: List<Int>?) {
    println(list)
}

fun intToNullableString(num: Int): String? {
    return num.toString()
}

fun getNullableStringList(): List<String?> {
    return listOf("One", null, "Two")
}

fun compareLength(str: String?, num: Int?): Boolean? {
    if (str == null || num == null) {
        return null
    }
    return str.length == num
}


// Задачи на написание кода

fun multiplyByTwo(number: Int): Int {
    return number * 2
}

fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

fun printNumbersUntil(n: Int) {
    if (n < 1) {
        return
    }
    for (i in 1..n) {
        println(i)
    }
}

fun findFirstNegative(numbers: List<Int>): Int? {
    for (number in numbers) {
        if (number < 0) {
            return number
        }
    }
    return null
}

fun processList(strings: List<String?>) {
    for (str in strings) {
        if (str == null) {
            return
        }
        println(str)
    }
}
