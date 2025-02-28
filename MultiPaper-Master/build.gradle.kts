version = "2.0.7"

plugins {
    `java`
    `maven-publish`
}

repositories {
    maven {
        url = uri("https://oss.sonatype.org/content/repositories/snapshots")
    }
}

dependencies {
    implementation("org.jetbrains:annotations:22.0.0")
    implementation("net.md-5:bungeecord-api:1.16-R0.4")
}

tasks.jar {
    manifest {
        attributes(
                "Main-Class" to "puregero.multipaper.server.MultiPaperServer"
        )
    }
}
