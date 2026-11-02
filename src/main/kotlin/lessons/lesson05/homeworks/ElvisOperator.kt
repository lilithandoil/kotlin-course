package org.example.lessons.lesson05.homeworks

fun main() {
    // Задача 1
    // Интенсивность звука = начальная интенсивность * коэффициент затухания
    // Если коэффициент затухания неизвестен = 0.5
    val baseIntensity: Double = 3.0
    val coefficient: Double? = null // может быть null
    val baseCoefficient = 0.5
    val resultIntensity = baseIntensity * (coefficient ?: baseCoefficient)
    println("Интенсивность после затухания: $resultIntensity")

    // Задача 2
    // К стоимости доставки добавляется страховка (0.5% от стоимости).
    // Если стоимость не указана, берём $50
    val defaultCost: Double = 50.0
    val cost: Double? = null // может быть null
    val deliveryCost = 5.0
    val insuranceCoefficient = 0.005
    val insuranceCost = (cost ?: defaultCost) * insuranceCoefficient
    val totalCost: Double = deliveryCost + insuranceCost
    println("Полная стоимость доставки: $totalCost")

    // Задача 3
    // Если давление отсутствует = сообщение
    val pressure: String? = "29.9" // может быть null
    val attentionMessage = "Attention, pressure is lost"
    val pressureForLab = pressure ?: attentionMessage
    println("Результат измерений давления: $pressureForLab")
}