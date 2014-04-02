package com.pahimar.ee3.item;

import com.pahimar.ee3.block.ModBlocks;
import com.pahimar.ee3.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.item.ItemMultiTexture;

public class ItemBlockAlchemicalFuel extends ItemMultiTexture
{
    public ItemBlockAlchemicalFuel(Block block)
    {
        super(ModBlocks.alchemicalFuel, ModBlocks.alchemicalFuel, Names.Items.ALCHEMICAL_FUEL_SUBTYPES);
    }
}
