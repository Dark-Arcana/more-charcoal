package al132.morecharcoal;


import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class BlockCharcoalBase extends Block {

    public int burnTime;

    public BlockCharcoalBase(String name, int burnTime) {

        super(Block.Properties.of(Material.STONE)
                .strength(5.0f, 10.0f)
                .sound(SoundType.STONE));
        this.burnTime = burnTime;
        setRegistryName(name);
        ModBlocks.charcoalBlocks.add(this);
    }
}