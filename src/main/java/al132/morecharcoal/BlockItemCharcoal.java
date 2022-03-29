package al132.morecharcoal;


import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;

public class BlockItemCharcoal extends BlockItem {

    public BlockCharcoalBase block;

    public BlockItemCharcoal(BlockCharcoalBase block, Properties builder) {
        super(block, builder);
        this.block = block;
    }


}