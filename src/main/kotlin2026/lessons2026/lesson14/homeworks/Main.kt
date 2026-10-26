package lessons2026.lesson14.homeworks

fun main() {
    // задание 1
    val party = Party("Бар на крыше", 25)
    party.details()

    // задание 2
    val emotion = Emotion("радость", 9)
    emotion.express()
    val emotion2 = Emotion("грусть", 2)
    emotion2.express()

    // задание 3
    Moon.showPhase()
    Moon.isVisible = false
    Moon.phase = "New Moon"
    Moon.showPhase()

    // задание 4
    val milk = Product("Молоко", 89.9, 10)
    println(milk)
    val cheapMilk = milk.copy(price = 59.9)
    println(cheapMilk)

    // задание 5
    val concert = Concert("Кино", "Лужники", 3500.0, 2)
    concert.showInfo()
    concert.buyTicket()
    concert.buyTicket()
    concert.buyTicket()
    concert.showInfo()

    // задание 6
    println()
    val rack = Rack(3)
    val shelf1 = Shelf(10)
    val shelf2 = Shelf(15)
    val shelf3 = Shelf(12)

    println("Добавили полку 1: ${rack.addShelf(shelf1)}")
    println("Добавили полку 1 еще раз: ${rack.addShelf(shelf1)}")
    println("Добавили полку 2: ${rack.addShelf(shelf2)}")
    println("Добавили полку 3: ${rack.addShelf(shelf3)}")
    println("Добавили четвертую полку: ${rack.addShelf(Shelf(5))}")

    rack.addItem("книга")
    rack.addItem("ваза")
    rack.addItem("лампа")
    rack.addItem("коробка")
    rack.addItem("кружка")
    rack.addItem("часы")
    rack.printContents()

    println("Есть ваза? ${rack.containsItem("ваза")}")
    println("Удалили вазу: ${rack.removeItem("ваза")}")
    println("Есть ваза? ${rack.containsItem("ваза")}")
    println("Влезет ли телевизор на полку 1: ${shelf1.canAccommodate("телевизор")}")

    val notMoved = rack.advancedRemoveShelf(1)
    println("Не удалось переложить: $notMoved")
    rack.printContents()

    val removedItems = rack.removeShelf(0)
    println("С удаленной полки сняли: $removedItems")
    println("Удаляем несуществующую полку: ${rack.removeShelf(10)}")
    rack.printContents()
}