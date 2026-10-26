package lessons2026.lesson15.homeworks

// многоугольник
open class Polygon(
    name: String,
    color: String,
    val sidesCount: Int
) : GeometricShape(name, color) {

    fun printSides() {
        println("У фигуры $name сторон: $sidesCount")
    }
}