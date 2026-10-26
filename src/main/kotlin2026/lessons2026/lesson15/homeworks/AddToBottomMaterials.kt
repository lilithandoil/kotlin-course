package lessons2026.lesson15.homeworks

// задание 4 - кладем строку на самое дно (индекс 0)
class AddToBottomMaterials : Materials() {

    fun addToBottom(material: String) {
        // достаем все что было
        val oldMaterials = extractMaterials()
        // сначала новую
        addMaterial(material)
        // потом возвращаем старые
        for (item in oldMaterials) {
            addMaterial(item)
        }
    }
}