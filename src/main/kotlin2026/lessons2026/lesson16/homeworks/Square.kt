package lessons2026.lesson16.homeworks

class Square(val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}
