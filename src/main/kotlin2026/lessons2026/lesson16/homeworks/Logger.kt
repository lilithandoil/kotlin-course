package lessons2026.lesson16.homeworks

class Logger {
    // Базовый метод: выводит сообщение с уровнем INFO
    fun log(message: String) {
        log("INFO", message)
    }

    // Перегрузка: уровень логирования и сообщение
    fun log(level: String, message: String) {
        val text = "[$level] $message"
        if (level == "WARNING") {
            printColored(text, Colors.YELLOW)
        } else if (level == "ERROR") {
            printColored(text, Colors.WHITE, Background.RED)
        } else {
            println(text)
        }
    }

    // Перегрузка: список сообщений, все выводятся с уровнем INFO
    fun log(messages: List<String>) {
        for (message in messages) {
            log(message)
        }
    }

    // Перегрузка: исключение, выводим его message с уровнем ERROR
    fun log(exception: Exception) {
        log("ERROR", "${exception.message}")
    }
}
