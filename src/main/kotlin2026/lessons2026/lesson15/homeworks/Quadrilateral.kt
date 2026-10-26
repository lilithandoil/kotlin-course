package lessons2026.lesson15.homeworks

// четырехугольник
class Quadrilateral(
    color: String,
    val width: Double,
    val length: Double
) : Polygon("Четырехугольник", color, 4) {

    override fun getArea(): Double {
        return width * length
    }

    // если стороны равны то это квадрат
    fun isSquare(): Boolean {
        return width == length
    }
}