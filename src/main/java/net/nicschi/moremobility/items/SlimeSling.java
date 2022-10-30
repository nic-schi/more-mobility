package net.nicschi.moremobility.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.nicschi.moremobility.MoreMobility;

public class SlimeSling extends Item {

    public SlimeSling() {
        super(new FabricItemSettings().group(MoreMobility.MoreMobilityItemGroup).maxCount(1));
    }

}
