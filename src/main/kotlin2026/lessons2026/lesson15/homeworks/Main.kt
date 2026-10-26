package lessons2026.lesson15.homeworks

fun main() {
    // фигуры
    val circle = Circle("красный", 2.0)
    circle.draw()
    println("Площадь круга: ${circle.getArea()}")

    val triangle = Triangle("синий", 4.0, 3.0)
    triangle.printSides()
    println("Площадь треугольника: ${triangle.getArea()}")

    val square = Quadrilateral("зелёный", 5.0, 5.0)
    println("Это квадрат? ${square.isSquare()}")

    // учебные заведения
    val lyceum = Lyceum("Лицей №1", "ул. Ленина 5", 600, 1, 22, "физмат")
    lyceum.startLessons()
    lyceum.ringBell()
    lyceum.holdOlympiad()

    // мебель
    val sofa = Sofa("ткань", "серый", 50, 3, true)
    sofa.sitDown()
    sofa.unfold()

    println()
    println("Задание 4")
    val bottom = AddToBottomMaterials()
    bottom.addMaterial("first")
    bottom.addMaterial("second")
    bottom.addToBottom("new")
    bottom.printContainer()

    println()
    println("Задание 5")
    val alternate = AlternateMaterials()
    alternate.addMaterial("first")
    alternate.addMaterial("second")
    alternate.addMaterial("third")
    alternate.addAlternately(listOf("A", "B", "C"))
    alternate.printContainer()

    println()
    println("Задание 6")
    val sorted = SortedMaterials()
    sorted.addSorted("wood")
    sorted.addSorted("glass")
    sorted.addSorted("metal")
    sorted.printContainer()

    println()
    println("Задание 7")
    val mapMaterials = MapMaterials()
    mapMaterials.addMaterial("old1")
    mapMaterials.addMaterial("old2")
    mapMaterials.addFromMap(mapOf("key1" to "value1", "key2" to "value2", "key3" to "value3"))
    mapMaterials.printContainer()
}