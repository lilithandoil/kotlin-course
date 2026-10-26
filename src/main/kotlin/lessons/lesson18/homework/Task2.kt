package org.example.lessons.lesson18.homework

abstract class PoweredDevice : Powerable {
    var isPoweredOn = false

    override fun powerOn() {
        isPoweredOn = true
        println("${this::class.simpleName} включено.")
    }

    override fun powerOff() {
        isPoweredOn = false
        println("${this::class.simpleName} выключено.")
    }
}