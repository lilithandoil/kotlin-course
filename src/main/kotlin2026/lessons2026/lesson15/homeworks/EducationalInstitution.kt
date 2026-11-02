package lessons2026.lesson15.homeworks

// учебное заведение, главный класс
open class EducationalInstitution(
    val name: String,
    val address: String,
    val studentsCount: Int
) {
    open fun startLessons() {
        println("В $name начались занятия")
    }

    open fun endLessons() {
        println("В $name закончились занятия")
    }
}
