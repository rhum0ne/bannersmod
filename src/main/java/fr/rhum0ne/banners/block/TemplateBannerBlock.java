package fr.rhum0ne.banners.block;

import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

/**
 * Simple placeholder banner block.
 * Replace properties and behaviour as needed for custom banners.
 */
public class TemplateBannerBlock extends HorizontalDirectionalBlock {
    public TemplateBannerBlock() {
        super(BlockBehaviour.Properties.of().strength(1.0F).noOcclusion());
    }
}