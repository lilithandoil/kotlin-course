package org.example.lessons.lesson18.homework

abstract class ProgrammableDevice : PoweredDevice(), Programmable {

    var currentProgram: String = ""

    override fun programAction(action: String) {
        if (!isPoweredOn) {
            println("Невозможно задать программу, питание выключено.")
        } else {
            currentProgram = action
            println("Программа '$action' установлена.")
        }
    }

    override fun execute() {
        if (!isPoweredOn) {
            println("Невозможно выполнить программу, устройство выключено.")
        } else {
            println("Выполняется программа '$currentProgram'.")
        }
    }
}