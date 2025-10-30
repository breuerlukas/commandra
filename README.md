# Commandra

Commandra is a modular Java command-line framework that empowers developers to define, extend, and control custom terminal commands with dynamic behavior.
It provides a flexible architecture for building interactive CLI systems, allowing you to implement commands, attach logic, and manage terminal interactions with precision and ease.

## Status

|      | Build Status                                                                                         |
|------|------------------------------------------------------------------------------------------------------|
| main | ![Java CI with Gradle](https://github.com/breuerlukas/commandra/actions/workflows/gradle.yml/badge.svg) |

## Installation

```
repositories {
  maven {
    url = uri("https://maven.pkg.github.com/breuerlukas/commandra")
    credentials {
      username = project.findProperty("gpr.user")?.toString() ?: System.getenv("GITHUB_USERNAME")
      password = project.findProperty("gpr.token")?.toString() ?: System.getenv("GITHUB_TOKEN")
    }
  }
}

dependencies {
  implementation("de.lukasbreuer:commandra:1.0.0-SNAPSHOT")
}
```

## License

[GPL](https://github.com/breuerlukas/commandra/blob/main/LICENSE.md)