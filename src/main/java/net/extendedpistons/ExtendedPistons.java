package net.extendedpistons;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.PistonBlock;
import net.minecraft.block.PistonExtensionBlock;
import net.minecraft.block.PistonHeadBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ExtendedPistons implements ModInitializer {
	public static final PistonBlock Gold_piston = new PistonBlock(true, FabricBlockSettings.of(Material.METAL).build());
	//public static final PistonExtensionBlock Gold_piston_extend = new PistonExtensionBlock(FabricBlockSettings.of(Material.METAL).build());
	public static final PistonHeadBlock Gold_piston_head = new PistonHeadBlock(FabricBlockSettings.of(Material.METAL).build());

	@Override
	public void onInitialize() {
		
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		//Blocks
		Registry.register(Registry.BLOCK, new Identifier("extendedpistons", "gold_piston"), Gold_piston);
		//Registry.register(Registry.BLOCK, new Identifier("extendedpistons", "gold_piston"), Gold_piston_extend);
		Registry.register(Registry.BLOCK, new Identifier("extendedpistons", "gold_piston_head"), Gold_piston_head);

		//Items
		Registry.register(Registry.ITEM, new Identifier("extendedpistons", "gold_piston"), new BlockItem(Gold_piston, new Item.Settings().group(ItemGroup.MISC)));
		//Registry.register(Registry.ITEM, new Identifier("extendedpistons", "gold_piston_extend"), new BlockItem(Gold_piston_extend, new Item.Settings()));
		Registry.register(Registry.ITEM, new Identifier("extendedpistons", "gold_piston_head"), new BlockItem(Gold_piston_head, new Item.Settings().group(ItemGroup.MISC)));


	}
}
