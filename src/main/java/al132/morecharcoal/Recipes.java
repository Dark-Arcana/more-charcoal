package al132.morecharcoal;

import net.minecraft.core.NonNullList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.ShapelessRecipe;

import static al132.morecharcoal.MoreCharcoal.MODID;

public class Recipes {


    public Recipes() {
        int recipeName = 0;
        for (ItemCharcoalBase fruit : ModItems.charcoalItems) {
            if (fruit != ModItems.charcoalChunk) {
                int quantity = Math.min(64, fruit.burnTime / 200); //will round down, as intended, because integer division
                if (quantity > 0) {
                    recipeName++;
                    Ingredient fruitIngredient = Ingredient.of(new ItemStack(fruit));
                    registerShapeless(Integer.toString(recipeName), new ItemStack(ModItems.charcoalChunk, quantity), NonNullList.of(fruitIngredient));
                }
            }
        }
    }

    public static void registerShapeless(String recipeName, ItemStack output, NonNullList<Ingredient> input) {
        ResourceLocation resource = new ResourceLocation(MODID, recipeName);
        CraftingRecipe recipe = new ShapelessRecipe(resource, "charcoal", output, input);
        //recipe.set(resource);
        ///ForgeRegistries.register(recipe);
    }
}