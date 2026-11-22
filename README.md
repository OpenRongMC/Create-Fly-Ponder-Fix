# Create Fly Ponder 修复

简体中文 · [English](./README.en.md)

修复 26.3 Create Fly 的若干已定位崩溃，包括 Ponder 无侧上下文、Deployer 缺 OwnerName，以及教程中的方块实体备份失败。

## 下载与安装

- 版本 · [v1.2.0+26.3](https://github.com/OpenRongMC/Create-Fly-Ponder-Fix/releases/tag/v1.2.0%2B26.3) (已发布)
- 下载文件 · `rongmc-create-fly-ponder-fix-1.2.0.26.3.jar`
- 运行环境 · Minecraft Java 26.3, Fabric, Java 25
- Fabric Loader · `>=0.20.1`
- Fabric 模组 ID · `rongmc_create_fly_ponder_fix`
- JAR 声明的依赖 · [`create`](https://github.com/OpenRongMC/Create-Fly) `>=6.0.9-2 <6.0.10-0`

把发行 JAR 放入对应实例的 `mods/` 目录。与兼容范围内的 Create Fly 同用，版本范围以发行 JAR 中的 fabric.mod.json 为准。一整个服务端整合包优先沿用其指定配置。

## 如何验证

打开此前触发崩溃的 Ponder 场景，再检查部署器交互。反馈新崩溃时提供场景名、Create 版本和首段 mixin 或异常堆栈。

## 开发

构建入口见 [`build.gradle`](./build.gradle)。运行前检查脚本需要的工作区目录与依赖。

## 文档与反馈

- [原 README（旧版指南、贡献者与署名）](https://github.com/OpenRongMC/Create-Fly-Ponder-Fix/blob/0ef939c669ba25432099413b2f3bca9a34507ef0/README.md)
- [报告 RongMC 移植问题](https://github.com/OpenRongMC/Create-Fly-Ponder-Fix/issues) · 请附游戏版本、两端 JAR 文件名、复现步骤和相关日志。

## 许可与署名

请参阅本仓库的 [LICENSE](./LICENSE) 及原项目的许可、署名和第三方资源说明。
