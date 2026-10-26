package lessons2026.lesson15.homeworks

// гимназия это тоже школа, но с языками
class Gymnasium(
    name: String,
    address: String,
    studentsCount: Int,
    schoolNumber: Int,
    classesCount: Int,
    val foreignLanguages: List<String>
) : School(name, address, studentsCount, schoolNumber, classesCount) {

    fun printLanguages() {
        println("В гимназии изучают языки: $foreignLanguages")
    }
}