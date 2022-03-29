package al132.morecharcoal;

import net.minecraft.world.item.Item;

public class ItemCharcoalBase extends Item {

    public int burnTime;

    public ItemCharcoalBase(String name, int burnTime) {
        super(new Item.Properties().tab(MoreCharcoal.itemGroup));
        setRegistryName(name);
        ModItems.charcoalItems.add(this);
        this.burnTime = burnTime;
        //setCreativeTab(Reference.creativeTab);
    }

    //@Override
    //public int getBurnTime(ItemStack itemStack) {
    //    return this.burnTime;
    //}
}