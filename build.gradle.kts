import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    id("com.adarshr.test-logger") version "3.0.0"
    id("io.gitlab.arturbosch.detekt") version "1.16.0"
    application
}

group = "com.gakshintala.ds-algo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // Junit
    testImplementation(platform("org.junit:junit-bom:+"))
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

    // Kotest
    val kotestVersion = "+"
    testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
    testImplementation("io.kotest:kotest-assertions-core:$kotestVersion")
}

java.sourceCompatibility = JavaVersion.VERSION_16

tasks {
    withType<JavaCompile> {
        options.compilerArgs.addAll(arrayOf("--enable-preview"))
        options.encoding = "UTF-8"
    }
    withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = JavaVersion.VERSION_16.toString()
        }
    }
    withType<Test> {
        useJUnitPlatform()
        ignoreFailures = true
        jvmArgs("--enable-preview")
    }
}

testlogger {
    setTheme("mocha")
    showExceptions = true
    showStackTraces = false
    showFullStackTraces = false
    showCauses = false
    slowThreshold = 2000
    showSummary = true
    showSimpleNames = true
    showPassed = true
    showSkipped = true
    showFailed = true
    showStandardStreams = true
    showPassedStandardStreams = true
    showSkippedStandardStreams = true
    showFailedStandardStreams = true
}
