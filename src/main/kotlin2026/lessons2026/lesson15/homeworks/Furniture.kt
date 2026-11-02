package lessons2026.lesson15.homeworks

// мебель, главный класс
open class Furniture(
    val material: String,
    val color: String,
    val weight: Int
) {
    open fun move() {
        println("Мебель передвинули")
    }

    fun assemble() {
        println("Мебель собрана")
    }
}