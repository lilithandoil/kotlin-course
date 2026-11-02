package lessons2026.lesson15.homeworks

// диван
class Sofa(
    material: String,
    color: String,
    weight: Int,
    seatsCount: Int,
    val isFoldable: Boolean
) : SeatingFurniture(material, color, weight, seatsCount) {

    fun unfold() {
        if (isFoldable) {
            println("Диван разложили")
        } else {
            println("Этот диван не раскладывается")
        }
    }
}