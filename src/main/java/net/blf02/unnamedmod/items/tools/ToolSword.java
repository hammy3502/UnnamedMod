package net.blf02.unnamedmod.items.tools;

import net.blf02.unnamedmod.UnnamedMod;
import net.blf02.unnamedmod.init.ModCreativeTabs;
import net.blf02.unnamedmod.init.ModItems;
import net.blf02.unnamedmod.util.IHasModel;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel {
	public ToolSword(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(ModCreativeTabs.fristTab);
		
		ModItems.Items.add(this);
	}
	
	@Override
	public void registerModels() {
		UnnamedMod.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
