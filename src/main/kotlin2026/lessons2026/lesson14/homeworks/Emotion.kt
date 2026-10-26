package lessons2026.lesson14.homeworks

// эмоция, интенсивность от 1 до 10
class Emotion(val type: String, val intensity: Int) {

    fun express() {
        var strength = ""
        if (intensity >= 8) {
            strength = "очень сильно"
        } else if (intensity >= 4) {
            strength = "средне"
        } else {
            strength = "слабо"
        }

        when (type) {
            "радость" -> println("Человек радуется $strength")
            "грусть" -> println("Человеку грустно $strength")
            "злость" -> println("Человек злится $strength")
            "страх" -> println("Человеку страшно $strength")
            else -> println("Эмоция $type, интенсивность: $strength")
        }
    }
}