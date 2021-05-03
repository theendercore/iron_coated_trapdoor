package ender.iron_coated_trapdoor.client;

import ender.iron_coated_trapdoor.Iron_coated_trapdoor;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class Iron_coated_trapdoorClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(Iron_coated_trapdoor.ICTD_Block, RenderLayer.getCutout());

    }
}
