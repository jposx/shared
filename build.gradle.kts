plugins {
  `java`
	`java-library`
	`maven-publish`
}

group = "dev.blac.jposx"
version = "0.0.1"


java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(24)
    }
}

publishing {
    publications {
        create<MavenPublication>("gpr") {
            from(components["java"])
            groupId = "dev.blac.jposx"
            artifactId = "jposx-shared"
            version = "0.0.1"
        }
    }

    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/YOUR_GITHUB_USERNAME/jposx-shared")
            credentials {
                username = project.findProperty("gpr.user") as String? ?: System.getenv("GPR_USER")
                password = project.findProperty("gpr.key") as String? ?: System.getenv("GPR_TOKEN")
            }
        }
    }
}
