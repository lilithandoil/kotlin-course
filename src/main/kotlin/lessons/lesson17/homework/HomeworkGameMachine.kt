package org.example.lessons.lesson17.homework

class GameMachine(
    val color: String,
    val model: String,
    val hasGamePad: Boolean,
) {
    private var isOn = false
    private var osIsLoaded = false
    private var owner = ""
    private var balance = 0.0
    private var gameSessionIsCharged = false
    private var sessionCost = 5.0
    private var pin = "1234"
    var supportPhone = ""
        private set

    private val games = mutableListOf(
        "Mario",
        "Bomber",
        "Tetris",
        "Death Stranding"
    )

    fun turnOn() {
        isOn = true
        loadOs()
    }

    fun turnOff() {
        shutDownOs()
        isOn = false
    }

    private fun loadOs() {
        println("ОС загружена")
    }

    private fun shutDownOs() {
        println("Работа ОС завершена")
    }

    fun showGames() = games.toList()

    fun play(gameName: String) {
        if (!gameSessionIsCharged) {
            println("Сначала оплати игру")
            return
        }
        if (gameName !in games) {
            println("Игра '$gameName' не найдена")
        } else {
            println("Игра '$gameName' запущена")
        }
        gameSessionIsCharged = false
    }

    fun pay() {
        balance += sessionCost
        gameSessionIsCharged = true
        println("Игровая сессия оплачена")
    }

    fun withdraw(pin: String): Double {
        if (pin != this.pin) {
            println("Неверный пин-код")
            return 0.0
        }
        return openSafe()
    }

    private fun openSafe(): Double {
        val sum = balance
        balance = 0.0
        println("Выдано $sum рублей")
        return sum
    }
}
