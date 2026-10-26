package lessons2026.lesson15.homeworks

// стул, место всегда одно
class Chair(
    material: String,
    color: String,
    weight: Int,
    val hasBackrest: Boolean
) : SeatingFurniture(material, color, weight, 1)