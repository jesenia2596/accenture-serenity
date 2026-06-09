plugins {
    java
    id("net.serenity-bdd.serenity-gradle-plugin") version "3.9.8"
}

group = "com.automatizacion.qa"
version = "1.0-SNAPSHOT"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

repositories {
    mavenCentral()
}

dependencies {

    dependencies {

        // Serenity
        testImplementation("net.serenity-bdd:serenity-core:3.9.8")
        testImplementation("net.serenity-bdd:serenity-junit:3.9.8")
        implementation("net.serenity-bdd:serenity-screenplay:3.9.8")
        implementation("net.serenity-bdd:serenity-screenplay-webdriver:3.9.8")
        testImplementation("net.serenity-bdd:serenity-cucumber:3.9.8")

        // Selenium
        testImplementation("org.seleniumhq.selenium:selenium-java:4.15.0")

        // 👉 JUnit 4 (CLAVE)
        testImplementation("junit:junit:4.13.2")
    }
}


    tasks.test {
    useJUnit()
}
