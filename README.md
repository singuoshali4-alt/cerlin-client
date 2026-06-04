# Cerlin Client

A powerful Fabric-based Minecraft 1.21.4 client mod.

## Features

- Built on Fabric for Minecraft 1.21.4
- Modular architecture
- Easy to extend and customize

## Building

Requirements:
- Java 21 or higher
- Gradle

```bash
./gradlew build
```

The built JAR will be in `build/libs/`

## Installation

1. Install [Fabric Loader](https://fabricmc.net/)
2. Place the mod JAR in your `mods/` folder
3. Launch Minecraft with Fabric

## Development

To set up the development environment:

```bash
./gradlew genSources
./gradlew ideaModule
```

## License

MIT License
