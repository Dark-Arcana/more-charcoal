package al132.morecharcoal;


import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import java.util.ArrayList;

public class ModItems {

    public static ArrayList<ItemCharcoalBase> charcoalItems = new ArrayList<>();

    public static ItemFruitCharcoalBase appleCharcoal = new ItemFruitCharcoalBase("apple_charcoal", new ItemStack(Items.APPLE), Config.appleFuelValue);
    public static ItemFruitCharcoalBase beetCharcoal = new ItemFruitCharcoalBase("beet_charcoal", new ItemStack(Items.BEETROOT), Config.beetFuelValue);
    public static ItemFruitCharcoalBase chorusCharcoal = new ItemFruitCharcoalBase("chorus_charcoal", new ItemStack(Items.POPPED_CHORUS_FRUIT), Config.chorusFuelValue);
    public static ItemFruitCharcoalBase potatoCharcoal = new ItemFruitCharcoalBase("potato_charcoal", new ItemStack(Items.BAKED_POTATO), Config.potatoFuelValue);
    public static ItemFruitCharcoalBase sugarcaneCharcoal = new ItemFruitCharcoalBase("sugarcane_charcoal", new ItemStack(Blocks.SUGAR_CANE), Config.sugarcaneFuelValue);
    public static ItemFruitCharcoalBase carrotCharcoal = new ItemFruitCharcoalBase("carrot_charcoal", new ItemStack(Items.CARROT), Config.carrotFuelValue);
    public static ItemFruitCharcoalBase breadCharcoal = new ItemFruitCharcoalBase("bread_charcoal", new ItemStack(Items.BREAD), Config.breadFuelValue);
    public static ItemFruitCharcoalBase eggCharcoal = new ItemFruitCharcoalBase("egg_charcoal", new ItemStack(Items.EGG), Config.eggFuelValue);
    public static ItemFruitCharcoalBase melonCharcoal = new ItemFruitCharcoalBase("melon_charcoal", new ItemStack(Items.MELON_SLICE), Config.melonFuelValue);
    public static ItemCharcoalBase charcoalChunk = new ItemCharcoalBase("charcoal_chunk", 200);
    public static ItemCharcoalBase coalChunk = new ItemCharcoalBase("coal_chunk", 200);

}