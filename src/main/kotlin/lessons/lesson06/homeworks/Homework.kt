package org.example.lessons.lesson06.homeworks

fun main() {
    // проверки
    example1(3)
    example2(5)
    example3(2)
    example4(1450)
    example5("jpg")
    example6(36, 'C')
    example6(100, 'F')
    example7(12)
    example8(16)
}

// Задание 1: Определение сезона
fun example1(month: Int) {
    when (month) {
        in 3..5 -> println("Весна")
        in 6..8 -> println("Лето")
        in 9..11 -> println("Осень")
        12, 1, 2 -> println("Зима")
        else -> println("Некорректный номер месяца")
    }
}

// Задание 2: Расчет возраста питомца
fun example2(dogAge: Int) {
    if (dogAge < 0) {
        println("Некорректный возраст")
    } else if (dogAge <= 2) {
        println(dogAge * 10.5)
    } else {
        val result = 2 * 10.5 + (dogAge - 2) * 4
        println(result)
    }
}

// Задание 3: Определение способа перемещения
fun example3(distance: Int) {
    if (distance <= 0) {
        println("Некорректная дистанция")
    } else if (distance <= 1) {
        println("Пешком")
    } else if (distance <= 5) {
        println("Велосипед")
    } else {
        println("Автотранспорт")
    }
}

// Задание 4: Расчет бонусных баллов
fun example4(amount: Int) {
    if (amount < 0) {
        println("Сумма не может быть отрицательной")
    } else if (amount <= 1000) {
        println((amount / 100) * 2)
    } else {
        println((amount / 100) * 3)
    }
}

// Задание 5: Определение типа документа
fun example5(extension: String) {
    when (extension) {
        "txt" -> println("Текстовый документ")
        "jpg", "jpeg", "png" -> println("Изображение")
        "xls", "xlsx" -> println("Таблица")
        else -> println("Неизвестный тип")
    }
}

// Задание 6: Конвертация температуры
fun example6(value: Int, unit: Char) {
    when (unit) {
        'C', 'c' -> {
            val f = value * 9 / 5 + 32
            print(f)
            println("F")
        }
        'F', 'f' -> {
            val c = (value - 32) * 5 / 9
            print(c)
            println("C")
        }
        else -> println("Некорректная единица измерения")
    }
}

// Задание 7: Подбор одежды по погоде
fun example7(temp: Int) {
    when {
        temp < -30 || temp > 35 -> println("Лучше не выходить из дома")
        temp < 10 -> println("Куртка и шапка")
        temp in 10..18 -> println("Ветровка")
        else -> println("Футболка и шорты")
    }
}

// Задание 8: Выбор фильма по возрасту
fun example8(age: Int) {
    when (age) {
        in 0..9 -> println("Детские")
        in 10..18 -> println("Подростковые")
        in 19..150 -> println("18+")
        else -> println("Некорректный возраст")
    }
}