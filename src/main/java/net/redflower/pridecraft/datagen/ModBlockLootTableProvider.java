package net.redflower.pridecraft.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.redflower.pridecraft.block.ModBlocks;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {

    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        //Flag Blocks
        dropSelf(ModBlocks.ABROSEXUAL_FLAG_BLOCK.get());
        dropSelf(ModBlocks.AGENDER_FLAG_BLOCK.get());
        dropSelf(ModBlocks.AROACE_FLAG_BLOCK.get());
        dropSelf(ModBlocks.AROMANTIC_FLAG_BLOCK.get());
        dropSelf(ModBlocks.ASEXUAL_FLAG_BLOCK.get());
        dropSelf(ModBlocks.BIGENDER_FLAG_BLOCK.get());
        dropSelf(ModBlocks.BISEXUAL_FLAG_BLOCK.get());
        dropSelf(ModBlocks.DEMIBOY_FLAG_BLOCK.get());
        dropSelf(ModBlocks.DEMIGIRL_FLAG_BLOCK.get());
        dropSelf(ModBlocks.DEMIROMANTIC_FLAG_BLOCK.get());
        dropSelf(ModBlocks.DEMISEXUAL_FLAG_BLOCK.get());
        dropSelf(ModBlocks.GAY_FLAG_BLOCK.get());
        dropSelf(ModBlocks.GENDERFLUID_FLAG_BLOCK.get());
        dropSelf(ModBlocks.GENDERFLUX_FLAG_BLOCK.get());
        dropSelf(ModBlocks.GENDERQUEER_FLAG_BLOCK.get());
        dropSelf(ModBlocks.GRAYSEXUAL_FLAG_BLOCK.get());
        dropSelf(ModBlocks.INTERSEX_FLAG_BLOCK.get());
        dropSelf(ModBlocks.LESBIAN_FLAG_BLOCK.get());
        dropSelf(ModBlocks.NONBINARY_FLAG_BLOCK.get());
        dropSelf(ModBlocks.OMNISEXUAL_FLAG_BLOCK.get());
        dropSelf(ModBlocks.PANSEXUAL_FLAG_BLOCK.get());
        dropSelf(ModBlocks.PROGRESS_PRIDE_FLAG_BLOCK.get());
        dropSelf(ModBlocks.QUEER_FLAG_BLOCK.get());
        dropSelf(ModBlocks.RAINBOW_FLAG_BLOCK.get());
        dropSelf(ModBlocks.TRANSGENDER_FLAG_BLOCK.get());
        dropSelf(ModBlocks.DEMINONBINARY_FLAG_BLOCK.get());
        dropSelf(ModBlocks.GRAYROMANTIC_FLAG_BLOCK.get());
        dropSelf(ModBlocks.POLYSEXUAL_FLAG_BLOCK.get());

        //Flag Carpets

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
