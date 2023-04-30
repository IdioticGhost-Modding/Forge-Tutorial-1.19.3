package net.idioticghost.tutorialmod.item;

import net.idioticghost.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    // ITEMS

    public static final RegistryObject<Item> EMPTY_SOUL_CONTAINER = ITEMS.register("empty_soul_container",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SCULK_SHARD = ITEMS.register("sculk_shard",
            () -> new Item(new Item.Properties()));

    // FOOD
    // BLOCKS
    // ARMOR






    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
