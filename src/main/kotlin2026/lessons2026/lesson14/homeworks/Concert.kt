package lessons2026.lesson14.homeworks

// концерт
class Concert(
    val band: String,
    val place: String,
    val price: Double,
    val capacity: Int
) {
    private var soldTickets = 0

    fun showInfo() {
        println("Концерт: $band, место: $place, цена билета: $price, вместимость: $capacity, продано билетов: $soldTickets")
    }

    fun buyTicket() {
        if (soldTickets < capacity) {
            soldTickets++
            println("Билет куплен, продано: $soldTickets")
        } else {
            println("Билеты закончились")
        }
    }
}