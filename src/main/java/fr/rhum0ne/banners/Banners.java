package fr.rhum0ne.banners;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import fr.rhum0ne.banners.block.TemplateBannerBlock;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Banners.MODID)
public class Banners {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "banners";
    // Create a Deferred Register to hold Blocks which will all be registered under the "banners" namespace
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    // Create a Deferred Register to hold Items which will all be registered under the "banners" namespace
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    // Register a simple banner block and its item as an example template
    public static final RegistryObject<Block> TEMPLATE_BANNER = BLOCKS.register("template_banner", () -> new TemplateBannerBlock());
    public static final RegistryObject<Item> TEMPLATE_BANNER_ITEM = ITEMS.register("template_banner", () -> new BlockItem(TEMPLATE_BANNER.get(), new Item.Properties()));

    public Banners() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the Deferred Register to the mod event bus so blocks get registered
        BLOCKS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so items get registered
        ITEMS.register(modEventBus);
        // Add items to existing creative tabs
        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(TEMPLATE_BANNER_ITEM);
        }
    }
}
