package lessons2026.lesson16.homeworks

// Площадь треугольника по двум сторонам и углу между ними:
// S = 0.5 * a * b * sin(угол). Угол передаём в градусах.
class Triangle(val sideA: Double, val sideB: Double, val angle: Double) : Shape() {
    override fun area(): Double {
        val angleInRadians = Math.toRadians(angle)
        return 0.5 * sideA * sideB * Math.sin(angleInRadians)
    }
}
