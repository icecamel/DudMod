package com.icecamel.dudmod.core.handlers;

import com.icecamel.dudmod.DudMod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class ModAchievementHandler {
    
 // define custom Achievements here
    public static final Achievement makeShears = new Achievement(30, "Shears", -2, -2, Item.shears, (Achievement)null).setIndependent().registerAchievement();
    public static final Achievement makeMits = new Achievement(31, "Mits", -1, -1, DudMod.Dudmits, makeShears).registerAchievement();
    public static final Achievement cobbler = new Achievement(32, "Cobbler", 0, 0, Block.cobblestone, null).registerAchievement();
    public static final Achievement burgers = new Achievement(33, "Burgers", 1, 1, Item.beefCooked, null).registerAchievement();
    public static final Achievement wool = new Achievement(36, "Wool", -1, 0, Block.cloth, null).setIndependent().registerAchievement();
    public static final Achievement redwool = new Achievement(34, "RedWool", 0, 1, Block.cloth, wool).registerAchievement();
    public static final Achievement yellowwool = new Achievement(35, "YellowWool", 0, 2,Block.cloth, wool).registerAchievement();
    public static final Achievement greenwool = new Achievement(37, "GreenWool", 0, 3, Block.cloth, wool).registerAchievement();
    public static final Achievement orangewool = new Achievement(38, "OrangeWool", 0, 4, Block.cloth, wool).registerAchievement();
    public static final Achievement blackwool = new Achievement(39, "BlackWool", 0, 5, Block.cloth, wool).registerAchievement();
    public static final Achievement magentawool = new Achievement(40, "MagentaWool", 0, 6, Block.cloth, wool).registerAchievement();
    public static final Achievement ltbluewool = new Achievement(41, "LtBlueWool", 0, 7, Block.cloth, wool).registerAchievement();
    public static final Achievement limewool = new Achievement(42, "LimeWool", 0, 8, Block.cloth, wool).registerAchievement();
    public static final Achievement pinkwool = new Achievement(43, "PinkWool", 0, 9, Block.cloth, wool).registerAchievement();
    public static final Achievement graywool = new Achievement(44, "GrayWool", 0, 10, Block.cloth, wool).registerAchievement();
    public static final Achievement ltgraywool = new Achievement(45, "LtGrayWool", 0, 11, Block.cloth, wool).registerAchievement();
    public static final Achievement cyanwool = new Achievement(46, "CyanWool", 0, 12, Block.cloth, wool).registerAchievement();
    public static final Achievement purplewool = new Achievement(47, "PurpleWool", 0, 13, Block.cloth, wool).registerAchievement();
    public static final Achievement bluewool = new Achievement(48, "BlueWool", 0, 14, Block.cloth, wool).registerAchievement();
    public static final Achievement brownwool = new Achievement(49, "BrownWool", 0, 15, Block.cloth, wool).registerAchievement();
    public static final Achievement lapisblock = new Achievement(50, "LapisBlock", -5, -5, Block.blockLapis, null).registerAchievement();
     
    //skyblock achievements
    public static final Achievement cobblegen = new Achievement(100, "CobbleGenerator", 0, 0, Block.cobblestone, null).registerAchievement();
    public static final Achievement house = new Achievement(101, "House", -4, 1, Item.doorWood, cobblegen).registerAchievement();
    public static final Achievement expand = new Achievement(102, "ExpandIslan", -3, 1, Block.dirt, cobblegen).registerAchievement();
    public static final Achievement melon = new Achievement(103, "MelonFarm", -2, 1, Block.melon, cobblegen).registerAchievement();
    public static final Achievement pumpkin = new Achievement(104, "PumpkinFarm", -1, 1, Block.pumpkin, cobblegen).registerAchievement();
    public static final Achievement reeds = new Achievement(105, "ReedFarm", 0, 1, Block.reed, cobblegen).registerAchievement();
    public static final Achievement wheat = new Achievement(106, "WheatFarm", 1, 1,Item.wheat, cobblegen).registerAchievement();
    public static final Achievement gredmushroom = new Achievement(107, "GiantRedMushroom", 2, 1, Block.mushroomCapRed, cobblegen).registerAchievement();
    public static final Achievement bed = new Achievement(108, "BuildABed", 3, 1, Item.bed, cobblegen).registerAchievement();
    public static final Achievement stonebricks = new Achievement(109, "StoneBricks", 4, 1, Block.stoneBrick,cobblegen).registerAchievement();
    public static final Achievement torches = new Achievement(110,"Torches", -4, 2, Block.torchWood, cobblegen).registerAchievement();
    public static final Achievement water = new Achievement(111, "InfinateWater", -3, 2, Block.waterStill, cobblegen).registerAchievement();
    public static final Achievement furnace = new Achievement(112, "BuildFurnace", -2, 2, Block.furnaceBurning, cobblegen).registerAchievement();
    public static final Achievement lake = new Achievement(113, "Lake", -1, 2, Block.waterStill, cobblegen).registerAchievement();
    public static final Achievement spawner = new Achievement(114, "MobSpawner", 0, 2, Block.web, cobblegen).registerAchievement();
    public static final Achievement greendye = new Achievement(115, "MakeGreenDye", 1, 2, Block.cactus, cobblegen).registerAchievement();
    public static final Achievement stew = new Achievement(116, "MushroomStew", 2, 2, Item.bowlSoup, cobblegen).registerAchievement();
    public static final Achievement jackolanterns = new Achievement(117, "JackOLanterns", 3, 2, Block.pumpkin, cobblegen).registerAchievement();
    public static final Achievement bookshelves = new Achievement(118, "MakeBookshelves", 4, 2, Block.bookShelf, cobblegen).registerAchievement();
    public static final Achievement bread = new Achievement(119, "MakeBread", -1, 3, Item.bread, cobblegen).registerAchievement();
    public static final Achievement fish = new Achievement(120, "CatchFish", 0, 3, Item.fishCooked, cobblegen).registerAchievement();
    public static final Achievement golems = new Achievement(121, "SnowGolems", 1, 3, Block.snow, cobblegen).registerAchievement();

    
    
    // This defines the title of the custom Achievement Page. Add all the achievements to the arguments.
    public static AchievementPage customPage = new AchievementPage("Dudmod", makeMits, makeShears, cobbler, burgers, wool,
                redwool, yellowwool, greenwool, orangewool, blackwool, magentawool, ltbluewool, limewool, pinkwool, graywool,
                ltgraywool, cyanwool, purplewool, bluewool, brownwool, lapisblock);
    
    public static AchievementPage skyBlock = new AchievementPage("Sky Block", cobblegen, house, expand, melon, pumpkin, reeds,
        wheat, gredmushroom, bed, stonebricks, torches, water, furnace, lake, spawner, greendye, stew, jackolanterns, bookshelves, 
        bread, fish, golems);   
 
}
