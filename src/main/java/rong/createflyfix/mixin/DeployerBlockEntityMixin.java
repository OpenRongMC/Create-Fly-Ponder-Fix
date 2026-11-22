package rong.createflyfix.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Create Fly writes OwnerName with Codec.STRING even when it is null
 * (owner UUID present, name missing). That NPEs during ponder backup.
 */
@Mixin(targets = "com.zurrtum.create.content.kinetics.deployer.DeployerBlockEntity", remap = false)
public class DeployerBlockEntityMixin {
	@Shadow(remap = false)
	protected String ownerName;

	@Inject(method = "write(Lnet/minecraft/world/level/storage/ValueOutput;Z)V", at = @At("HEAD"), remap = false)
	private void createFlyPonderFix$sanitizeOwnerName(CallbackInfo ci) {
		if (this.ownerName == null) {
			this.ownerName = "";
		}
	}
}
