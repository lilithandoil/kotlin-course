package lessons2026.lesson15.homeworks

open class GeometricShape(
    val name: String,
    val color: String
) {
    open fun draw() {
        println("Рисуем фигуру $name, цвет: $color")
    }

    open fun getArea(): Double {
        return 0.0
    }
}