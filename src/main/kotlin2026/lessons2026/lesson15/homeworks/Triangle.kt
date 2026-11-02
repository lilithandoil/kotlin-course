package lessons2026.lesson15.homeworks

// треугольник, у него всегда 3 стороны
class Triangle(
    color: String,
    val base: Double,
    val height: Double
) : Polygon("Треугольник", color, 3) {

    override fun getArea(): Double {
        return base * height / 2
    }
}