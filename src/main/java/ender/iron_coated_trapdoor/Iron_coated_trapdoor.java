package ender.iron_coated_trapdoor;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Iron_coated_trapdoor implements ModInitializer {

    public static String MOTD = "iron_coated_trapdoor";
    public static TrapdoorBlock ICTD_Block = new ICTD();

    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier(MOTD,"ict"), ICTD_Block);
        Registry.register(Registry.ITEM, new Identifier(MOTD, "ict"), new BlockItem(ICTD_Block, new Item.Settings().group(ItemGroup.REDSTONE)));
    }
}
