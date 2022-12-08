subprojects {
    group = "com.github.kr328.gradle.golang"
    version = "1.0.4"

    repositories {
        mavenCentral()
        google()
    }

    afterEvaluate {
        extensions.configure<PublishingExtension> {
            val sourcesJar = tasks.register("sourcesJar", type = Jar::class) {
                archiveClassifier.set("sources")

                from(project.extensions.getByType(SourceSetContainer::class)["main"].allSource)
            }
        }
    }
}
