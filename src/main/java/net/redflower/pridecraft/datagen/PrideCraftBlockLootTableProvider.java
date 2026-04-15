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
import net.redflower.pridecraft.block.PrideCraftBlocks;
import net.redflower.pridecraft.item.PrideCraftItems;

import java.util.Set;

public class PrideCraftBlockLootTableProvider extends BlockLootSubProvider {

    protected PrideCraftBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        //Flag Blocks
        dropSelf(PrideCraftBlocks.ABROSEXUAL_FLAG_BLOCK.get());
        dropSelf(PrideCraftBlocks.AGENDER_FLAG_BLOCK.get());
        dropSelf(PrideCraftBlocks.AROACE_FLAG_BLOCK.get());
        dropSelf(PrideCraftBlocks.AROMANTIC_FLAG_BLOCK.get());
        dropSelf(PrideCraftBlocks.ASEXUAL_FLAG_BLOCK.get());
        dropSelf(PrideCraftBlocks.BIGENDER_FLAG_BLOCK.get());
        dropSelf(PrideCraftBlocks.BISEXUAL_FLAG_BLOCK.get());
        dropSelf(PrideCraftBlocks.DEMIBOY_FLAG_BLOCK.get());
        dropSelf(PrideCraftBlocks.DEMIGIRL_FLAG_BLOCK.get());
        dropSelf(PrideCraftBlocks.DEMIROMANTIC_FLAG_BLOCK.get());
        dropSelf(PrideCraftBlocks.DEMISEXUAL_FLAG_BLOCK.get());
        dropSelf(PrideCraftBlocks.GAY_FLAG_BLOCK.get());
        dropSelf(PrideCraftBlocks.GENDERFLUID_FLAG_BLOCK.get());
        dropSelf(PrideCraftBlocks.GENDERFLUX_FLAG_BLOCK.get());
        dropSelf(PrideCraftBlocks.GENDERQUEER_FLAG_BLOCK.get());
        dropSelf(PrideCraftBlocks.GRAYSEXUAL_FLAG_BLOCK.get());
        dropSelf(PrideCraftBlocks.INTERSEX_FLAG_BLOCK.get());
        dropSelf(PrideCraftBlocks.LESBIAN_FLAG_BLOCK.get());
        dropSelf(PrideCraftBlocks.NONBINARY_FLAG_BLOCK.get());
        dropSelf(PrideCraftBlocks.OMNISEXUAL_FLAG_BLOCK.get());
        dropSelf(PrideCraftBlocks.PANSEXUAL_FLAG_BLOCK.get());
        dropSelf(PrideCraftBlocks.PROGRESS_PRIDE_FLAG_BLOCK.get());
        dropSelf(PrideCraftBlocks.QUEER_FLAG_BLOCK.get());
        dropSelf(PrideCraftBlocks.RAINBOW_FLAG_BLOCK.get());
        dropSelf(PrideCraftBlocks.TRANSGENDER_FLAG_BLOCK.get());
        dropSelf(PrideCraftBlocks.DEMINONBINARY_FLAG_BLOCK.get());
        dropSelf(PrideCraftBlocks.GRAYROMANTIC_FLAG_BLOCK.get());
        dropSelf(PrideCraftBlocks.POLYSEXUAL_FLAG_BLOCK.get());
        dropSelf(PrideCraftBlocks.TRANSFEMININE_FLAG_BLOCK.get());
        dropSelf(PrideCraftBlocks.TRANSMASCULINE_FLAG_BLOCK.get());

