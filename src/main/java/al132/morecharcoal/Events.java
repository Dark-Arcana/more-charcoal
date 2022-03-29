package al132.morecharcoal;

import net.minecraft.world.item.Item;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class Events {

    @SubscribeEvent
    public void fuelEvent(FurnaceFuelBurnTimeEvent e) {
        Item item = e.getItemStack().getItem();
        if (item instanceof ItemCharcoalBase) {
            e.setBurnTime(((ItemCharcoalBase) item).burnTime);
        } else if (item instanceof BlockItemCharcoal) {
            e.setBurnTime(((BlockItemCharcoal) item).block.burnTime);
        }
    }
}
