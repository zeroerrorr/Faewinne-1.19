package net.zeroerror.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zeroerror.tutorialmod.TutorialMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GEMS_TAB)));

public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite",
        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.GEMS_TAB)));


    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }

}
