package lessons2026.lesson16.homeworks

class InkjetPrinter : Printer() {
    // Список пар: цвет текста и цвет фона
    private val colors = listOf(
        Pair(Colors.WHITE, Background.RED),
        Pair(Colors.BLACK, Background.YELLOW),
        Pair(Colors.WHITE, Background.BLUE),
        Pair(Colors.BLACK, Background.GREEN),
        Pair(Colors.WHITE, Background.PURPLE),
        Pair(Colors.BLACK, Background.CYAN),
    )

    override fun print(text: String) {
        val words = text.split(" ")
        var colorIndex = 0
        for (word in words) {
            val color = colors[colorIndex]
            printColored(word, color.first, color.second)
            colorIndex++
            // Когда цвета закончились — начинаем список сначала
            if (colorIndex == colors.size) {
                colorIndex = 0
            }
        }
    }
}
