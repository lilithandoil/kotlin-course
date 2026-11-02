package lessons2026.lesson16.homeworks

class Bird : Animal() {
    override fun makeSound() {
        printColored("Tweet", Colors.CYAN)
    }
}
