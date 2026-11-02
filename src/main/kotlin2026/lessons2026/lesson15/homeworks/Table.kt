package lessons2026.lesson15.homeworks

// стол
class Table(
    material: String,
    color: String,
    weight: Int,
    val legsCount: Int,
    val shape: String
) : Furniture(material, color, weight) {

    fun setTable() {
        println("Стол накрыт")
    }
}