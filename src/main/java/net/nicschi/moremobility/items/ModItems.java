package net.nicschi.moremobility.items;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nicschi.moremobility.MoreMobility;

public class ModItems {
    public static final Item SLIME_SLINGSHOT = registerItem("slime_sling", new SlimeSling());
    public static final Item SLIME_BOOTS = registerItem("slime_boots", new SlimeBoots());

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MoreMobility.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Items for Mod: " + MoreMobility.MOD_ID);
    }
}
