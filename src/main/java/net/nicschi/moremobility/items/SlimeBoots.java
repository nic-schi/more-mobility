package net.nicschi.moremobility.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.nicschi.moremobility.MoreMobility;

public class SlimeBoots extends ArmorItem {

    public SlimeBoots() {
        super(ModArmorMaterials.SLIME, EquipmentSlot.FEET, new FabricItemSettings().group(MoreMobility.MoreMobilityItemGroup));
    }

}
