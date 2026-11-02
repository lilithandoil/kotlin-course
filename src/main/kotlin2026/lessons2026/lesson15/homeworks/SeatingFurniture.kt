package lessons2026.lesson15.homeworks

// мебель на которой сидят, от нее стул и диван
open class SeatingFurniture(
    material: String,
    color: String,
    weight: Int,
    val seatsCount: Int
) : Furniture(material, color, weight) {

    fun sitDown() {
        println("На мебель сели, мест всего: $seatsCount")
    }
}