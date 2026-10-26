package lessons2026.lesson14.homeworks

// луна одна, поэтому object
object Moon {
    var isVisible: Boolean = true
    var phase: String = "Full Moon"

    fun showPhase() {
        if (isVisible) {
            println("Сейчас луна видна, фаза: $phase")
        } else {
            println("Луну сейчас не видно, фаза: $phase")
        }
    }
}