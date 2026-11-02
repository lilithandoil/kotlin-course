package org.example.lessons.lesson18.homework

abstract class Refrigerator : Powerable, Openable, TemperatureRegulatable, Cleanable
abstract class WashingMachine : Powerable, Openable, TemperatureRegulatable, Programmable, Drainable, WaterConnection, Cleanable, Timable
abstract class SmartLamp : Powerable, LightEmitting, Programmable
abstract class ElectronicClock : Powerable, Timable, Programmable
abstract class RobotVacuum : Powerable, Movable, Cleanable, Programmable, Rechargeable
abstract class MechanicalClock : Mechanical, Timable
abstract class Flashlight : Powerable, LightEmitting, BatteryOperated
abstract class CoffeeMachine : Powerable, WaterConnection, TemperatureRegulatable, Programmable, Cleanable
abstract class SmartSpeaker : Powerable, SoundEmitting, Programmable, Rechargeable
