package net.WarriorCat01.constructionrobots.item;

import net.WarriorCat01.constructionrobots.ConstructionRobots;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ConstructionRobots.MOD_ID);


        public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
                () -> new Item(new Item.Properties()));

        public static void register(IEventBus eventBus) {
            ITEMS.register(eventBus);
        }
}
