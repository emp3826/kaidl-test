plugins {
    java
    `java-gradle-plugin`
    `maven-publish`
}

dependencies {
    compileOnly(deps.android.gradle)
    compileOnly(gradleApi())
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

gradlePlugin {
    plugins {
        create("golang") {
            id = "com.github.kr328.gradle.golang"
            implementationClass = "com.github.kr328.gradle.golang.ProjectPlugin"
        }
    }
}

publishing {
  repositories {
    maven {
      name = "GitHubPackages"
      url = uri("https://maven.pkg.github.com/emp3826/golang-android-plugin")
      credentials {
        username = System.getenv("GITHUB_ACTOR")
        password = System.getenv("ACCESS_TOKEN")
      }
    }
  }
}
