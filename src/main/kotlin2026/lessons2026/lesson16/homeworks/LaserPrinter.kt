package lessons2026.lesson16.homeworks

class LaserPrinter : Printer() {
    override fun print(text: String) {
        val words = text.split(" ")
        for (word in words) {
            printColored(word, Colors.BLACK, Background.WHITE)
        }
    }
}
