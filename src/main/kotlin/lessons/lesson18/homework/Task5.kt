package org.example.lessons.lesson18.homework

class Fridge : OpenableTempDevice(), Cleanable {

    override val maxTemperature = 10

    override fun clean() {
        println("Чистка холодильника...")
    }
}

class WashingMachineDevice : OpenableTempDevice(), Drainable, WaterConnection, Cleanable, Timable {

    override val maxTemperature = 90

    override fun connectToWaterSupply() {
        println("Стиральная машина подключена к водопроводу.")
    }

    override fun getWater(amount: Int) {
        println("Набрано $amount л воды.")
    }

    override fun connectToDrain() {
        println("Стиральная машина подключена к сливу.")
    }

    override fun drain() {
        println("Слив воды выполнен.")
    }

    override fun clean() {
        println("Очистка фильтра стиральной машины.")
    }

    override fun setTimer(time: Int) {
        println("Таймер установлен на $time минут.")
    }
}

class Kettle : OpenableTempDevice(), WaterConnection {

    override val maxTemperature = 100

    override fun connectToWaterSupply() {
        println("Чайник наполнен водой.")
    }

    override fun getWater(amount: Int) {
        println("Взято $amount мл воды для кипячения.")
    }
}

class Oven : OpenableTempDevice(), Cleanable {

    override val maxTemperature = 250

    override fun clean() {
        println("Очистка духовки.")
    }