        //Mini Flags
        dropSelf(PrideCraftBlocks.ABROSEXUAL_MINI_FLAG.get());
        dropSelf(PrideCraftBlocks.AGENDER_MINI_FLAG.get());
        dropSelf(PrideCraftBlocks.AROACE_MINI_FLAG.get());
        dropSelf(PrideCraftBlocks.AROMANTIC_MINI_FLAG.get());
        dropSelf(PrideCraftBlocks.ASEXUAL_MINI_FLAG.get());
        dropSelf(PrideCraftBlocks.BIGENDER_MINI_FLAG.get());
        dropSelf(PrideCraftBlocks.BISEXUAL_MINI_FLAG.get());
        dropSelf(PrideCraftBlocks.DEMIBOY_MINI_FLAG.get());
        dropSelf(PrideCraftBlocks.DEMIGIRL_MINI_FLAG.get());
        dropSelf(PrideCraftBlocks.DEMINONBINARY_MINI_FLAG.get());
        dropSelf(PrideCraftBlocks.DEMIROMANTIC_MINI_FLAG.get());
        dropSelf(PrideCraftBlocks.DEMISEXUAL_MINI_FLAG.get());
        dropSelf(PrideCraftBlocks.GAY_MINI_FLAG.get());
        dropSelf(PrideCraftBlocks.GENDERFLUID_MINI_FLAG.get());
        dropSelf(PrideCraftBlocks.GENDERFLUX_MINI_FLAG.get());
        dropSelf(PrideCraftBlocks.GENDERQUEER_MINI_FLAG.get());
        dropSelf(PrideCraftBlocks.GRAYROMANTIC_MINI_FLAG.get());
        dropSelf(PrideCraftBlocks.GRAYSEXUAL_MINI_FLAG.get());
        dropSelf(PrideCraftBlocks.INTERSEX_MINI_FLAG.get());
        dropSelf(PrideCraftBlocks.LESBIAN_MINI_FLAG.get());
        dropSelf(PrideCraftBlocks.NONBINARY_MINI_FLAG.get());
        dropSelf(PrideCraftBlocks.OMNISEXUAL_MINI_FLAG.get());
        dropSelf(PrideCraftBlocks.PANSEXUAL_MINI_FLAG.get());
        dropSelf(PrideCraftBlocks.POLYSEXUAL_MINI_FLAG.get());
        dropSelf(PrideCraftBlocks.PROGRESS_PRIDE_MINI_FLAG.get());
        dropSelf(PrideCraftBlocks.QUEER_MINI_FLAG.get());
        dropSelf(PrideCraftBlocks.RAINBOW_MINI_FLAG.get());
        dropSelf(PrideCraftBlocks.TRANSGENDER_MINI_FLAG.get());
        dropSelf(PrideCraftBlocks.TRANSFEMININE_MINI_FLAG.get());
        dropSelf(PrideCraftBlocks.TRANSMASCULINE_MINI_FLAG.get());

        //Wall Flags
        dropSelf(PrideCraftBlocks.ABROSEXUAL_WALL_FLAG.get());
        dropSelf(PrideCraftBlocks.AGENDER_WALL_FLAG.get());
        dropSelf(PrideCraftBlocks.AROACE_WALL_FLAG.get());
        dropSelf(PrideCraftBlocks.AROMANTIC_WALL_FLAG.get());
        dropSelf(PrideCraftBlocks.ASEXUAL_WALL_FLAG.get());
        dropSelf(PrideCraftBlocks.BIGENDER_WALL_FLAG.get());
        dropSelf(PrideCraftBlocks.BISEXUAL_WALL_FLAG.get());
        dropSelf(PrideCraftBlocks.DEMIBOY_WALL_FLAG.get());
        dropSelf(PrideCraftBlocks.DEMIGIRL_WALL_FLAG.get());
        dropSelf(PrideCraftBlocks.DEMINONBINARY_WALL_FLAG.get());
        dropSelf(PrideCraftBlocks.DEMIROMANTIC_WALL_FLAG.get());
        dropSelf(PrideCraftBlocks.DEMISEXUAL_WALL_FLAG.get());
        dropSelf(PrideCraftBlocks.GAY_WALL_FLAG.get());
        dropSelf(PrideCraftBlocks.GENDERFLUID_WALL_FLAG.get());
        dropSelf(PrideCraftBlocks.GENDERFLUX_WALL_FLAG.get());
        dropSelf(PrideCraftBlocks.GENDERQUEER_WALL_FLAG.get());
        dropSelf(PrideCraftBlocks.GRAYROMANTIC_WALL_FLAG.get());
        dropSelf(PrideCraftBlocks.GRAYSEXUAL_WALL_FLAG.get());
        dropSelf(PrideCraftBlocks.INTERSEX_WALL_FLAG.get());
        dropSelf(PrideCraftBlocks.LESBIAN_WALL_FLAG.get());
        dropSelf(PrideCraftBlocks.NONBINARY_WALL_FLAG.get());
        dropSelf(PrideCraftBlocks.OMNISEXUAL_WALL_FLAG.get());
        dropSelf(PrideCraftBlocks.PANSEXUAL_WALL_FLAG.get());
        dropSelf(PrideCraftBlocks.POLYSEXUAL_WALL_FLAG.get());
        dropSelf(PrideCraftBlocks.PROGRESS_PRIDE_WALL_FLAG.get());
        dropSelf(PrideCraftBlocks.QUEER_WALL_FLAG.get());
        dropSelf(PrideCraftBlocks.RAINBOW_WALL_FLAG.get());
        dropSelf(PrideCraftBlocks.TRANSGENDER_WALL_FLAG.get());
        dropSelf(PrideCraftBlocks.TRANSFEMININE_WALL_FLAG.get());
        dropSelf(PrideCraftBlocks.TRANSMASCULINE_WALL_FLAG.get());

