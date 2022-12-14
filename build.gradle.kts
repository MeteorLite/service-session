plugins {
    id("com.github.johnrengelman.shadow") version "5.2.0"
    java
    application
}

group = "com.openosrs"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    annotationProcessor("org.projectlombok:lombok:1.18.24")
    implementation("com.google.code.gson:gson:2.10")
    implementation("org.springframework.boot:spring-boot-starter-web:2.7.5")
    implementation("org.projectlombok:lombok:1.18.24")
}

application {
    mainClass.set("service.SpringBootWebApplication")
}