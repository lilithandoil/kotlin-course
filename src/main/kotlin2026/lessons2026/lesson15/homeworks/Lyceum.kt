package lessons2026.lesson15.homeworks

// лицей, тоже школа но с профилем
class Lyceum(
    name: String,
    address: String,
    studentsCount: Int,
    schoolNumber: Int,
    classesCount: Int,
    val profile: String
) : School(name, address, studentsCount, schoolNumber, classesCount) {

    fun holdOlympiad() {
        println("В лицее проходит олимпиада по профилю: $profile")
    }
}