# Create Fly Ponder 修复

简体中文 · [English](./README.en.md)


Create Fly Ponder Fix 是针对 Create Fly 的小型补丁模组。它让部分原本会中断的 Ponder 场景得以继续，也修复了部署器在缺少所有者名称时发生的崩溃。

## 使用

补丁覆盖 Ponder 场景中的缺失侧上下文、部署器的空 OwnerName 以及方块实体备份失败三个路径。目标 Create Fly 版本范围为 `>=6.0.9-2 <6.0.10-0`。

## 安装

在 [GitHub Releases](https://github.com/OpenRongMC/Create-Fly-Ponder-Fix/releases/tag/v1.2.0%2B26.3) 下载 **v1.2.0+26.3**。使用 Minecraft Java **26.3**、**Fabric** 和 **Java 25**。 依赖 [Create Fly](https://github.com/OpenRongMC/Create-Fly)。 将发行 JAR 放进实例的 `mods/` 目录。 与兼容范围内的 Create Fly 同用，版本范围以发行 JAR 中的 fabric.mod.json 为准。一整个服务端整合包优先沿用其指定配置。

## 许可与署名

详见 [LICENSE](./LICENSE) 与原项目署名。