        //Flag Carpets
        dropSelf(PrideCraftBlocks.ABROSEXUAL_FLAG_CARPET.get());
        dropSelf(PrideCraftBlocks.AGENDER_FLAG_CARPET.get());
        dropSelf(PrideCraftBlocks.AROACE_FLAG_CARPET.get());
        dropSelf(PrideCraftBlocks.AROMANTIC_FLAG_CARPET.get());
        dropSelf(PrideCraftBlocks.ASEXUAL_FLAG_CARPET.get());
        dropSelf(PrideCraftBlocks.BIGENDER_FLAG_CARPET.get());
        dropSelf(PrideCraftBlocks.BISEXUAL_FLAG_CARPET.get());
        dropSelf(PrideCraftBlocks.DEMIBOY_FLAG_CARPET.get());
        dropSelf(PrideCraftBlocks.DEMIGIRL_FLAG_CARPET.get());
        dropSelf(PrideCraftBlocks.DEMINONBINARY_FLAG_CARPET.get());
        dropSelf(PrideCraftBlocks.DEMIROMANTIC_FLAG_CARPET.get());
        dropSelf(PrideCraftBlocks.DEMISEXUAL_FLAG_CARPET.get());
        dropSelf(PrideCraftBlocks.GAY_FLAG_CARPET.get());
        dropSelf(PrideCraftBlocks.GENDERFLUID_FLAG_CARPET.get());
        dropSelf(PrideCraftBlocks.GENDERFLUX_FLAG_CARPET.get());
        dropSelf(PrideCraftBlocks.GENDERQUEER_FLAG_CARPET.get());
        dropSelf(PrideCraftBlocks.GRAYROMANTIC_FLAG_CARPET.get());
        dropSelf(PrideCraftBlocks.GRAYSEXUAL_FLAG_CARPET.get());
        dropSelf(PrideCraftBlocks.INTERSEX_FLAG_CARPET.get());
        dropSelf(PrideCraftBlocks.LESBIAN_FLAG_CARPET.get());
        dropSelf(PrideCraftBlocks.NONBINARY_FLAG_CARPET.get());
        dropSelf(PrideCraftBlocks.OMNISEXUAL_FLAG_CARPET.get());
        dropSelf(PrideCraftBlocks.PANSEXUAL_FLAG_CARPET.get());
        dropSelf(PrideCraftBlocks.POLYSEXUAL_FLAG_CARPET.get());
        dropSelf(PrideCraftBlocks.PROGRESS_PRIDE_FLAG_CARPET.get());
        dropSelf(PrideCraftBlocks.QUEER_FLAG_CARPET.get());
        dropSelf(PrideCraftBlocks.RAINBOW_FLAG_CARPET.get());
        dropSelf(PrideCraftBlocks.TRANSGENDER_FLAG_CARPET.get());
        dropSelf(PrideCraftBlocks.TRANSFEMININE_FLAG_CARPET.get());
        dropSelf(PrideCraftBlocks.TRANSMASCULINE_FLAG_CARPET.get());


        //Other Blocks
        //Ores
        add(PrideCraftBlocks.UNKNOWN_ORE.get(),
                block -> createMultipleOreDrops(PrideCraftBlocks.UNKNOWN_ORE.get(), PrideCraftItems.UNKNOWN_MATERIAL.get(),3,6));
        add(PrideCraftBlocks.DEEPSLATE_UNKNOWN_ORE.get(),
                block -> createMultipleOreDrops(PrideCraftBlocks.DEEPSLATE_UNKNOWN_ORE.get(), PrideCraftItems.UNKNOWN_MATERIAL.get(),3,6));

        //Storage Blocks
        dropSelf(PrideCraftBlocks.UNKNOWN_MATERIAL_BLOCK.get());
        dropSelf(PrideCraftBlocks.CORRUPTED_FLAG_BLOCK.get());
        dropSelf(PrideCraftBlocks.PRIDE_ORE.get());
        dropSelf(PrideCraftBlocks.DEEPSLATE_PRIDE_ORE.get());
    }

    //Creates Multiple Ore Drops. Created By Modding by Kaupenjoe. DO NOT TOUCH!!!!
    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registryLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return PrideCraftBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
