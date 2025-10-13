package org.example.lessons.lesson10.homework

fun main() {

    //Создайте пустой неизменяемый словарь, где ключи и значения - целые числа
    val emptyMap: Map<Int, Int> = mapOf()
    println("1. Пустой словарь: $emptyMap")

    //Создайте словарь, где ключи - Float, значения - Double
    val floatDoubleMap = mapOf(1.0f to 2.5, 2.5f to 3.14, 3.0f to 6.28)
    println("2. Float → Double: $floatDoubleMap")

    //Создайте изменяемый словарь, где ключи - Int, значения - String
    val mutableMap = mutableMapOf(1 to "Один", 2 to "Два", 3 to "Три")
    println("3. Изменяемый словарь: $mutableMap")

    //Добавьте новые пары "ключ-значение"
    mutableMap[4] = "Четыре"
    mutableMap[5] = "Пять"
    println("4. После добавления: $mutableMap")

    //Извлеките значение по ключу и попробуйте получить значение по несуществующему ключу
    println("5. Значение по ключу 2: ${mutableMap[2]}")
    println("5. Значение по несуществующему ключу 10: ${mutableMap[10]}") // null

    //Удалите элемент по ключу
    mutableMap.remove(3)
    println("6. После удаления ключа 3: $mutableMap")

    //Словарь (ключи Double, значения Int), делим ключ на значение
    val divMap = mapOf(10.0 to 2, 5.0 to 0, 7.0 to 7)
    println("7. Деление ключа на значение:")
    for ((key, value) in divMap) {
        if (value == 0) {
            println("$key / $value = бесконечность")
        } else {
            println("$key / $value = ${key / value}")
        }
    }

    //Измените значение для существующего ключа
    mutableMap[2] = "Два (обновлено)"
    println("8. После изменения значения: $mutableMap")

    //Создайте два словаря и объедините их в третий через циклы
    val mapA = mapOf(1 to "a", 2 to "b")
    val mapB = mapOf(3 to "c", 4 to "d")
    val mergedMap = mutableMapOf<Int, String>()
    for ((k, v) in mapA) mergedMap[k] = v
    for ((k, v) in mapB) mergedMap[k] = v
    println("9. Объединённый словарь: $mergedMap")

    //Словарь: ключи - строки, значения - списки чисел
    val listMap = mutableMapOf(
        "Четные" to listOf(2, 4, 6),
        "Нечетные" to listOf(1, 3, 5)
    )
    println("10. Словарь списков чисел: $listMap")

    //Словарь, где значения - изменяемые множества строк
    val setMap = mutableMapOf(
        1 to mutableSetOf("яблоко", "груша"),
        2 to mutableSetOf("апельсин")
    )
    println("11. Исходный словарь множеств: $setMap")
    val set = setMap[1]
    set?.add("слива")
    println("11. После добавления: ${setMap[1]}")

    //Словарь, где ключи — пары чисел
    val pairMap = mapOf(
        (1 to 5) to "пара1",
        (5 to 9) to "пара2",
        (2 to 3) to "пара3"
    )
    println("12. Поиск пар с цифрой 5:")
    for ((pair, value) in pairMap) {
        if (pair.first == 5 || pair.second == 5) {
            println("Пара $pair содержит 5 → значение: $value")
        }
    }

    //Подбор оптимальных типов словарей
    println("\nПодбор оптимальных типов словарей:")
    val library: Map<String, List<String>> = mapOf(
        "Пушкин" to listOf("Евгений Онегин", "Капитанская дочка"),
        "Толстой" to listOf("Война и мир", "Анна Каренина")
    )

    val plants: Map<String, List<String>> = mapOf(
        "Цветы" to listOf("Роза", "Тюльпан"),
        "Деревья" to listOf("Дуб", "Береза")
    )

    val teams: Map<String, List<String>> = mapOf(
        "Команда А" to listOf("Игрок1", "Игрок2"),
        "Команда B" to listOf("Игрок3", "Игрок4")
    )

    val treatment: Map<String, List<String>> = mapOf(
        "2025-10-13" to listOf("Аспирин", "Витамин C"),
        "2025-10-14" to listOf("Парацетамол")
    )

    val travel: Map<String, Map<String, List<String>>> = mapOf(
        "Франция" to mapOf(
            "Париж" to listOf("Эйфелева башня", "Лувр"),
            "Лион" to listOf("Старый город")
        ),
        "Италия" to mapOf(
            "Рим" to listOf("Колизей", "Фонтан Треви")
        )
    )

    println("Библиотека: $library")
    println("Растения: $plants")
    println("Команды: $teams")
    println("Курс лечения: $treatment")
    println("Путешествия: $travel")
}
