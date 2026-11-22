# Create Fly Ponder Fix

RongMC 自研的小型修复模组，专门缓解 **Create Fly（26.3）** 在 Ponder 教程/部分方块实体场景下的崩溃。

## 功能

针对 Create Fly 的 mixin 修复，主要包括：

1. **Sided filter**：避免 `Side.orElseThrow` 在 Ponder/无侧上下文空值崩溃。
2. **Deployer**：`OwnerName` 为空时的空指针。
3. **Ponder 方块实体备份**：失败时软失败，而不是直接把教程打崩。

依赖：`create`（Create Fly 构建，版本范围见 `fabric.mod.json`）。

Fabric id：`rongmc_create_fly_ponder_fix`（provides `create_fly_ponder_fix`）。

## 已知问题

- 只覆盖已定位的崩溃点；Create 其它 Ponder 页或新版本回归不在保证范围。
- 不能代替完整的 Create 源码级修复；Create 本体升级后可能需要重做 mixin。

## 许可

GPL-3.0（见 `LICENSE`）。
