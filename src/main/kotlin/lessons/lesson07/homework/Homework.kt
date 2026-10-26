package org.example.lessons.lesson07.homework

fun main() {

    // Задания для цикла for

    // 1. Вывод чисел от 1 до 5
    for (i in 1..5) {
        println(i)
    }

    // 2. Вывод четных чисел от 1 до 10
    for (i in 1..10) {
        if (i % 2 == 0) {
            println(i)
        }
    }

    // 3. Вывод чисел от 5 до 1
    for (i in 5 downTo 1) {
        println(i)
    }

    // 4. Вывод чисел от 10 до 1 с шагом 2
    for (i in 10 downTo 1 step 2) {
        println(i)
    }

    // 5. Числа от 1 до 9 с шагом 2
    for (i in 1..9 step 2) {
        println(i)
    }

    // 6. Каждое третье число от 1 до 20
    for (i in 1..20 step 3) {
        println(i)
    }

    // 7. Числовая переменная size и цикл until
    val size = 12
    for (i in 3 until size step 2) {
        println(i)
    }

    // Задания для цикла while

    // 8. Квадраты чисел от 1 до 5
    var counter1 = 1
    while (counter1 <= 5) {
        println(counter1 * counter1)
        counter1++
    }

    // 9. Уменьшение числа от 10 до 5
    var counter2 = 10
    while (counter2 >= 5) {
        println(counter2)
        counter2--
    }

    // Задания для цикла do while

    // 10. Вывод чисел от 5 до 1
    var counter3 = 5
    do {
        println(counter3)
        counter3--
    } while (counter3 >= 1)

    // 11. do while, пока счётчик меньше 10, начиная с 5
    var counter4 = 5
    do {
        println(counter4)
        counter4++
    } while (counter4 < 10)

    // Задания для break и continue

    // 12. Цикл for от 1 до 10, break при 6
    for (i in 1..10) {
        if (i == 6) break
        println(i)
    }

    // 13. Бесконечный while, break при 10
    var counter5 = 1
    while (true) {
        println(counter5)
        if (counter5 == 10) break
        counter5++
    }

    // 14. For от 1 до 10, continue для пропуска четных чисел
    for (i in 1..10) {
        if (i % 2 == 0) continue
        println(i)
    }

    // 15. While от 1 до 10, пропуск чисел кратных 3
    var counter6 = 1
    while (counter6 <= 10) {
        if (counter6 % 3 == 0) {
            counter6++
            continue
        }
        println(counter6)
        counter6++
    }
}