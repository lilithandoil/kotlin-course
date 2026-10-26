package lessons2026.lesson15.homeworks

// задание 7 - ключи в начало, значения в конец
class MapMaterials : Materials() {

    fun addFromMap(map: Map<String, String>) {
        val oldMaterials = extractMaterials()
        val keys = mutableListOf<String>()
        val values = mutableListOf<String>()

        for ((key, value) in map) {
            // ключ ставим в начало списка, так они будут в обратном порядке
            keys.add(0, key)
            values.add(value)
        }

        for (key in keys) {
            addMaterial(key)
        }
        for (item in oldMaterials) {
            addMaterial(item)
        }
        for (value in values) {
            addMaterial(value)
        }
    }
}