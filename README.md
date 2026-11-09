# AeroFabric

AeroFabric is a Minecraft mod that ports Create Aeronautics for Minecraft NeoForge 1.21.1 to work with Create Fly on Minecraft Fabric 26.3, using Sodium for Fabric 26.3. This mod allows players to enjoy the aeronautical features of Create Aeronautics in a Fabric environment, providing compatibility with other Fabric mods and enhancing the overall gameplay experience.

## Install

1. Download the latest version of AeroFabric from the [GitHub releases page](https://github.com/EnderDevelopment/AeroFabric/releases).
2. Place the downloaded `.jar` file into the `mods` folder of your Minecraft Fabric 26.3 installation.
3. Ensure you have the required dependencies installed: Create Fabric, Create Fly Fabric, and Sodium Fabric.
4. Launch Minecraft with the Fabric loader.

## Use

1. Launch Minecraft with the AeroFabric mod installed.
2. Follow the in-game instructions or mod documentation to set up and use the aeronautical features.
3. Enjoy the enhanced aeronautical gameplay provided by AeroFabric.

## CI / Build

推送到 `main`、提交 PR，或在 Actions 页面手动运行 **Build Mod**，会自动用 JDK 21 + Gradle 8.14.2 构建，生成的 `.jar` 可在该次运行页面的 **Artifacts** 中下载（保留 30 天）。

- 推送 `v*` 标签会自动创建 Release 并附上 jar。
- 手动运行时勾选 `publish_release` 也可发布 Release。
- 本地构建：`./gradlew build`，产物在 `build/libs/`。首次构建需要下载 Minecraft / NeoForge 依赖，耗时较长。

---

More Minecraft mod projects by EnderDevelopment: https://github.com/EnderDevelopment

Project page: https://dash.enderdevelopment.com/community/83a7d9ca-d200-4c13-a2ac-7470f02787c5?utm_source=github&utm_medium=readme&utm_campaign=auto_publish&utm_content=83a7d9ca-d200-4c13-a2ac-7470f02787c5
