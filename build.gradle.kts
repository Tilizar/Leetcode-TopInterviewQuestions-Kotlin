plugins {
    kotlin("jvm") version "1.9.21"
}

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(19)
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}