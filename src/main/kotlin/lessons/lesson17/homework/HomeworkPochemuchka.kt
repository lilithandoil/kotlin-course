package org.example.lessons.lesson17.homework

abstract class BaseClass(
    // 1. В дочернем классе используется свой privateVal, это не то же поле что и здесь
    private val privateVal: String,
    // 2. protected видно только внутри класса и наследников
    protected val protectedVal: String,
    val publicVal: String
) {
    var publicField = "3. измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "4. Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }

    protected var protectedField = "5. измени меня из функции main() через сеттер в наследнике"
    private var privateField = "6. нельзя изменить это поле из класса наследника"

    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
            "generate" to generate()
        ).map { "${it.key}: ${it.value}" }.joinToString("\n")
    }

    fun printText() {
        privatePrint()
    }

    // 7. потому что возвращает protected класс, значит доступ только внутри или в наследниках
    protected open fun getProtectedClass() = ProtectedClass()

    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }

    // 8. в дочернем классе метод generate() переопределён, поэтому вызывается его версия
    open fun generate(): String {
        return "Это генерация из родительского класса"
    }

    private fun privatePrint() {
        println("Печать privatePrint из класса BaseClass")
    }

    // 9. потому что возвращает приватный класс, а он доступен только внутри этого класса
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass
    private class PrivateClass
}

class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // 10. потому что в родительском классе есть одноимённое публичное поле, доступно именно оно
    publicVal: String
) : BaseClass(privateVal, protectedVal, privateVal) {

    // 11. getAll() доступна, так как унаследована от BaseClass
    // 12. приватные функции не переопределяются, это просто своя функция с таким же именем
    private fun privatePrint() {
        println("Печать privatePrint из класса ChildrenClass")
    }

    override fun generate(): String {
        return "Это генерация из дочернего класса"
    }

    // 4. изменяем логику проверки, чтобы поле можно было поменять
    override fun verifyPublicField(value: String): Boolean {
        return true
    }

    // 5. добавляем метод, чтобы можно было изменить protectedField из main
    fun updateProtectedField(value: String) {
        protectedField = value
    }
}

fun main() {
    val children = ChildrenClass("privateVal", "protectedVal", "publicVal")

    // 3.
    children.publicField = "Антонио Бандерас"

    // 5.
    children.updateProtectedField("Новое значение ProtectedField")

    println(children.getAll())
}
