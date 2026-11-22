# Create Fly Ponder Fix

[简体中文](./README.md) · English

Addresses specific Create Fly crashes on 26.3 involving missing side context in Ponder, deployers without OwnerName and block-entity backup failures during tutorials.

## Download and installation

- Version · [v1.2.0+26.3](https://github.com/OpenRongMC/Create-Fly-Ponder-Fix/releases/tag/v1.2.0%2B26.3) (Release)
- Release asset · `rongmc-create-fly-ponder-fix-1.2.0.26.3.jar`
- Runtime · Minecraft Java 26.3, Fabric, Java 25
- Fabric Loader · `>=0.20.1`
- Fabric mod ID · `rongmc_create_fly_ponder_fix`
- Dependencies declared by the JAR · [`create`](https://github.com/OpenRongMC/Create-Fly) `>=6.0.9-2 <6.0.10-0`

Place the release JAR in the instance’s `mods/` directory. Use it only with a supported Create Fly version range as declared in the release JAR’s fabric.mod.json. For a server pack, follow its specified set of builds.

## How to try it

Open the Ponder scene that previously crashed and also test deployer interaction. For new crashes, provide the scene name, Create version and the first relevant mixin or exception stack.

## Development

See [`build.gradle`](./build.gradle) for the build entry point. Check its workspace paths and dependencies before running it.

## Documentation and support

- [Previous README (historical guide, contributors and credits)](https://github.com/OpenRongMC/Create-Fly-Ponder-Fix/blob/0ef939c669ba25432099413b2f3bca9a34507ef0/README.md)
- [Report a RongMC port issue](https://github.com/OpenRongMC/Create-Fly-Ponder-Fix/issues) · Include the game version, client and server JAR names, reproduction steps and relevant logs.

## License and credits

See this repository’s [LICENSE](./LICENSE) and the original project’s license, credits and third-party asset notices.
