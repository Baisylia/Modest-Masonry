package com.baisylia.modestmasonry.item;

import com.baisylia.modestmasonry.ModestMasonry;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModestMasonry.MOD_ID);

    //Materials
    public static final RegistryObject<Item> PLANK = ITEMS.register("plank", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)){
        @Override public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {return 50;}});


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
