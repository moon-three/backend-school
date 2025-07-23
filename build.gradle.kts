plugins {
    id("java")
}

group = "dev.seohee"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.assertj:assertj-core:3.23.1")
    testImplementation("net.datafaker:datafaker:2.4.2");
}

tasks.test {
    useJUnitPlatform()
}