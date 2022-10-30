package net.nicschi.moremobility;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.nicschi.moremobility.enchantments.ModEnchantments;
import net.nicschi.moremobility.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreMobility implements ModInitializer {
    public static final String MOD_ID = "more-mobility";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final ItemGroup MoreMobilityItemGroup = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "more-mobility-itemgroup"), () -> new ItemStack(ModItems.SLIME_SLINGSHOT));

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModEnchantments.registerModEnchantments();

        LOGGER.info("More Mobility Mod loaded successfully!");
    }
}
