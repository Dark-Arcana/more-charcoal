package al132.morecharcoal;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class Config {

    public static final ServerConfig SERVER;
    public static final ForgeConfigSpec SERVER_SPEC;

    static {
        final Pair<ServerConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(ServerConfig::new);
        SERVER_SPEC = specPair.getRight();
        SERVER = specPair.getLeft();
    }

    public static int sugarcaneFuelValue = 600;
    public static int carrotFuelValue = 600;
    public static int appleFuelValue = 600;
    public static int potatoFuelValue = 800;
    public static int beetFuelValue = 600;
    public static int chorusFuelValue = 1200;
    public static int eggFuelValue = 800;
    public static int breadFuelValue = 1200;
    public static int melonFuelValue = 600;
    public static boolean enableCharcoalBlock = true;

    public static void bake() {
        sugarcaneFuelValue = SERVER.sugarcaneFuelValueSpec.get();
        carrotFuelValue = SERVER.carrotFuelValueSpec.get();
        appleFuelValue = SERVER.appleFuelValueSpec.get();
        potatoFuelValue = SERVER.potatoFuelValueSpec.get();
        beetFuelValue = SERVER.beetFuelValueSpec.get();
        chorusFuelValue = SERVER.chorusFuelValueSpec.get();
        eggFuelValue = SERVER.eggFuelValueSpec.get();
        breadFuelValue = SERVER.breadFuelValueSpec.get();
        melonFuelValue = SERVER.melonFuelValueSpec.get();
        enableCharcoalBlock = SERVER.enableCharcoalBlockSpec.get();
    }

    public static class ServerConfig {
        public ForgeConfigSpec.IntValue sugarcaneFuelValueSpec;
        public ForgeConfigSpec.IntValue carrotFuelValueSpec;
        public ForgeConfigSpec.IntValue appleFuelValueSpec;
        public ForgeConfigSpec.IntValue potatoFuelValueSpec;
        public ForgeConfigSpec.IntValue beetFuelValueSpec;
        public ForgeConfigSpec.IntValue chorusFuelValueSpec;
        public ForgeConfigSpec.IntValue eggFuelValueSpec;
        public ForgeConfigSpec.IntValue breadFuelValueSpec;
        public ForgeConfigSpec.IntValue melonFuelValueSpec;
        public ForgeConfigSpec.BooleanValue enableCharcoalBlockSpec;

        ServerConfig(ForgeConfigSpec.Builder builder) {
            builder.push("general");
            enableCharcoalBlockSpec = builder
                    .comment("Should the (regular) charcoal blocks be enabled?")
                    .translation("text.morecharcoal.config.charcoal_block")
                    .define("charcoalBlockEnabled", true);
            sugarcaneFuelValueSpec = builder
                    .comment("Fuel value of sugarcane charcoal")
                    .defineInRange("sugarcaneCharcoalFuelValue", 600, 1, Integer.MAX_VALUE);
            carrotFuelValueSpec = builder
                    .comment("Fuel value of carrot charcoal")
                    .defineInRange("carrotCharcoalFuelValue", 600, 1, Integer.MAX_VALUE);
            potatoFuelValueSpec = builder
                    .comment("Fuel value of potato charcoal")
                    .defineInRange("potatoCharcoalFuelValue", 800, 1, Integer.MAX_VALUE);
            beetFuelValueSpec = builder
                    .comment("Fuel value of beet charcoal")
                    .defineInRange("beetCharcoalFuelValue", 600, 1, Integer.MAX_VALUE);
            appleFuelValueSpec = builder
                    .comment("Fuel value of apple charcoal")
                    .defineInRange("appleCharcoalFuelValue", 600, 1, Integer.MAX_VALUE);
            chorusFuelValueSpec = builder
                    .comment("Fuel value of chorus charcoal")
                    .defineInRange("chorusCharcoalFuelValue", 1200, 1, Integer.MAX_VALUE);
            eggFuelValueSpec = builder
                    .comment("Fuel value of egg charcoal")
                    .defineInRange("eggCharcoalFuelValue", 800, 1, Integer.MAX_VALUE);
            breadFuelValueSpec = builder
                    .comment("Fuel value of bread charcoal")
                    .defineInRange("breadCharcoalFuelValue", 1200, 1, Integer.MAX_VALUE);
            melonFuelValueSpec = builder
                    .comment("Fuel value of melon charcoal")
                    .defineInRange("melonCharcoalFuelValue", 600, 1, Integer.MAX_VALUE);
            builder.pop();
        }
    }
}