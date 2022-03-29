package al132.morecharcoal;


import net.minecraft.world.item.ItemStack;

public class ItemFruitCharcoalBase extends ItemCharcoalBase {

    public ItemFruitCharcoalBase(String name, ItemStack furnaceInput, int burnTime) {
        super(name, burnTime);
        //FurnaceRecipes.instance().addSmeltingRecipe(furnaceInput, new ItemStack(this), 0.0f);
    }
}