package io.github.consistencyplus.consistency_plus;

import dev.architectury.registry.client.rendering.ColorHandlerRegistry;
import dev.architectury.registry.client.rendering.RenderTypeRegistry;
import io.github.consistencyplus.consistency_plus.client.NubertHandler;
import io.github.consistencyplus.consistency_plus.registry.CPlusBlocks;
import io.github.consistencyplus.consistency_plus.registry.CPlusItems;
import io.github.consistencyplus.consistency_plus.utils.IdHandler;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(modid = IdHandler.ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ConsistencyPlusClientside {
	private static final Logger LOGGER = LogManager.getLogger();

	@SubscribeEvent
	public static void ConsistencyPlusClientside(final FMLClientSetupEvent event) {
		LOGGER.info("Consistency+ Main - Starting client initialization");

		RenderTypeRegistry.register(RenderLayer.getCutout(), CPlusBlocks.WARPED_WART.get());
		RenderTypeRegistry.register(RenderLayer.getCutout(), CPlusBlocks.GRASS_SLAB.get());
		RenderTypeRegistry.register(RenderLayer.getCutout(), CPlusBlocks.GRASS_STAIRS.get());
		RenderTypeRegistry.register(RenderLayer.getCutout(), CPlusBlocks.GRASS_WALL.get());

		RenderTypeRegistry.register(RenderLayer.getTranslucent(), CPlusBlocks.RED_TINTED_GLASS_BLOCK.get());
		RenderTypeRegistry.register(RenderLayer.getTranslucent(), CPlusBlocks.ORANGE_TINTED_GLASS_BLOCK.get());
		RenderTypeRegistry.register(RenderLayer.getTranslucent(), CPlusBlocks.YELLOW_TINTED_GLASS_BLOCK.get());
		RenderTypeRegistry.register(RenderLayer.getTranslucent(), CPlusBlocks.LIME_TINTED_GLASS_BLOCK.get());
		RenderTypeRegistry.register(RenderLayer.getTranslucent(), CPlusBlocks.GREEN_TINTED_GLASS_BLOCK.get());
		RenderTypeRegistry.register(RenderLayer.getTranslucent(), CPlusBlocks.BLUE_TINTED_GLASS_BLOCK.get());
		RenderTypeRegistry.register(RenderLayer.getTranslucent(), CPlusBlocks.LIGHT_BLUE_TINTED_GLASS_BLOCK.get());
		RenderTypeRegistry.register(RenderLayer.getTranslucent(), CPlusBlocks.CYAN_TINTED_GLASS_BLOCK.get());
		RenderTypeRegistry.register(RenderLayer.getTranslucent(), CPlusBlocks.PURPLE_TINTED_GLASS_BLOCK.get());
		RenderTypeRegistry.register(RenderLayer.getTranslucent(), CPlusBlocks.MAGENTA_TINTED_GLASS_BLOCK.get());
		RenderTypeRegistry.register(RenderLayer.getTranslucent(), CPlusBlocks.PINK_TINTED_GLASS_BLOCK.get());
		RenderTypeRegistry.register(RenderLayer.getTranslucent(), CPlusBlocks.WHITE_TINTED_GLASS_BLOCK.get());
		RenderTypeRegistry.register(RenderLayer.getTranslucent(), CPlusBlocks.BROWN_TINTED_GLASS_BLOCK.get());
		RenderTypeRegistry.register(RenderLayer.getTranslucent(), CPlusBlocks.LIGHT_GRAY_TINTED_GLASS_BLOCK.get());
		RenderTypeRegistry.register(RenderLayer.getTranslucent(), CPlusBlocks.GRAY_TINTED_GLASS_BLOCK.get());
		RenderTypeRegistry.register(RenderLayer.getTranslucent(), CPlusBlocks.BLACK_TINTED_GLASS_BLOCK.get());

		ColorHandlerRegistry.registerItemColors((stack, tintIndex) -> GrassColors.getColor(0.5D, 1.0D), CPlusItems.GRASS_SLAB, CPlusItems.GRASS_STAIRS, CPlusItems.GRASS_WALL);

		NubertHandler.init();

		LOGGER.info("Consistency+ Main - Finished client initialization");
	}

/*
		// Bundles
		FabricModelPredicateProviderRegistry.register(CPlusItems.RED_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.ORANGE_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.YELLOW_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.LIME_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.GREEN_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.LIGHT_BLUE_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.BLUE_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.CYAN_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.PURPLE_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.MAGENTA_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.PINK_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.WHITE_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.LIGHT_GRAY_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.GRAY_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.BROWN_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
		FabricModelPredicateProviderRegistry.register(CPlusItems.BLACK_BUNDLE, new Identifier("filled"), (itemStack, clientWorld, livingEntity, i) -> BundleItem.getAmountFilled(itemStack));
*/
}