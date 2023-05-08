package net.swutm.moreuniqueblackstone.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.swutm.moreuniqueblackstone.moreuniqueblackstone;

public class ModBlocks {

    public static final Block CHARRED_BLACKSTONE = registerBlock("charred_blackstone",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()),
            ItemGroup.BUILDING_BLOCKS);

    public static final Block COVERED_WITH_DIAMOND_BLACKSTONE = registerBlock("covered_with_diamond_blackstone",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()),
            ItemGroup.BUILDING_BLOCKS);

    public static final Block COVERED_WITH_EMERALD_BLACKSTONE = registerBlock("covered_with_emerald_blackstone",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()),
            ItemGroup.BUILDING_BLOCKS);

    public static final Block COVERED_WITH_IRON_BLACKSTONE = registerBlock("covered_with_iron_blackstone",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()),
            ItemGroup.BUILDING_BLOCKS);

    public static final Block COVERED_WITH_LAPIS_BLACKSTONE = registerBlock("covered_with_lapis_blackstone",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()),
            ItemGroup.BUILDING_BLOCKS);

    public static final Block COVERED_WITH_NETHERITE_BLACKSTONE = registerBlock("covered_with_netherite_blackstone",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()),
            ItemGroup.BUILDING_BLOCKS);

    public static final Block COVERED_WITH_REDSTONE_BLACKSTONE = registerBlock("covered_with_redstone_blackstone",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()),
            ItemGroup.BUILDING_BLOCKS);

    public static final Block COVERED_WITH_RANDOM_BLACKSTONE = registerBlock("covered_with_random_blackstone",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()),
            ItemGroup.BUILDING_BLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(moreuniqueblackstone.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(moreuniqueblackstone.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        moreuniqueblackstone.LOGGER.debug("Registering ModBlocks for " + moreuniqueblackstone.MOD_ID);
    }
}
