package org.example.lessons.lesson13.homework

fun main() {

    // 1
    val testsTime = mapOf("loginTest" to 12.5, "logoutTest" to 8.0, "searchTest" to 15.5)
    val averageTime = testsTime.values.sum() / testsTime.size
    println("Среднее время теста: $averageTime")

    // 2
    val testsMetadata = mapOf(
        "testLogin" to "author: Anna, priority: high",
        "testCart" to "author: Ivan, priority: medium",
        "testPayment" to "author: Olga, priority: high"
    )
    val testMethods = testsMetadata.keys
    println(testMethods)

    // 3
    val testResults = mutableMapOf("testLogin" to "passed", "testCart" to "failed")
    testResults.put("testPayment", "passed")
    println(testResults)

    // 4
    val results = mapOf(
        "testLogin" to "passed",
        "testCart" to "failed",
        "testPayment" to "passed",
        "testProfile" to "skipped"
    )
    val passedCount = results.count { it.value == "passed" }
    println("Успешных тестов: $passedCount")

    // 5
    val bugs = mutableMapOf("BUG-1" to "open", "BUG-2" to "fixed", "BUG-3" to "in progress")
    bugs.remove("BUG-2")
    println(bugs)

    // 6
    val pagesStatus = mapOf(
        "https://site.com/home" to 200,
        "https://site.com/about" to 404,
        "https://site.com/contacts" to 500
    )
    pagesStatus.forEach { (url, status) ->
        println("Страница $url, статус $status")
    }

    // 7
    val servicesTime = mapOf("auth" to 120, "payments" to 450, "search" to 300)
    val limit = 250
    val slowServices = servicesTime.filterValues { it > limit }
    println(slowServices)

    // 8
    val apiResults = mapOf("/users" to "200 OK", "/orders" to "500 Internal Server Error")
    val status = apiResults.getOrElse("/products") { "not tested" }
    println("/products: $status")

    // 9
    val config = mapOf("browserType" to "Chrome", "timeout" to "30", "baseUrl" to "https://test.site.com")
    val browserType = config.getValue("browserType")
    println(browserType)

    // 10
    val versions = mapOf("app" to "1.0.0", "backend" to "2.3.1")
    val newVersions = versions + ("frontend" to "1.5.0")
    println(newVersions)

    // 11
    val devices = mapOf(
        "iPhone 15" to "iOS 17, 1179x2556",
        "Pixel 8" to "Android 14, 1080x2400"
    )
    val settings = devices.getOrDefault("Galaxy S23", "default settings")
    println(settings)

    // 12
    val errors = mapOf(404 to "Not Found", 500 to "Internal Server Error")
    val has500 = errors.containsKey(500)
    println(has500)

    // 13
    val scenarios = mapOf(
        "Test1_v1" to "Passed",
        "Test2_v2" to "Failed",
        "Test3_v2" to "Passed",
        "Test4_v1" to "Skipped"
    )
    val version = "v2"
    val scenariosV2 = scenarios.filterKeys { it.endsWith(version) }
    println(scenariosV2)

    // 14
    val modules = mapOf("login" to "Passed", "cart" to "Failed", "payment" to "Passed")
    val hasFailedModules = modules.any { it.value == "Failed" }
    println(hasFailedModules)

    // 15
    val envSettings = mutableMapOf("browser" to "Chrome", "timeout" to "30")
    val newSettings = mapOf("resolution" to "1920x1080", "language" to "ru")
    envSettings.putAll(newSettings)
    println(envSettings)

    // 16
    val bugs1 = mapOf("BUG-1" to "login not working", "BUG-2" to "cart crash")
    val bugs2 = mapOf("BUG-3" to "wrong price", "BUG-4" to "no pay button")
    val allBugs = bugs1.plus(bugs2)
    println(allBugs)

    // 17
    val lastRun = mutableMapOf("startTime" to "10:00", "endTime" to "10:15", "testsCount" to "42")
    lastRun.clear()
    println(lastRun)

    // 18
    val report = mapOf(
        "testLogin" to "passed",
        "testCart" to "skipped",
        "testPayment" to "failed",
        "testProfile" to "skipped"
    )
    val noSkipped = report.filterNot { it.value == "skipped" }
    println(noSkipped)

    // 19
    val testConfigs = mapOf(
        "chrome" to "Chrome 120",
        "firefox" to "Firefox 121",
        "safari" to "Safari 17",
        "edge" to "Edge 120"
    )
    val newConfigs = testConfigs - listOf("safari", "edge")
    println(newConfigs)

    // 20
    val testsById = mapOf("T-1" to "passed", "T-2" to "failed", "T-3" to "passed")
    val reportList = testsById.map { "${it.key}: ${it.value}" }
    println(reportList)

    // 21
    val lastResults = mutableMapOf("testLogin" to "passed", "testCart" to "failed")
    val archive = lastResults.toMap()
    println(archive)

    // 22
    val timeById = mapOf(1 to 2.5, 2 to 3.1, 3 to 1.8)
    val timeByStringId = timeById.mapKeys { it.key.toString() }
    println(timeByStringId)

    // 23
    val performance = mapOf("1.0" to 200.0, "1.1" to 180.0, "2.0" to 150.0)
    val newPerformance = performance.mapValues { it.value * 1.1 }
    println(newPerformance)

    // 24
    val compileErrors = mapOf<String, String>()
    println(compileErrors.isEmpty())

    // 25
    val loadResults = mapOf("100 users" to 1.2, "500 users" to 2.8, "1000 users" to 5.4)
    println(loadResults.isNotEmpty())

    // 26
    val autoTests = mapOf("testLogin" to "passed", "testCart" to "passed", "testPayment" to "failed")
    val allPassed = autoTests.all { it.value == "passed" }
    println(allPassed)

    // 27
    val testing = mapOf("testA" to "passed", "testB" to "failed", "testC" to "passed")
    val hasFailed = testing.containsValue("failed")
    println(hasFailed)

    // 28
    val servicesTests = mapOf(
        "auth_optional_check" to "failed",
        "payment_main_check" to "failed",
        "search_optional_check" to "passed",
        "profile_optional_check" to "skipped"
    )
    val result = servicesTests.filter { it.value != "passed" && it.key.contains("optional") }
    println(result)
}