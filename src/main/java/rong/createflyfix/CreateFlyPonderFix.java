package rong.createflyfix;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateFlyPonderFix implements ModInitializer {
	public static final String MOD_ID = "create_fly_ponder_fix";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Create Fly ponder/ponder crash fix v1.1.1 loaded");
	}
}
