package al132.morecharcoal;

import java.util.ArrayList;

public class ModBlocks {

    public static ArrayList<BlockCharcoalBase> charcoalBlocks = new ArrayList<>();

    public static BlockCharcoalBase charcoalBlock = new BlockCharcoalBase("charcoal_block", 10 * 1600);

    public static BlockCharcoalBase sugarcaneCharcoalBlock = new BlockCharcoalBase("sugarcane_charcoal_block",
            10 * ModItems.sugarcaneCharcoal.burnTime);

    public static BlockCharcoalBase carrotCharcoalBlock = new BlockCharcoalBase("carrot_charcoal_block",
            10 * ModItems.carrotCharcoal.burnTime);

    public static BlockCharcoalBase beetCharcoalBlock = new BlockCharcoalBase("beet_charcoal_block",
            10 * ModItems.beetCharcoal.burnTime);

    public static BlockCharcoalBase appleCharcoalBlock = new BlockCharcoalBase("apple_charcoal_block",
            10 * ModItems.appleCharcoal.burnTime);

    public static BlockCharcoalBase chorusCharcoalBlock = new BlockCharcoalBase("chorus_charcoal_block",
            10 * ModItems.chorusCharcoal.burnTime);

    public static BlockCharcoalBase potatoCharcoalBlock = new BlockCharcoalBase("potato_charcoal_block",
            10 * ModItems.potatoCharcoal.burnTime);

    public static BlockCharcoalBase eggCharcoalBlock = new BlockCharcoalBase("egg_charcoal_block",
            10 * ModItems.eggCharcoal.burnTime);

    public static BlockCharcoalBase breadCharcoalBlock = new BlockCharcoalBase("bread_charcoal_block",
            10 * ModItems.breadCharcoal.burnTime);

    public static BlockCharcoalBase melonCharcoalBlock = new BlockCharcoalBase("melon_charcoal_block",
            10 * ModItems.melonCharcoal.burnTime);
}