package lessons2026.lesson15.homeworks

// задание 5 - новые строки через одну со старыми (на 0, 2, 4...)
class AlternateMaterials : Materials() {

    fun addAlternately(newMaterials: List<String>) {
        val oldMaterials = extractMaterials()

        // смотрим какой список длиннее
        var maxSize = oldMaterials.size
        if (newMaterials.size > maxSize) {
            maxSize = newMaterials.size
        }

        for (i in 0 until maxSize) {
            if (i < newMaterials.size) {
                addMaterial(newMaterials[i])
            }
            if (i < oldMaterials.size) {
                addMaterial(oldMaterials[i])
            }
        }
    }
}