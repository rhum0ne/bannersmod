package fr.rhum0ne.banners;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = Banners.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class WeaverTrades {
    @SubscribeEvent
    public static void onVillagerTrades(VillagerTradesEvent event) {
        if (event.getType() == VillagerProfession.SHEPHERD) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
            List<VillagerTrades.ItemListing> level1 = trades.get(1);
            addPatternTrade(level1, Banners.LANNISTER_BANNER_PATTERN_ITEM.get());
            addPatternTrade(level1, Banners.MAISON_TULLY_BANNER_PATTERN_ITEM.get());
            addPatternTrade(level1, Banners.ARRYN_BANNER_PATTERN_ITEM.get());
            addPatternTrade(level1, Banners.BARATHEON_BANNER_PATTERN_ITEM.get());
            addPatternTrade(level1, Banners.BARATHEON_DE_PEYREDRAGON_BANNER_PATTERN_ITEM.get());
            addPatternTrade(level1, Banners.FORESTIER_BANNER_PATTERN_ITEM.get());
            addPatternTrade(level1, Banners.GREYJOY_BANNER_PATTERN_ITEM.get());
            addPatternTrade(level1, Banners.MARTELL_BANNER_PATTERN_ITEM.get());
            addPatternTrade(level1, Banners.STARK_BANNER_PATTERN_ITEM.get());
            addPatternTrade(level1, Banners.TARGARYEN_BANNER_PATTERN_ITEM.get());
            addPatternTrade(level1, Banners.TYRELL_BANNER_PATTERN_ITEM.get());
            addPatternTrade(level1, Banners.VELARYON_BANNER_PATTERN_ITEM.get());
        }
    }

    private static void addPatternTrade(List<VillagerTrades.ItemListing> listings, Item pattern) {
        listings.add((trader, rand) -> new MerchantOffer(
                new ItemStack(Items.EMERALD, 10),
                new ItemStack(pattern),
                1, 2, 0.05F));
    }
}
