package rong.createflyfix.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.core.RegistryAccess;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import rong.createflyfix.CreateFlyPonderFix;

import java.util.Map;

@Mixin(targets = "com.zurrtum.create.client.ponder.api.level.PonderLevel", remap = false)
public class PonderLevelMixin {
	@Shadow(remap = false)
	private Map<BlockPos, CompoundTag> originalBlockEntities;

	@Inject(method = "lambda$createBackup$0", at = @At("HEAD"), cancellable = true, remap = false)
	private void createFlyPonderFix$safeBackup(RegistryAccess registries, BlockPos pos, BlockEntity blockEntity, CallbackInfo ci) {
		ci.cancel();
		try {
			this.originalBlockEntities.put(pos, blockEntity.saveWithFullMetadata(registries));
		} catch (RuntimeException t) {
			CreateFlyPonderFix.LOGGER.warn(
				"Ponder backup skipped for {} due to {}",
				blockEntity.getClass().getSimpleName(),
				t.toString()
			);
			this.originalBlockEntities.put(pos, new CompoundTag());
		}
	}
}
