package lessons2026.lesson15.homeworks

// университет
class University(
    name: String,
    address: String,
    studentsCount: Int,
    val facultiesCount: Int,
    val hasDormitory: Boolean
) : EducationalInstitution(name, address, studentsCount) {

    fun startSession() {
        println("В $name началась сессия")
    }
}