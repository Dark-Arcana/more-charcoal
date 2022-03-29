package al132.morecharcoal;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("morecharcoal")
public class MoreCharcoal {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "morecharcoal";

    public static CreativeModeTab itemGroup = new CreativeModeTab("morecharcoal") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.appleCharcoal);
        }
    };

    public MoreCharcoal() {
        MinecraftForge.EVENT_BUS.register(new Events());
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverConfig);
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.SERVER_SPEC);
    }


    public void serverConfig(ModConfigEvent e) {
        if (e.getConfig().getSpec() == Config.SERVER_SPEC) {
            Config.bake();
        }
    }


    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> e) {
            ModBlocks.charcoalBlocks.forEach(e.getRegistry()::register);
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> e) {
            ModItems.charcoalItems.forEach(e.getRegistry()::register);
            for (BlockCharcoalBase block : ModBlocks.charcoalBlocks) {
                if (block != ModBlocks.charcoalBlock || Config.enableCharcoalBlock) {
                    e.getRegistry().register(new BlockItemCharcoal(block, new Item.Properties().tab(itemGroup)).setRegistryName(Objects.requireNonNull(block.getRegistryName())));
                }
            }
        }
    }
}
