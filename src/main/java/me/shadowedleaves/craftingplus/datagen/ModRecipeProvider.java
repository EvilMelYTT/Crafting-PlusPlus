package me.shadowedleaves.craftingplus.datagen;

import me.shadowedleaves.craftingplus.CraftingPlus;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.item.Items;
import net.minecraft.core.HolderLookup;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemLike> GLASS_BLASTABLES = List.of(
            Items.SAND,
            Items.RED_SAND);

    private static final List<ItemLike> NETHER_BRICK_BLASTABLES = List.of(
            Items.NETHERRACK);

    private static final List<ItemLike> IRON_BLOCK_BLASTABLES = List.of(
            Items.RAW_IRON_BLOCK);

    private static final List<ItemLike> IRON_BLOCK_SMELTABLES = List.of(
            Items.RAW_IRON_BLOCK);

    private static final List<ItemLike> GOLD_BLOCK_BLASTABLES = List.of(
            Items.RAW_GOLD_BLOCK);

    private static final List<ItemLike> GOLD_BLOCK_SMELTABLES = List.of(
            Items.RAW_GOLD_BLOCK);

    private static final List<ItemLike> COPPER_BLOCK_BLASTABLES = List.of(
            Items.RAW_COPPER_BLOCK);

    private static final List<ItemLike> COPPER_BLOCK_SMELTABLES = List.of(
            Items.RAW_COPPER_BLOCK);

    private static final List<ItemLike> DEEPSLATE_BLASTABLES = List.of(
            Items.COBBLED_DEEPSLATE);

    private static final List<ItemLike> STONE_BLASTABLES = List.of(
            Items.COBBLESTONE);

    private static final List<ItemLike> BRICK_BLASTABLES = List.of(
            Items.CLAY_BALL);

    private static final List<ItemLike> BRICKS_BLASTABLES = List.of(
            Items.CLAY);

    private static final List<ItemLike> LEATHER_SMELTABLES = List.of(
            Items.ROTTEN_FLESH);

    private static final List<ItemLike> DEAD_BUSH_SMELTABLES = List.of(
            Items.SPRUCE_SAPLING,
            Items.BIRCH_SAPLING,
            Items.CHERRY_SAPLING,
            Items.OAK_SAPLING,
            Items.DARK_OAK_SAPLING,
            Items.JUNGLE_SAPLING,
            Items.ACACIA_SAPLING);

    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                // Dispenser
                shaped(RecipeCategory.REDSTONE, Items.DISPENSER, 1)
                        .pattern(" TS")
                        .pattern("TDS")
                        .pattern(" TS")
                        .define('S', Items.STRING)
                        .define('D', Items.DROPPER)
                        .define('T', Items.STICK)
                        .unlockedBy("has_stone", has(Items.STONE))
                        .unlockedBy("has_dropper", has(Items.DROPPER))
                        .unlockedBy("has_stick", has(Items.STICK))
                        .save(output);

                //Enchanted Golden Apple
                shaped(RecipeCategory.FOOD, Items.ENCHANTED_GOLDEN_APPLE, 1)
                        .pattern("GGG")
                        .pattern("GAG")
                        .pattern("GGG")
                        .define('G', Items.GOLD_BLOCK)
                        .define('A', Items.APPLE)
                        .unlockedBy("has_gold_block", has(Items.GOLD_BLOCK))
                        .unlockedBy("has_apple", has(Items.APPLE))
                        .save(output);

                //Name Tag
                shaped(RecipeCategory.MISC, Items.NAME_TAG, 1)
                        .pattern(" IS")
                        .pattern(" PI")
                        .pattern("P  ")
                        .define('S', Items.STRING)
                        .define('P', Items.PAPER)
                        .define('I', Items.IRON_INGOT)
                        .unlockedBy("has_string", has(Items.STRING))
                        .unlockedBy("has_paper", has(Items.PAPER))
                        .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                        .save(output);

                //Iron Horse Armor
                shaped(RecipeCategory.COMBAT, Items.IRON_HORSE_ARMOR, 1)
                        .pattern("  I")
                        .pattern("III")
                        .pattern("ISI")
                        .define('S', Items.SADDLE)
                        .define('I', Items.IRON_INGOT)
                        .unlockedBy("has_saddle", has(Items.SADDLE))
                        .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                        .save(output);

                //Gold Horse Armor
                shaped(RecipeCategory.COMBAT, Items.GOLDEN_HORSE_ARMOR, 1)
                        .pattern("  G")
                        .pattern("GGG")
                        .pattern("GSG")
                        .define('S', Items.SADDLE)
                        .define('G', Items.GOLD_INGOT)
                        .unlockedBy("has_saddle", has(Items.SADDLE))
                        .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                        .save(output);

                //Diamond Horse Armor
                shaped(RecipeCategory.COMBAT, Items.DIAMOND_HORSE_ARMOR, 1)
                        .pattern("  D")
                        .pattern("DDD")
                        .pattern("DSD")
                        .define('S', Items.SADDLE)
                        .define('D', Items.DIAMOND)
                        .unlockedBy("has_saddle", has(Items.SADDLE))
                        .unlockedBy("has_diamond", has(Items.DIAMOND))
                        .save(output);

                //Blackstone Lever
                shaped(RecipeCategory.REDSTONE, Items.LEVER, 1)
                        .pattern("S")
                        .pattern("B")
                        .define('S', Items.STICK)
                        .define('B', Items.BLACKSTONE)
                        .unlockedBy("has_stick", has(Items.STICK))
                        .unlockedBy("has_blackstone", has(Items.BLACKSTONE))
                        .save(output);

                //Blackstone Observer
                shaped(RecipeCategory.REDSTONE, Items.OBSERVER, 1)
                        .pattern("BBB")
                        .pattern("RRQ")
                        .pattern("BBB")
                        .define('Q', Items.QUARTZ)
                        .define('R', Items.REDSTONE)
                        .define('B', Items.BLACKSTONE)
                        .unlockedBy("has_quartz", has(Items.QUARTZ))
                        .unlockedBy("has_redstone", has(Items.REDSTONE))
                        .unlockedBy("has_blackstone", has(Items.BLACKSTONE))
                        .save(output);

                //Blackstone Dropper
                shaped(RecipeCategory.REDSTONE, Items.DROPPER, 1)
                        .pattern("BBB")
                        .pattern("B B")
                        .pattern("BRB")
                        .define('B', Items.BLACKSTONE)
                        .define('R', Items.REDSTONE)
                        .unlockedBy("has_blackstone", has(Items.BLACKSTONE))
                        .unlockedBy("has_redstone", has(Items.REDSTONE))
                        .save(output);

                //Blackstone Brewing Stand
                shaped(RecipeCategory.REDSTONE, Items.BREWING_STAND, 1)
                        .pattern(" R ")
                        .pattern("BBB")
                        .define('R', Items.BLAZE_ROD)
                        .define('B', Items.BLACKSTONE)
                        .unlockedBy("has_blaze_rod", has(Items.BLAZE_ROD))
                        .unlockedBy("has_blackstone", has(Items.BLACKSTONE))
                        .save(output);

                //Raw Iron Block -> Iron Block
                oreSmelting(IRON_BLOCK_SMELTABLES, RecipeCategory.BUILDING_BLOCKS,
                        CookingBookCategory.BLOCKS, Items.IRON_BLOCK,
                        0.7f, 200, "iron_block");

                //Rotten Flesh -> Leather
                oreSmelting(LEATHER_SMELTABLES, RecipeCategory.MISC,
                        CookingBookCategory.MISC, Items.LEATHER,
                        0.1f, 150, "leather");

                //Saplings -> Dead Bush
                oreSmelting(DEAD_BUSH_SMELTABLES, RecipeCategory.DECORATIONS,
                        CookingBookCategory.MISC, Items.DEAD_BUSH,
                        0.1f, 150, "dead_bush");

                //Raw Iron Block -> Iron Block
                oreBlasting(IRON_BLOCK_BLASTABLES, RecipeCategory.BUILDING_BLOCKS,
                        CookingBookCategory.BLOCKS, Items.IRON_BLOCK,
                        0.7f, 100, "iron_block");

                //Raw Gold Block -> Gold Block
                oreSmelting(GOLD_BLOCK_SMELTABLES, RecipeCategory.BUILDING_BLOCKS,
                        CookingBookCategory.BLOCKS, Items.GOLD_BLOCK,
                        0.7f, 200, "gold_block");

                //Raw Gold Block -> Gold Block
                oreBlasting(GOLD_BLOCK_BLASTABLES, RecipeCategory.BUILDING_BLOCKS,
                        CookingBookCategory.BLOCKS, Items.GOLD_BLOCK,
                        0.7f, 100, "gold_block");

                //Raw Copper Block -> Copper Block
                oreSmelting(COPPER_BLOCK_SMELTABLES, RecipeCategory.BUILDING_BLOCKS,
                        CookingBookCategory.BLOCKS, Items.COPPER_BLOCK,
                        0.7f, 200, "copper_block");

                //Raw Copper Block -> Copper Block
                oreBlasting(COPPER_BLOCK_BLASTABLES, RecipeCategory.BUILDING_BLOCKS,
                        CookingBookCategory.BLOCKS, Items.COPPER_BLOCK,
                        0.7f, 100, "copper_block");

                //Red Sand & Sand -> Glass
                oreBlasting(GLASS_BLASTABLES, RecipeCategory.BUILDING_BLOCKS,
                        CookingBookCategory.BLOCKS, Items.GLASS,
                        0.1f, 100, "glass");

                //Netherrack -> Nether Brick
                oreBlasting(NETHER_BRICK_BLASTABLES, RecipeCategory.MISC,
                        CookingBookCategory.MISC, Items.NETHER_BRICK,
                        0.1f, 100, "nether_brick");

                //Cobblestone -> Stone
                oreBlasting(STONE_BLASTABLES, RecipeCategory.BUILDING_BLOCKS,
                        CookingBookCategory.BLOCKS, Items.STONE,
                        0.1f, 100, "stone");

                //Cobbled Deepslate -> Deepslate
                oreBlasting(DEEPSLATE_BLASTABLES, RecipeCategory.BUILDING_BLOCKS,
                        CookingBookCategory.BLOCKS, Items.DEEPSLATE,
                        0.1f, 100, "deepslate");

                //Clay Ball -> Brick
                oreBlasting(BRICK_BLASTABLES, RecipeCategory.MISC,
                        CookingBookCategory.MISC, Items.BRICK,
                        0.3f, 100, "brick");

                //Clay Block -> Brick Block
                oreBlasting(BRICKS_BLASTABLES, RecipeCategory.BUILDING_BLOCKS,
                        CookingBookCategory.BLOCKS, Items.BRICKS,
                        0.3f, 100, "bricks");
            }
        };
    }

    @Override
    public String getName() {
        return "CraftingPlusRecipes";
    }

    public static void registerModRecipes() {
        CraftingPlus.LOGGER.info("[Crafting++] Registering Mod Recipes!");
    }
}
