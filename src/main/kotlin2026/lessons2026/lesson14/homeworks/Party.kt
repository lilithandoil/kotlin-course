package lessons2026.lesson14.homeworks

// вечеринка
class Party(val location: String, val attendees: Int) {

    fun details() {
        println("Вечеринка проходит в месте: $location, гостей: $attendees")
    }
}