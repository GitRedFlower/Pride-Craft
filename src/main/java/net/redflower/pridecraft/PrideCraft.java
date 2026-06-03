package net.redflower.pridecraft;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.redflower.pridecraft.block.PrideCraftBlocks;
import net.redflower.pridecraft.item.PrideCraftItems;
import net.redflower.pridecraft.loot.PrideCraftLootModifiers;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(PrideCraft.MODID)
public class PrideCraft {

    public static final String MODID = "pridecraft";
    public static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public PrideCraft(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);


        ModCreativeModTabs.register(modEventBus);

        PrideCraftItems.register(modEventBus);
        PrideCraftBlocks.register(modEventBus);

        PrideCraftLootModifiers.register(modEventBus);




        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(PrideCraftBlocks.ABROSEXUAL_PRIDE_FLOWER.getId(), PrideCraftBlocks.POTTED_ABROSEXUAL_PRIDE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(PrideCraftBlocks.AGENDER_PRIDE_FLOWER.getId(), PrideCraftBlocks.POTTED_AGENDER_PRIDE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(PrideCraftBlocks.AROACE_PRIDE_FLOWER.getId(), PrideCraftBlocks.POTTED_AROACE_PRIDE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(PrideCraftBlocks.AROMANTIC_PRIDE_FLOWER.getId(), PrideCraftBlocks.POTTED_AROMANTIC_PRIDE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(PrideCraftBlocks.ASEXUAL_PRIDE_FLOWER.getId(), PrideCraftBlocks.POTTED_ASEXUAL_PRIDE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(PrideCraftBlocks.BIGENDER_PRIDE_FLOWER.getId(), PrideCraftBlocks.POTTED_BIGENDER_PRIDE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(PrideCraftBlocks.BISEXUAL_PRIDE_FLOWER.getId(), PrideCraftBlocks.POTTED_BISEXUAL_PRIDE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(PrideCraftBlocks.DEMIBOY_PRIDE_FLOWER.getId(), PrideCraftBlocks.POTTED_DEMIBOY_PRIDE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(PrideCraftBlocks.DEMIGIRL_PRIDE_FLOWER.getId(), PrideCraftBlocks.POTTED_DEMIGIRL_PRIDE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(PrideCraftBlocks.DEMINONBINARY_PRIDE_FLOWER.getId(), PrideCraftBlocks.POTTED_DEMINONBINARY_PRIDE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(PrideCraftBlocks.DEMIROMANTIC_PRIDE_FLOWER.getId(), PrideCraftBlocks.POTTED_DEMIROMANTIC_PRIDE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(PrideCraftBlocks.DEMISEXUAL_PRIDE_FLOWER.getId(), PrideCraftBlocks.POTTED_DEMISEXUAL_PRIDE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(PrideCraftBlocks.GAY_PRIDE_FLOWER.getId(), PrideCraftBlocks.POTTED_GAY_PRIDE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(PrideCraftBlocks.GENDERFLUID_PRIDE_FLOWER.getId(), PrideCraftBlocks.POTTED_GENDERFLUID_PRIDE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(PrideCraftBlocks.GENDERFLUX_PRIDE_FLOWER.getId(), PrideCraftBlocks.POTTED_GENDERFLUX_PRIDE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(PrideCraftBlocks.GENDERQUEER_PRIDE_FLOWER.getId(), PrideCraftBlocks.POTTED_GENDERQUEER_PRIDE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(PrideCraftBlocks.GRAYROMANTIC_PRIDE_FLOWER.getId(), PrideCraftBlocks.POTTED_GRAYROMANTIC_PRIDE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(PrideCraftBlocks.GRAYSEXUAL_PRIDE_FLOWER.getId(), PrideCraftBlocks.POTTED_GRAYSEXUAL_PRIDE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(PrideCraftBlocks.INTERSEX_PRIDE_FLOWER.getId(), PrideCraftBlocks.POTTED_INTERSEX_PRIDE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(PrideCraftBlocks.LESBIAN_PRIDE_FLOWER.getId(), PrideCraftBlocks.POTTED_LESBIAN_PRIDE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(PrideCraftBlocks.NONBINARY_PRIDE_FLOWER.getId(), PrideCraftBlocks.POTTED_NONBINARY_PRIDE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(PrideCraftBlocks.OMNISEXUAL_PRIDE_FLOWER.getId(), PrideCraftBlocks.POTTED_OMNISEXUAL_PRIDE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(PrideCraftBlocks.PANSEXUAL_PRIDE_FLOWER.getId(), PrideCraftBlocks.POTTED_PANSEXUAL_PRIDE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(PrideCraftBlocks.POLYSEXUAL_PRIDE_FLOWER.getId(), PrideCraftBlocks.POTTED_POLYSEXUAL_PRIDE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(PrideCraftBlocks.PROGRESS_PRIDE_FLOWER.getId(), PrideCraftBlocks.POTTED_PROGRESS_PRIDE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(PrideCraftBlocks.QUEER_PRIDE_FLOWER.getId(), PrideCraftBlocks.POTTED_QUEER_PRIDE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(PrideCraftBlocks.RAINBOW_PRIDE_FLOWER.getId(), PrideCraftBlocks.POTTED_RAINBOW_PRIDE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(PrideCraftBlocks.TRANSFEMININE_PRIDE_FLOWER.getId(), PrideCraftBlocks.POTTED_TRANSFEMININE_PRIDE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(PrideCraftBlocks.TRANSGENDER_PRIDE_FLOWER.getId(), PrideCraftBlocks.POTTED_TRANSGENDER_PRIDE_FLOWER);
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(PrideCraftBlocks.TRANSMASCULINE_PRIDE_FLOWER.getId(), PrideCraftBlocks.POTTED_TRANSMASCULINE_PRIDE_FLOWER);
        });
    }


    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }
}
