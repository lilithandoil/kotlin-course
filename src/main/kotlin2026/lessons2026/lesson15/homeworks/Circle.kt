package lessons2026.lesson15.homeworks
// круг
class Circle(
    color: String,
    val radius: Double
) : GeometricShape("Круг", color) {

    override fun getArea(): Double {
        return 3.14 * radius * radius
    }
}