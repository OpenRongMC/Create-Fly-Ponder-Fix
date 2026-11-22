package rong.createflyfix.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.Optional;

/**
 * Create Fly ponder crash fix: Brass Tunnel (and other sided-filter BE)
 * NBT in ponder scenes may omit/invalid "Side", and Create Fly uses
 * Optional.orElseThrow() which hard-crashes the client when compiling ponder.
 */
@Mixin(targets = "com.zurrtum.create.foundation.blockEntity.behaviour.filtering.ServerSidedFilteringBehaviour", remap = false)
public class ServerSidedFilteringBehaviourMixin {
	@Redirect(
		method = "lambda$read$0",
		at = @At(
			value = "INVOKE",
			target = "Ljava/util/Optional;orElseThrow()Ljava/lang/Object;",
			remap = false
		),
		remap = false,
		require = 1
	)
	private Object createFlyPonderFix$safeSide(Optional<?> optional) {
		return optional.orElse(null);
	}
}
