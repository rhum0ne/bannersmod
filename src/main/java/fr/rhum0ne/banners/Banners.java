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
    public static final RegistryObject<Block> ARRYN_BANNER = BLOCKS.register("arryn_banner", () -> new TemplateBannerBlock());
    public static final RegistryObject<Item> ARRYN_BANNER_ITEM = ITEMS.register("arryn_banner", () -> new BlockItem(ARRYN_BANNER.get(), new Item.Properties()));
    public static final RegistryObject<Block> BARATHEON_BANNER = BLOCKS.register("baratheon_banner", () -> new TemplateBannerBlock());
    public static final RegistryObject<Item> BARATHEON_BANNER_ITEM = ITEMS.register("baratheon_banner", () -> new BlockItem(BARATHEON_BANNER.get(), new Item.Properties()));
    public static final RegistryObject<Block> BARATHEON_DE_PEYREDRAGON_BANNER = BLOCKS.register("baratheon_de_peyredragon_banner", () -> new TemplateBannerBlock());
    public static final RegistryObject<Item> BARATHEON_DE_PEYREDRAGON_BANNER_ITEM = ITEMS.register("baratheon_de_peyredragon_banner", () -> new BlockItem(BARATHEON_DE_PEYREDRAGON_BANNER.get(), new Item.Properties()));
    public static final RegistryObject<Block> FORESTIER_BANNER = BLOCKS.register("forestier_banner", () -> new TemplateBannerBlock());
    public static final RegistryObject<Item> FORESTIER_BANNER_ITEM = ITEMS.register("forestier_banner", () -> new BlockItem(FORESTIER_BANNER.get(), new Item.Properties()));
    public static final RegistryObject<Block> GREYJOY_BANNER = BLOCKS.register("greyjoy_banner", () -> new TemplateBannerBlock());
    public static final RegistryObject<Item> GREYJOY_BANNER_ITEM = ITEMS.register("greyjoy_banner", () -> new BlockItem(GREYJOY_BANNER.get(), new Item.Properties()));
    public static final RegistryObject<Block> MARTELL_BANNER = BLOCKS.register("martell_banner", () -> new TemplateBannerBlock());
    public static final RegistryObject<Item> MARTELL_BANNER_ITEM = ITEMS.register("martell_banner", () -> new BlockItem(MARTELL_BANNER.get(), new Item.Properties()));
    public static final RegistryObject<Block> STARK_BANNER = BLOCKS.register("stark_banner", () -> new TemplateBannerBlock());
    public static final RegistryObject<Item> STARK_BANNER_ITEM = ITEMS.register("stark_banner", () -> new BlockItem(STARK_BANNER.get(), new Item.Properties()));
    public static final RegistryObject<Block> TARGARYEN_BANNER = BLOCKS.register("targaryen_banner", () -> new TemplateBannerBlock());
    public static final RegistryObject<Item> TARGARYEN_BANNER_ITEM = ITEMS.register("targaryen_banner", () -> new BlockItem(TARGARYEN_BANNER.get(), new Item.Properties()));
    public static final RegistryObject<Block> TYRELL_BANNER = BLOCKS.register("tyrell_banner", () -> new TemplateBannerBlock());
    public static final RegistryObject<Item> TYRELL_BANNER_ITEM = ITEMS.register("tyrell_banner", () -> new BlockItem(TYRELL_BANNER.get(), new Item.Properties()));
    public static final RegistryObject<Block> VELARYON_BANNER = BLOCKS.register("velaryon_banner", () -> new TemplateBannerBlock());
    public static final RegistryObject<Item> VELARYON_BANNER_ITEM = ITEMS.register("velaryon_banner", () -> new BlockItem(VELARYON_BANNER.get(), new Item.Properties()));
    public static final RegistryObject<BannerPattern> LANNISTER_PATTERN =
            BANNER_PATTERNS.register("lannister",
                    () -> new BannerPattern(Banners.MODID + ":lannister"));

    public static final RegistryObject<BannerPattern> MAISON_TULLY_PATTERN =
            BANNER_PATTERNS.register("maison_tully",
                    () -> new BannerPattern(Banners.MODID + ":maison_tully"));
    public static final RegistryObject<BannerPattern> ARRYN_PATTERN =
            BANNER_PATTERNS.register("arryn",
                    () -> new BannerPattern(Banners.MODID + ":arryn"));
    public static final RegistryObject<BannerPattern> BARATHEON_PATTERN =
            BANNER_PATTERNS.register("baratheon",
                    () -> new BannerPattern(Banners.MODID + ":baratheon"));
    public static final RegistryObject<BannerPattern> BARATHEON_DE_PEYREDRAGON_PATTERN =
            BANNER_PATTERNS.register("baratheon_de_peyredragon",
                    () -> new BannerPattern(Banners.MODID + ":baratheon_de_peyredragon"));
    public static final RegistryObject<BannerPattern> FORESTIER_PATTERN =
            BANNER_PATTERNS.register("forestier",
                    () -> new BannerPattern(Banners.MODID + ":forestier"));
    public static final RegistryObject<BannerPattern> GREYJOY_PATTERN =
            BANNER_PATTERNS.register("greyjoy",
                    () -> new BannerPattern(Banners.MODID + ":greyjoy"));
    public static final RegistryObject<BannerPattern> MARTELL_PATTERN =
            BANNER_PATTERNS.register("martell",
                    () -> new BannerPattern(Banners.MODID + ":martell"));
    public static final RegistryObject<BannerPattern> STARK_PATTERN =
            BANNER_PATTERNS.register("stark",
                    () -> new BannerPattern(Banners.MODID + ":stark"));
    public static final RegistryObject<BannerPattern> TARGARYEN_PATTERN =
            BANNER_PATTERNS.register("targaryen",
                    () -> new BannerPattern(Banners.MODID + ":targaryen"));
    public static final RegistryObject<BannerPattern> TYRELL_PATTERN =
            BANNER_PATTERNS.register("tyrell",
                    () -> new BannerPattern(Banners.MODID + ":tyrell"));
    public static final RegistryObject<BannerPattern> VELARYON_PATTERN =
            BANNER_PATTERNS.register("velaryon",
                    () -> new BannerPattern(Banners.MODID + ":velaryon"));
    public static final TagKey<BannerPattern> LANNISTER_PATTERN_ITEM_TAG =
            TagKey.create(Registries.BANNER_PATTERN, new ResourceLocation(MODID, "pattern_item/lannister"));

    public static final TagKey<BannerPattern> MAISON_TULLY_PATTERN_ITEM_TAG =
            TagKey.create(Registries.BANNER_PATTERN, new ResourceLocation(MODID, "pattern_item/maison_tully"));
    public static final TagKey<BannerPattern> ARRYN_PATTERN_ITEM_TAG =
            TagKey.create(Registries.BANNER_PATTERN, new ResourceLocation(MODID, "pattern_item/arryn"));
    public static final TagKey<BannerPattern> BARATHEON_PATTERN_ITEM_TAG =
            TagKey.create(Registries.BANNER_PATTERN, new ResourceLocation(MODID, "pattern_item/baratheon"));
    public static final TagKey<BannerPattern> BARATHEON_DE_PEYREDRAGON_PATTERN_ITEM_TAG =
            TagKey.create(Registries.BANNER_PATTERN, new ResourceLocation(MODID, "pattern_item/baratheon_de_peyredragon"));
    public static final TagKey<BannerPattern> FORESTIER_PATTERN_ITEM_TAG =
            TagKey.create(Registries.BANNER_PATTERN, new ResourceLocation(MODID, "pattern_item/forestier"));
    public static final TagKey<BannerPattern> GREYJOY_PATTERN_ITEM_TAG =
            TagKey.create(Registries.BANNER_PATTERN, new ResourceLocation(MODID, "pattern_item/greyjoy"));
    public static final TagKey<BannerPattern> MARTELL_PATTERN_ITEM_TAG =
            TagKey.create(Registries.BANNER_PATTERN, new ResourceLocation(MODID, "pattern_item/martell"));
    public static final TagKey<BannerPattern> STARK_PATTERN_ITEM_TAG =
            TagKey.create(Registries.BANNER_PATTERN, new ResourceLocation(MODID, "pattern_item/stark"));
    public static final TagKey<BannerPattern> TARGARYEN_PATTERN_ITEM_TAG =
            TagKey.create(Registries.BANNER_PATTERN, new ResourceLocation(MODID, "pattern_item/targaryen"));
    public static final TagKey<BannerPattern> TYRELL_PATTERN_ITEM_TAG =
            TagKey.create(Registries.BANNER_PATTERN, new ResourceLocation(MODID, "pattern_item/tyrell"));
    public static final TagKey<BannerPattern> VELARYON_PATTERN_ITEM_TAG =
            TagKey.create(Registries.BANNER_PATTERN, new ResourceLocation(MODID, "pattern_item/velaryon"));

    public static final RegistryObject<Item> LANNISTER_BANNER_PATTERN_ITEM =
            ITEMS.register("lannister_banner_pattern",
                    () -> new BannerPatternItem(LANNISTER_PATTERN_ITEM_TAG, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> MAISON_TULLY_BANNER_PATTERN_ITEM =
            ITEMS.register("maison_tully_banner_pattern",
                    () -> new BannerPatternItem(MAISON_TULLY_PATTERN_ITEM_TAG, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ARRYN_BANNER_PATTERN_ITEM =
            ITEMS.register("arryn_banner_pattern",
                    () -> new BannerPatternItem(ARRYN_PATTERN_ITEM_TAG, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BARATHEON_BANNER_PATTERN_ITEM =
            ITEMS.register("baratheon_banner_pattern",
                    () -> new BannerPatternItem(BARATHEON_PATTERN_ITEM_TAG, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BARATHEON_DE_PEYREDRAGON_BANNER_PATTERN_ITEM =
            ITEMS.register("baratheon_de_peyredragon_banner_pattern",
                    () -> new BannerPatternItem(BARATHEON_DE_PEYREDRAGON_PATTERN_ITEM_TAG, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> FORESTIER_BANNER_PATTERN_ITEM =
            ITEMS.register("forestier_banner_pattern",
                    () -> new BannerPatternItem(FORESTIER_PATTERN_ITEM_TAG, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GREYJOY_BANNER_PATTERN_ITEM =
            ITEMS.register("greyjoy_banner_pattern",
                    () -> new BannerPatternItem(GREYJOY_PATTERN_ITEM_TAG, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MARTELL_BANNER_PATTERN_ITEM =
            ITEMS.register("martell_banner_pattern",
                    () -> new BannerPatternItem(MARTELL_PATTERN_ITEM_TAG, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> STARK_BANNER_PATTERN_ITEM =
            ITEMS.register("stark_banner_pattern",
                    () -> new BannerPatternItem(STARK_PATTERN_ITEM_TAG, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TARGARYEN_BANNER_PATTERN_ITEM =
            ITEMS.register("targaryen_banner_pattern",
                    () -> new BannerPatternItem(TARGARYEN_PATTERN_ITEM_TAG, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TYRELL_BANNER_PATTERN_ITEM =
            ITEMS.register("tyrell_banner_pattern",
                    () -> new BannerPatternItem(TYRELL_PATTERN_ITEM_TAG, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> VELARYON_BANNER_PATTERN_ITEM =
            ITEMS.register("velaryon_banner_pattern",
                    () -> new BannerPatternItem(VELARYON_PATTERN_ITEM_TAG, new Item.Properties().stacksTo(1)));


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
            event.accept(LANNISTER_BANNER_ITEM);
            event.accept(MAISON_TULLY_BANNER_ITEM);
            event.accept(ARRYN_BANNER_ITEM);
            event.accept(BARATHEON_BANNER_ITEM);
            event.accept(BARATHEON_DE_PEYREDRAGON_BANNER_ITEM);
            event.accept(FORESTIER_BANNER_ITEM);
            event.accept(GREYJOY_BANNER_ITEM);
            event.accept(MARTELL_BANNER_ITEM);
            event.accept(STARK_BANNER_ITEM);
            event.accept(TARGARYEN_BANNER_ITEM);
            event.accept(TYRELL_BANNER_ITEM);
            event.accept(VELARYON_BANNER_ITEM);
        }
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(LANNISTER_BANNER_PATTERN_ITEM);
            event.accept(MAISON_TULLY_BANNER_PATTERN_ITEM);
            event.accept(ARRYN_BANNER_PATTERN_ITEM);
            event.accept(BARATHEON_BANNER_PATTERN_ITEM);
            event.accept(BARATHEON_DE_PEYREDRAGON_BANNER_PATTERN_ITEM);
            event.accept(FORESTIER_BANNER_PATTERN_ITEM);
            event.accept(GREYJOY_BANNER_PATTERN_ITEM);
            event.accept(MARTELL_BANNER_PATTERN_ITEM);
            event.accept(STARK_BANNER_PATTERN_ITEM);
            event.accept(TARGARYEN_BANNER_PATTERN_ITEM);
            event.accept(TYRELL_BANNER_PATTERN_ITEM);
            event.accept(VELARYON_BANNER_PATTERN_ITEM);
        }
    }
}