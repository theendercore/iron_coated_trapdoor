package ender.iron_coated_trapdoor;

import net.minecraft.block.Material;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.sound.BlockSoundGroup;

public class ICTD extends TrapdoorBlock {
    protected ICTD() {
        super(Settings.of(Material.STONE).strength(5.0F).sounds(BlockSoundGroup.METAL).nonOpaque());
    }
}
