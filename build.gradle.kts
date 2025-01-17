// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        maven {
            setUrl("http://192.168.1.5:8081/repository/maven-public/")
            isAllowInsecureProtocol = true
        }
        google()
        mavenCentral()
        maven("https://api.xposed.info")
        maven("https://jitpack.io")
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.1.3")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.21")
        classpath("com.github.CodingGay:BlackObfuscator-ASPlugin:3.7")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

tasks.register("Delete", Delete::class) {
    delete(rootProject.buildDir)
}