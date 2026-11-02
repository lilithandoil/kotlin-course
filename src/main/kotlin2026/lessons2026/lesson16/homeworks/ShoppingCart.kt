package lessons2026.lesson16.homeworks

import kotlin.collections.iterator

class ShoppingCart {
    // Словарь: ID товара -> количество
    private val items = mutableMapOf<Int, Int>()

    // Базовый метод: добавляет одну единицу товара
    fun addToCart(itemId: Int) {
        addToCart(itemId, 1)
    }

    // Перегрузка: ID товара и количество
    fun addToCart(itemId: Int, amount: Int) {
        val current = items[itemId]
        if (current != null) {
            // Товар уже есть — увеличиваем количество
            items[itemId] = current + amount
        } else {
            // Товара нет — добавляем
            items[itemId] = amount
        }
    }

    // Перегрузка: словарь из ID и количества
    fun addToCart(newItems: Map<Int, Int>) {
        for ((itemId, amount) in newItems) {
            addToCart(itemId, amount)
        }
    }

    // Перегрузка: список ID, каждый добавляется по одной штуке
    fun addToCart(itemIds: List<Int>) {
        for (itemId in itemIds) {
            addToCart(itemId)
        }
    }

    override fun toString(): String {
        var total = 0
        var result = "-------------------------\n"
        result += "ID товара | Количество\n"
        result += "-------------------------\n"
        for ((itemId, amount) in items) {
            result += "$itemId\t\t  | $amount\n"
            total += amount
        }
        result += "-------------------------\n"
        result += "Артикулов: ${items.size}\n"
        result += "Всего товаров: $total"
        return result
    }
}
