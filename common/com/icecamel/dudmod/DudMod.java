package com.icecamel.dudmod;

import com.icecamel.dudmod.core.handlers.ModAchievementHandler;
import com.icecamel.dudmod.core.handlers.ModAchievementRegistry;
import com.icecamel.dudmod.core.handlers.ModCraftingHandler;
import com.icecamel.dudmod.core.handlers.ModPickupHandler;
import com.icecamel.dudmod.item.Dudmits;
import com.icecamel.dudmod.item.RockHammer;
import com.icecamel.dudmod.lib.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Reference.MOD_ID,name = Reference.MOD_NAME, version = Reference.VERSION)

@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class DudMod {
	
    public final static Item Dudmits = new Dudmits(5000, EnumToolMaterial.STONE).setMaxStackSize(1).setUnlocalizedName("dudmits").setCreativeTab(CreativeTabs.tabCombat); 
	public final static Item RockHammer = new RockHammer(5001,EnumToolMaterial.IRON).setMaxStackSize(1).setUnlocalizedName("rockhammer").setCreativeTab(CreativeTabs.tabCombat);
	


    public static ModCraftingHandler modCraftHandler = new ModCraftingHandler();
    public static ModPickupHandler modPickupHandler = new ModPickupHandler();
   
    
    // initialize Achievements
    ModAchievementHandler achHandler = new ModAchievementHandler();
    
@PreInit
public void preInit(FMLPreInitializationEvent event){
    
    
}

@Init
    public void load(FMLInitializationEvent event){
	    GameRegistry.registerCraftingHandler(modCraftHandler);
	    GameRegistry.registerPickupHandler(modPickupHandler);	
	
	// initialize Achievement Pages
	    @SuppressWarnings("unused")
        ModAchievementRegistry achReg = new ModAchievementRegistry();
	
	// These define the items that are used in custom recipes..
		ItemStack leather = new ItemStack(Item.leather);
		ItemStack iron = new ItemStack(Item.ingotIron);
		ItemStack string = new ItemStack(Item.silk);
		ItemStack woodstick = new ItemStack(Item.stick);
		
		// Custom recipes go here	
		
		
		//recipe for dudmits
		GameRegistry.addRecipe(new ItemStack(Dudmits), "ii ", "ill", "  s", 'i', iron, 'l', leather, 's', string);
		LanguageRegistry.addName(Dudmits, "Dud Mits");
		//recipe for rock hammer
		GameRegistry.addRecipe(new ItemStack(RockHammer), "iwi"," w "," w ", 'i', iron, 'w', woodstick);
		LanguageRegistry.addName(RockHammer, "Rock Hammer");
}

@PostInit
public void postInit(FMLPostInitializationEvent event){
    
}
}
