package lessons2026.lesson15.homeworks

// шкаф
class Wardrobe(
    material: String,
    color: String,
    weight: Int,
    val doorsCount: Int,
    val shelvesCount: Int
) : Furniture(material, color, weight) {

    fun openDoors() {
        println("Двери шкафа открыты")
    }
}