package com.icecamel.dudmod.core.handlers;


import net.minecraft.src.ModLoader;
import net.minecraftforge.common.AchievementPage;


public class ModAchievementRegistry extends ModAchievementHandler{
    
    public ModAchievementRegistry(){
        AchievementPage.registerAchievementPage(customPage);
        
            ModLoader.addAchievementDesc(makeMits, "Mits", "Woot Spikey Gloves");
            ModLoader.addAchievementDesc(makeShears, "Craft some Shears", "Trimming Time!");
            ModLoader.addAchievementDesc(cobbler, "Gather Cobblestone", "Gather 5000 Cobblestone");
            ModLoader.addAchievementDesc(burgers, "BBQ Time!", "Cook 10 Steaks");
            ModLoader.addAchievementDesc(wool, "Wool", "Obtain some Wool");
            ModLoader.addAchievementDesc(redwool, "Red Wool", "Make Red Wool");
            ModLoader.addAchievementDesc(yellowwool, "Yellow Wool", "Make Yellow Wool");
            ModLoader.addAchievementDesc(greenwool, "Green Wool", "Make Green Wool");
            ModLoader.addAchievementDesc(orangewool, "Orange Wool", "Make Orange Wool");
            ModLoader.addAchievementDesc(blackwool, "Black Wool", "Make Black Wool");
            ModLoader.addAchievementDesc(magentawool, " Magenta Wool", "Make Magenta Wool");
            ModLoader.addAchievementDesc(ltbluewool, "Light Blue Wool", "Make Light Blue Wool");
            ModLoader.addAchievementDesc(limewool, "Lime Wool", "Make Lime Wool");
            ModLoader.addAchievementDesc(pinkwool, "Pink Wool", "Make Pink Wool");
            ModLoader.addAchievementDesc(graywool, "Gray Wool", "Make Gray Wool");
            ModLoader.addAchievementDesc(ltgraywool, "Light Gray Wool", "Make Light Gray Wool");
            ModLoader.addAchievementDesc(cyanwool, "Cyan Wool", "Make Cyan Wool");
            ModLoader.addAchievementDesc(purplewool, "Purple Wool", "Make Purple Wool");
            ModLoader.addAchievementDesc(bluewool, "Blue Wool", "Make Blue Wool");
            ModLoader.addAchievementDesc(brownwool, "Brown Wool", "Make Brown Wool");
            ModLoader.addAchievementDesc(lapisblock, "Lapis Block", "Make a Lapis Block");
            
            
            //SkyBlock Achievement Registry
            AchievementPage.registerAchievementPage(skyBlock);
            
            ModLoader.addAchievementDesc(cobblegen, "Cobble Generator", "Build a cobblestone generator");
            ModLoader.addAchievementDesc(expand, "Expand the Island", "Expand the Island");
            ModLoader.addAchievementDesc(bed, "Make a bed", "Make a Bed");
            ModLoader.addAchievementDesc(gredmushroom, "Grow a Giant Red Mushroom", "Grow a Giant Red Mushroom");
            ModLoader.addAchievementDesc(house, "Build a House", "Build a House");
            ModLoader.addAchievementDesc(melon, "Grow some melons", "Grow a Melon Farm");
            ModLoader.addAchievementDesc(pumpkin, "Grow a pumpkin farm", "Grow a Pumpkin Farm");
            ModLoader.addAchievementDesc(reeds, "Grow some Reeds", "About 10 should do");
            ModLoader.addAchievementDesc(wheat, "Grow some wheat for bread", "Make 10 bread from wheat");
            ModLoader.addAchievementDesc(stonebricks, "Make 40 Stone Bricks", "Make 40 Stone Bricks");
            ModLoader.addAchievementDesc(torches, "Make 20 Torches", "Make 20 Torches");
            ModLoader.addAchievementDesc(water, "Make an Infinate Water Source", "Make an Infinate Water Source");
            ModLoader.addAchievementDesc(furnace, "Build a Furnace", "Build a Furnace");
            ModLoader.addAchievementDesc(lake, "Make a Small Lake", "Make a Small Lake");
            ModLoader.addAchievementDesc(spawner, "Build a Mob Trap 24+ blocks away", "Build a Mob Trap 24+ blocks away");
            ModLoader.addAchievementDesc(greendye, "Make 10 Green Dye", "Make 10 Green Dye");
            ModLoader.addAchievementDesc(stew, "Make 10 Mushroom Stew", "Make 10 Mushroom Stew");
            ModLoader.addAchievementDesc(jackolanterns, "Make 10 Jack O' Lanterns", "Make 10 Jack O' Lanterns");
            ModLoader.addAchievementDesc(bookshelves, "Make 10 Bookshelves", "Make 10 Bookshelves");
            ModLoader.addAchievementDesc(bread, "Make 10 Bread", "Make 10 Bread");
            ModLoader.addAchievementDesc(fish, "Cook 10 Fish", "Cook 10 Fish");
            ModLoader.addAchievementDesc(golems, "Craft 10 Snow Golems", "Craft 10 Snow Golems");
    }
}