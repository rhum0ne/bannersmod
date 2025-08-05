package fr.rhum0ne.banners;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BannerPatternItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BannerPattern;
import net.minecraft.core.registries.Registries;
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
    // Create a Deferred Register to hold Banner Patterns which will all be registered under the "banners" namespace
    public static final DeferredRegister<BannerPattern> BANNER_PATTERNS = DeferredRegister.create(Registries.BANNER_PATTERN, MODID);
    // Register a simple banner block and its item as an example template
    public static final RegistryObject<Block> TEMPLATE_BANNER = BLOCKS.register("template_banner", () -> new TemplateBannerBlock());
    public static final RegistryObject<Item> TEMPLATE_BANNER_ITEM = ITEMS.register("template_banner", () -> new BlockItem(TEMPLATE_BANNER.get(), new Item.Properties()));
    public static final RegistryObject<Block> LANNISTER_BANNER = BLOCKS.register("lannister_banner", () -> new TemplateBannerBlock());
    public static final RegistryObject<Item> LANNISTER_BANNER_ITEM = ITEMS.register("lannister_banner", () -> new BlockItem(LANNISTER_BANNER.get(), new Item.Properties()));
    public static final RegistryObject<Block> MAISON_TULLY_BANNER = BLOCKS.register("maison_tully_banner", () -> new TemplateBannerBlock());
    public static final RegistryObject<Item> MAISON_TULLY_BANNER_ITEM = ITEMS.register("maison_tully_banner", () -> new BlockItem(MAISON_TULLY_BANNER.get(), new Item.Properties()));
    public static final RegistryObject<BannerPattern> LANNISTER_PATTERN =
            BANNER_PATTERNS.register("lannister",
                    () -> new BannerPattern(Banners.MODID + ":lannister"));

    public static final RegistryObject<BannerPattern> MAISON_TULLY_PATTERN =
            BANNER_PATTERNS.register("maison_tully",
                    () -> new BannerPattern(Banners.MODID + ":maison_tully"));
    public static final TagKey<BannerPattern> LANNISTER_PATTERN_ITEM_TAG =
            TagKey.create(Registries.BANNER_PATTERN, new ResourceLocation(MODID, "pattern_item/lannister"));

    public static final TagKey<BannerPattern> MAISON_TULLY_PATTERN_ITEM_TAG =
            TagKey.create(Registries.BANNER_PATTERN, new ResourceLocation(MODID, "pattern_item/maison_tully"));

    public static final RegistryObject<Item> LANNISTER_BANNER_PATTERN_ITEM =
            ITEMS.register("lannister_banner_pattern",
                    () -> new BannerPatternItem(LANNISTER_PATTERN_ITEM_TAG, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> MAISON_TULLY_BANNER_PATTERN_ITEM =
            ITEMS.register("maison_tully_banner_pattern",
                    () -> new BannerPatternItem(MAISON_TULLY_PATTERN_ITEM_TAG, new Item.Properties().stacksTo(1)));


    public Banners() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the Deferred Register to the mod event bus so blocks get registered
        BLOCKS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so items get registered
        ITEMS.register(modEventBus);
        // Register banner patterns
        BANNER_PATTERNS.register(modEventBus);
        // Add items to existing creative tabs
        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(TEMPLATE_BANNER_ITEM);
            event.accept(LANNISTER_BANNER_ITEM);
            event.accept(MAISON_TULLY_BANNER_ITEM);
        }
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(LANNISTER_BANNER_PATTERN_ITEM);
            event.accept(MAISON_TULLY_BANNER_PATTERN_ITEM);
        }
    }
}