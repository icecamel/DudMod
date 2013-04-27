package com.icecamel.dudmod.core.handlers;

import com.icecamel.dudmod.DudMod;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.ICraftingHandler;


public class ModCraftingHandler extends ModCounters implements ICraftingHandler{
    
    
	
	@Override
	public void onCrafting(EntityPlayer player, ItemStack item,	IInventory craftMatrix) {
		if (item.itemID == DudMod.Dudmits.itemID){
			System.out.println("You made some Dudmits");
			player.addStat(ModAchievementHandler.makeMits, 1);
		}
		
		if (item.itemID == Item.shears.itemID){
			System.out.println("You made some Shears");
			player.addStat(ModAchievementHandler.makeShears, 1);
		}
		
		if (item.itemID == Block.blockLapis.blockID){
            System.out.println("You made a Lapis Block");
            player.addStat(ModAchievementHandler.lapisblock, 1);
        }
		
		if (item.itemID == Block.bed.blockID){
            System.out.println("You made a Bed");
            player.addStat(ModAchievementHandler.bed, 1);
        }
		
		if (item.itemID == Block.furnaceBurning.blockID){
            System.out.println("You made a Furnace");
            player.addStat(ModAchievementHandler.furnace, 1);
        }
		
		if (item.itemID == Item.bowlSoup.itemID){
            System.out.println("You made mushroom soup");
            player.addStat(ModAchievementHandler.stew, 1);
        }
		
		if (item.itemID == Item.dyePowder.itemID){
		    
		    item.getItemDamage();
		    if(item.getItemDamage() == 2){
            System.out.println("You made a green dye");
            player.addStat(ModAchievementHandler.greendye, 1);
		    }
		}
		
		if (item.itemID == Block.blockLapis.blockID){
            System.out.println("You made a Lapis Block");
            player.addStat(ModAchievementHandler.lapisblock, 1);
        }
		
		if (item.itemID == Block.blockLapis.blockID){
            System.out.println("You made a Lapis Block");
            player.addStat(ModAchievementHandler.lapisblock, 1);
        }
		if(item.itemID == Block.cloth.blockID){
		switch(item.getItemDamage()){
	        case 0: 
	            player.addStat(ModAchievementHandler.wool, 1);
	            return;
	        case 1: 
	            player.addStat(ModAchievementHandler.orangewool, 1);
	            return;
            case 2: 
                player.addStat(ModAchievementHandler.magentawool, 1);
                return;
            case 3: 
                player.addStat(ModAchievementHandler.ltbluewool, 1);
                return;
            case 4: 
                player.addStat(ModAchievementHandler.yellowwool, 1);
                return;
            case 5: 
                player.addStat(ModAchievementHandler.limewool, 1);
                return;
            case 6: 
                player.addStat(ModAchievementHandler.pinkwool, 1);
                return;
            case 7: 
                player.addStat(ModAchievementHandler.graywool, 1);
                return;
            case 8: 
                player.addStat(ModAchievementHandler.ltgraywool, 1);
                return;
            case 9: 
                player.addStat(ModAchievementHandler.cyanwool, 1);
                return;
            case 10: 
                player.addStat(ModAchievementHandler.purplewool, 1);
                return;
            case 11: 
                player.addStat(ModAchievementHandler.bluewool, 1);
                return;
            case 12: 
                player.addStat(ModAchievementHandler.brownwool, 1);
                return;
            case 13: 
                player.addStat(ModAchievementHandler.greenwool, 1);
                return;
            case 14:
                player.addStat(ModAchievementHandler.redwool, 1);
                return;
            case 15: 
                player.addStat(ModAchievementHandler.blackwool, 1);
                return;
          }
	   
	}
		
	}
	
	
	    


    @Override
	public void onSmelting(EntityPlayer player, ItemStack item) {
	    if (item.itemID == Item.beefCooked.itemID){
	        this.beefCount = beefCount + item.stackSize;
	        System.out.println("Beef Steaks: " + beefCount);
	    }
	    if (beefCount >= 10){
	        player.addStat(ModAchievementHandler.burgers, 1);
	    }
		
	}
}