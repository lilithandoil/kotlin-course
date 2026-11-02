package lessons2026.lesson16.homeworks

fun main() {
    // Животные
    println("Животные:")
    val animals: List<Animal> = listOf(Dog(), Cat(), Bird(), Animal())
    for (animal in animals) {
        animal.makeSound()
    }

    // Фигуры
    println()
    println("Фигуры:")
    val shapes: List<Shape> = listOf(
        Circle(3.0),
        Square(4.0),
        Triangle(5.0, 6.0, 30.0),
    )
    for (shape in shapes) {
        println("Площадь: ${shape.area()}")
    }

    // Принтеры
    val text = "Kotlin is a modern programming language that makes developers happier " +
            "It is concise safe and fully interoperable with Java and other languages"

    println()
    println("Лазерный принтер:")
    val laserPrinter = LaserPrinter()
    laserPrinter.print(text)

    println()
    println("Струйный принтер:")
    val inkjetPrinter = InkjetPrinter()
    inkjetPrinter.print(text)

    // Корзина
    println()
    println("Корзина:")
    val cart = ShoppingCart()
    cart.addToCart(101)
    cart.addToCart(101)
    cart.addToCart(202, 5)
    cart.addToCart(mapOf(303 to 2, 101 to 3))
    cart.addToCart(listOf(404, 404, 505))
    println(cart)

    // Логгер
    println()
    println("Логгер:")
    val logger = Logger()
    logger.log("Приложение запущено")
    logger.log("DEBUG", "Загружено 42 записи")
    logger.log("WARNING", "Мало места на диске")
    logger.log("ERROR", "Не удалось подключиться к серверу")
    logger.log(listOf("Пользователь вошёл", "Открыт профиль", "Пользователь вышел"))
    logger.log(Exception("Корзина не может быть пустой"))
}
