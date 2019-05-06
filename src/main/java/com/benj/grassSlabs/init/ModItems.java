package com.benj.grassSlabs.init;

import com.benj.grassSlabs.Reference;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(Reference.MOD_ID)
public class ModItems {

    public static final Item tutorial_dust = null;
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(
                new Item(new Item.Properties().maxStackSize(32).group(ItemGroup.MISC)).setRegistryName(Reference.MOD_ID, "tutorial_dust")
        );
    }
}
