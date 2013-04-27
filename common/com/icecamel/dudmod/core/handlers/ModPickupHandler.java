package com.icecamel.dudmod.core.handlers;


import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.common.IPickupNotifier;
import net.minecraft.stats.*;

public class ModPickupHandler extends ModCounters implements IPickupNotifier{
    
    @Override
    public void notifyPickup(EntityItem item, EntityPlayer player){
       if(item.getEntityItem().itemID == Block.cobblestone.blockID){
        //if(StatList.objectMineStats == Block.cobblestone){
           
          //if(StatBase..equals(Block.cobblestone)){
               
                cobCount++;
                System.out.println("cobCount = " + cobCount);                
                player.addStat(ModAchievementHandler.cobblegen, 1);
                
                

            }
            
            if(StatList.objectMineStats.equals(Block.stone.blockID)){
                
                stoneCount++;
                System.out.println("stoneCount = " + stoneCount);                
                player.addStat(ModAchievementHandler.cobblegen, 1);

            }
            
            if (cobCount >= 500){
            player.addStat(ModAchievementHandler.cobbler, 1);
            }
    }
}
