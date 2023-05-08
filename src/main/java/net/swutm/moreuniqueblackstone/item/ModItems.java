package net.swutm.moreuniqueblackstone.item;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.swutm.moreuniqueblackstone.moreuniqueblackstone;

public class ModItems {







    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(moreuniqueblackstone.MOD_ID, name), item);
    }

    public static void registerModItems() {
        moreuniqueblackstone.LOGGER.info("1" + moreuniqueblackstone.MOD_ID);
    }
}

