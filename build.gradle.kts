plugins {
    java
}

group = "ru.technicalExcellence.codingDojo"
version = "1.0"

repositories {
    mavenCentral()
}

val junitVersion = "5.8.2"
val mockitoVersion = "4.2.0"

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:$junitVersion")

    testImplementation("org.mockito:mockito-core:$mockitoVersion")
    testImplementation("org.mockito:mockito-junit-jupiter:$mockitoVersion")

    testImplementation("org.junit.jupiter:junit-jupiter-params:5.10.0")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

