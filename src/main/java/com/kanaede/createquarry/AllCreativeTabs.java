package com.kanaede.createquarry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class AllCreativeTabs {
    public static DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateQuarry.MODID);

    public static final RegistryObject<CreativeModeTab> CREATEQUARRY_CTAB = CREATIVE_MODE_TABS.register("createquarry_ctab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(AllItems.BRONZE_INGOT.get()))
                    .title(Component.translatable("creativetab.createquarry_ctab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(AllItems.BRONZE_INGOT.get());
                        pOutput.accept(AllItems.RAW_BRONZE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
