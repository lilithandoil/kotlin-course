package lessons2026.lesson15.homeworks

// задание 6 - добавляем и сортируем все по алфавиту
class SortedMaterials : Materials() {

    fun addSorted(material: String) {
        val allMaterials = extractMaterials().toMutableList()
        allMaterials.add(material)
        allMaterials.sort()
        for (item in allMaterials) {
            addMaterial(item)
        }
    }
}