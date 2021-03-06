package net.blf02.unnamedmod.blocks;

import net.blf02.unnamedmod.UnnamedMod;
import net.blf02.unnamedmod.init.ModBlocks;
import net.blf02.unnamedmod.init.ModCreativeTabs;
import net.blf02.unnamedmod.init.ModItems;
import net.blf02.unnamedmod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
	public BlockBase(String name, Material material) {
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(ModCreativeTabs.fristTab);
		
		ModBlocks.Blocks.add(this);
		ModItems.Items.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		UnnamedMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
