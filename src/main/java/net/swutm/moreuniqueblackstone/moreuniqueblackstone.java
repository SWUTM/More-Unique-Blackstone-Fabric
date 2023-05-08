package net.swutm.moreuniqueblackstone;

import net.fabricmc.api.ModInitializer;
import net.swutm.moreuniqueblackstone.block.ModBlocks;
import net.swutm.moreuniqueblackstone.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class moreuniqueblackstone implements ModInitializer {
	public static final String MOD_ID = "moreuniqueblackstone";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
