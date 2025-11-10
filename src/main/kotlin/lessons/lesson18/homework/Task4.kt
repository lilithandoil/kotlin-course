abstract class OpenableTempDevice : ProgrammableDevice(), TemperatureRegulatable, Openable {

    override val maxTemperature: Int = 100
    var currentTemp = 0
    var isOpen = false

    override fun open() {
        isOpen = true
        println("${this::class.simpleName} открыто.")
    }

    override fun close() {
        isOpen = false
        println("${this::class.simpleName} закрыто.")
    }

    override fun setTemperature(temp: Int) {
        if (!isPoweredOn) {
            println("Невозможно установить температуру, питание выключено.")
        } else if (temp > maxTemperature) {
            println("Температура слишком высокая! Максимум $maxTemperature.")
        } else {
            currentTemp = temp
            println("Температура установлена на $temp°C.")
        }
    }
}