rootProject.name = "anchovy"

pluginManagement {
    repositories {
        maven {
            url = java.net.URI("https://oss.sonatype.org/content/repositories/snapshots/")
        }
        gradlePluginPortal()
    }
}
