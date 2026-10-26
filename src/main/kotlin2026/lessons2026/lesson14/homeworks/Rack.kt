package lessons2026.lesson14.homeworks

// стеллаж
class Rack(val maxShelves: Int) {
    private val shelves = mutableListOf<Shelf>()

    fun addShelf(shelf: Shelf): Boolean {
        // стеллаж уже полный
        if (shelves.size >= maxShelves) {
            return false
        }
        // такая полка уже стоит
        if (shelves.contains(shelf)) {
            return false
        }
        shelves.add(shelf)
        return true
    }

    fun removeShelf(index: Int): List<String> {
        if (index < 0 || index >= shelves.size) {
            return emptyList()
        }
        val shelf = shelves.removeAt(index)
        return shelf.getItems()
    }

    // кладем на первую полку где есть место
    fun addItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.addItem(item)) {
                return true
            }
        }
        return false
    }

    // удаляем только один предмет
    fun removeItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.removeItem(item)) {
                return true
            }
        }
        return false
    }

    fun containsItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.containsItem(item)) {
                return true
            }
        }
        return false
    }

    fun getShelves(): List<Shelf> {
        return shelves.toList()
    }

    fun printContents() {
        println("----- Стеллаж -----")
        for (i in shelves.indices) {
            val shelf = shelves[i]
            println("Полка $i")
            println("  вместимость: ${shelf.capacity}")
            println("  осталось места: ${shelf.getFreeSpace()}")
            println("  предметы: ${shelf.getItems()}")
        }
        println("-------------------")
    }

    fun advancedRemoveShelf(index: Int): List<String> {
        if (index < 0 || index >= shelves.size) {
            return emptyList()
        }

        val shelfToRemove = shelves[index]
        // сначала самые длинные
        val items = shelfToRemove.getItems().sortedByDescending { it.length }
        val notMoved = mutableListOf<String>()

        for (item in items) {
            var placed = false
            for (i in shelves.indices) {
                // на ту же полку не кладем
                if (i == index) continue
                if (shelves[i].addItem(item)) {
                    placed = true
                    break
                }
            }
            // никуда не влез, значит останется на удаляемой полке
            if (!placed) {
                notMoved.add(item)
            }
        }

        shelves.removeAt(index)
        return notMoved.toList()
    }
}