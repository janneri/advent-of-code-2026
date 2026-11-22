plugins {
    kotlin("jvm") version "2.4.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val ksmtVersion = "0.6.7"

dependencies {
    testImplementation(kotlin("test"))
    implementation("io.ksmt:ksmt-core:$ksmtVersion")
    implementation("io.ksmt:ksmt-z3:$ksmtVersion")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}
