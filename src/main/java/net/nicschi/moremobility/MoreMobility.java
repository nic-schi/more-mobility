package net.nicschi.moremobility;

import net.fabricmc.api.ModInitializer;
import net.nicschi.moremobility.enchantments.ModEnchantments;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreMobility implements ModInitializer {
	public static final String MOD_ID = "more-mobility";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModEnchantments.registerModEnchantments();
		LOGGER.info("More Mobility Mod loaded successfully!");
	}
}
