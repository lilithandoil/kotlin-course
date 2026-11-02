package lessons2026.lesson15.homeworks

// колледж
class College(
    name: String,
    address: String,
    studentsCount: Int,
    val specialty: String
) : EducationalInstitution(name, address, studentsCount) {

    fun startPractice() {
        println("Студенты $name ушли на практику по специальности $specialty")
    }
}