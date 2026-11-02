package lessons2026.lesson14.homeworks

// полка стеллажа
// вместимость это сколько всего букв в названиях может поместиться
class Shelf(val capacity: Int) {
    private val items = mutableListOf<String>()

    // сколько букв уже занято
    fun getUsedSpace(): Int {
        var sum = 0
        for (item in items) {
            sum += item.length
        }
        return sum
    }

    // сколько букв еще влезет
    fun getFreeSpace(): Int {
        return capacity - getUsedSpace()
    }

    fun canAccommodate(item: String): Boolean {
        return item.length <= getFreeSpace()
    }

    fun addItem(item: String): Boolean {
        if (canAccommodate(item)) {
            items.add(item)
            return true
        }
        return false
    }

    fun removeItem(item: String): Boolean {
        // remove сам возвращает true если нашел и удалил
        return items.remove(item)
    }

    fun containsItem(item: String): Boolean {
        return items.contains(item)
    }

    fun getItems(): List<String> {
        return items.toList()
    }
}