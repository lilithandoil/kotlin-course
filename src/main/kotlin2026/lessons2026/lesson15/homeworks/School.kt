package lessons2026.lesson15.homeworks

// школа, сделала open чтобы от нее тоже наследоваться
open class School(
    name: String,
    address: String,
    studentsCount: Int,
    val schoolNumber: Int,
    val classesCount: Int
) : EducationalInstitution(name, address, studentsCount) {

    fun ringBell() {
        println("Звенит звонок в школе №$schoolNumber")
    }
}