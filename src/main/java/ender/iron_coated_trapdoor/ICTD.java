package ender.iron_coated_trapdoor;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Material;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.sound.BlockSoundGroup;

public class ICTD extends TrapdoorBlock {
    protected ICTD() {
        super(FabricBlockSettings.of(Material.STONE).nonOpaque().strength(5.0F).sounds(BlockSoundGroup.METAL).requiresTool().breakByTool(FabricToolTags.PICKAXES, 1));
    }
}