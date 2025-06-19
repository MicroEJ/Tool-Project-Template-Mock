plugins {
    id("com.microej.gradle.mock") version "1.3.0"
}

group = "com.mycompany"
version = "0.1.0-RC"

dependencies {
    compileOnly("com.microej.tool.runtime:mock-api:2.6.0")
}
