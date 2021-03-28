package com.sammy.backpack_mod.container.gold;

import com.sammy.backpack_mod.BackpackModHelper;
import com.sammy.backpack_mod.container.AbstractBackpackContainer;
import com.sammy.backpack_mod.container.AbstractBackpackScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class GoldenBackpackScreen extends AbstractBackpackScreen
{
    public GoldenBackpackScreen(AbstractBackpackContainer container, PlayerInventory player, ITextComponent title)
    {
        super(container, player, title, "textures/gui/backpack_gold");
    }
}
