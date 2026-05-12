package com.baisylia.modestmasonry.block;

import com.baisylia.modestmasonry.ModestMasonry;
import com.baisylia.modestmasonry.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModestMasonry.MOD_ID);

    //BLOCKS
    public static final RegistryObject<Block> CEMENT = registerBlock("cement",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE)), CreativeModeTab.TAB_BUILDING_BLOCKS, false, 0);

    public static final RegistryObject<Block> CEMENT_POWDER = registerBlock("cement_powder",
            () -> new ConcretePowderBlock(CEMENT.get(), BlockBehaviour.Properties.copy(Blocks.GRAY_CONCRETE_POWDER)), CreativeModeTab.TAB_BUILDING_BLOCKS, false, 0);

    public static final RegistryObject<Block> ADOBE_BRICKS = registerBlock("adobe_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)), CreativeModeTab.TAB_BUILDING_BLOCKS, false, 0);

    public static final RegistryObject<Block> ADOBE_BRICK_SLAB = registerBlock("adobe_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_SLAB)), CreativeModeTab.TAB_BUILDING_BLOCKS, false, 0);

    public static final RegistryObject<Block> ADOBE_BRICK_STAIRS = registerBlock("adobe_brick_stairs",
            () -> new StairBlock(() -> Blocks.STONE_BRICK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS)), CreativeModeTab.TAB_BUILDING_BLOCKS, false, 0);

    public static final RegistryObject<Block> ADOBE_BRICK_WALL = registerBlock("adobe_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS)), CreativeModeTab.TAB_BUILDING_BLOCKS, false, 0);

    public static final RegistryObject<Block> CRACKED_ADOBE_BRICKS = registerBlock("cracked_adobe_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)), CreativeModeTab.TAB_BUILDING_BLOCKS, false, 0);

    public static final RegistryObject<Block> MOSSY_ADOBE_BRICKS = registerBlock("mossy_adobe_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS)), CreativeModeTab.TAB_BUILDING_BLOCKS, false, 0);

    public static final RegistryObject<Block> MOSSY_ADOBE_BRICK_SLAB = registerBlock("mossy_adobe_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICK_SLAB)), CreativeModeTab.TAB_BUILDING_BLOCKS, false, 0);

    public static final RegistryObject<Block> MOSSY_ADOBE_BRICK_STAIRS = registerBlock("mossy_adobe_brick_stairs",
            () -> new StairBlock(() -> Blocks.MOSSY_STONE_BRICK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICK_STAIRS)), CreativeModeTab.TAB_BUILDING_BLOCKS, false, 0);

    public static final RegistryObject<Block> MOSSY_ADOBE_BRICK_WALL = registerBlock("mossy_adobe_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_STAIRS)), CreativeModeTab.TAB_BUILDING_BLOCKS, false, 0);


    public static final RegistryObject<Block> OAK_PILLAR = registerBlock("oak_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
                }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> SPRUCE_PILLAR = registerBlock("spruce_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> BIRCH_PILLAR = registerBlock("birch_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> JUNGLE_PILLAR = registerBlock("jungle_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ACACIA_PILLAR = registerBlock("acacia_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> DARK_OAK_PILLAR = registerBlock("dark_oak_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WARPED_PILLAR = registerBlock("warped_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_STEM))
            , CreativeModeTab.TAB_BUILDING_BLOCKS, false, 300);

    public static final RegistryObject<Block> CRIMSON_PILLAR = registerBlock("crimson_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_STEM))
            , CreativeModeTab.TAB_BUILDING_BLOCKS, false, 300);

    public static final RegistryObject<Block> MANGROVE_PILLAR = registerBlock("mangrove_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> OAK_BOARDS = registerBlock("oak_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> OAK_BOARD_SLAB = registerBlock("oak_board_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> OAK_BOARD_STAIRS = registerBlock("oak_board_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> OAK_BOARD_WALL = registerBlock("oak_board_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> SPRUCE_BOARDS = registerBlock("spruce_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> SPRUCE_BOARD_SLAB = registerBlock("spruce_board_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> SPRUCE_BOARD_STAIRS = registerBlock("spruce_board_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> SPRUCE_BOARD_WALL = registerBlock("spruce_board_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> BIRCH_BOARDS = registerBlock("birch_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> BIRCH_BOARD_SLAB = registerBlock("birch_board_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> BIRCH_BOARD_STAIRS = registerBlock("birch_board_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> BIRCH_BOARD_WALL = registerBlock("birch_board_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> JUNGLE_BOARDS = registerBlock("jungle_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> JUNGLE_BOARD_SLAB = registerBlock("jungle_board_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> JUNGLE_BOARD_STAIRS = registerBlock("jungle_board_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> JUNGLE_BOARD_WALL = registerBlock("jungle_board_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ACACIA_BOARDS = registerBlock("acacia_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ACACIA_BOARD_SLAB = registerBlock("acacia_board_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ACACIA_BOARD_STAIRS = registerBlock("acacia_board_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ACACIA_BOARD_WALL = registerBlock("acacia_board_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> DARK_OAK_BOARDS = registerBlock("dark_oak_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> DARK_OAK_BOARD_SLAB = registerBlock("dark_oak_board_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> DARK_OAK_BOARD_STAIRS = registerBlock("dark_oak_board_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> DARK_OAK_BOARD_WALL = registerBlock("dark_oak_board_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WARPED_BOARDS = registerBlock("warped_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
            , CreativeModeTab.TAB_BUILDING_BLOCKS, false, 300);

    public static final RegistryObject<Block> WARPED_BOARD_SLAB = registerBlock("warped_board_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_SLAB).noOcclusion())
            , CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WARPED_BOARD_STAIRS = registerBlock("warped_board_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.CRIMSON_STAIRS).noOcclusion())
            , CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WARPED_BOARD_WALL = registerBlock("warped_board_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
            , CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CRIMSON_BOARDS = registerBlock("crimson_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
            , CreativeModeTab.TAB_BUILDING_BLOCKS, false, 300);

    public static final RegistryObject<Block> CRIMSON_BOARD_SLAB = registerBlock("crimson_board_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_SLAB).noOcclusion())
            , CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CRIMSON_BOARD_STAIRS = registerBlock("crimson_board_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.CRIMSON_STAIRS).noOcclusion())
            , CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CRIMSON_BOARD_WALL = registerBlock("crimson_board_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
            , CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MANGROVE_BOARDS = registerBlock("mangrove_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MANGROVE_BOARD_SLAB = registerBlock("mangrove_board_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MANGROVE_BOARD_STAIRS = registerBlock("mangrove_board_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MANGROVE_BOARD_WALL = registerBlock("mangrove_board_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);



    public static final RegistryObject<Block> OAK_TILES = registerBlock("oak_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> OAK_TILE_SLAB = registerBlock("oak_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> OAK_TILE_STAIRS = registerBlock("oak_tile_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> OAK_TILE_WALL = registerBlock("oak_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> SPRUCE_TILES = registerBlock("spruce_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> SPRUCE_TILE_SLAB = registerBlock("spruce_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> SPRUCE_TILE_STAIRS = registerBlock("spruce_tile_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> SPRUCE_TILE_WALL = registerBlock("spruce_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> BIRCH_TILES = registerBlock("birch_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> BIRCH_TILE_SLAB = registerBlock("birch_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> BIRCH_TILE_STAIRS = registerBlock("birch_tile_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> BIRCH_TILE_WALL = registerBlock("birch_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> JUNGLE_TILES = registerBlock("jungle_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> JUNGLE_TILE_SLAB = registerBlock("jungle_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> JUNGLE_TILE_STAIRS = registerBlock("jungle_tile_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> JUNGLE_TILE_WALL = registerBlock("jungle_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ACACIA_TILES = registerBlock("acacia_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ACACIA_TILE_SLAB = registerBlock("acacia_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ACACIA_TILE_STAIRS = registerBlock("acacia_tile_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ACACIA_TILE_WALL = registerBlock("acacia_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> DARK_OAK_TILES = registerBlock("dark_oak_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> DARK_OAK_TILE_SLAB = registerBlock("dark_oak_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> DARK_OAK_TILE_STAIRS = registerBlock("dark_oak_tile_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> DARK_OAK_TILE_WALL = registerBlock("dark_oak_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WARPED_TILES = registerBlock("warped_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
            , CreativeModeTab.TAB_BUILDING_BLOCKS, false, 300);

    public static final RegistryObject<Block> WARPED_TILE_SLAB = registerBlock("warped_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WARPED_TILE_STAIRS = registerBlock("warped_tile_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WARPED_TILE_WALL = registerBlock("warped_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CRIMSON_TILES = registerBlock("crimson_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
            , CreativeModeTab.TAB_BUILDING_BLOCKS, false, 300);

    public static final RegistryObject<Block> CRIMSON_TILE_SLAB = registerBlock("crimson_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            , CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CRIMSON_TILE_STAIRS = registerBlock("crimson_tile_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            , CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CRIMSON_TILE_WALL = registerBlock("crimson_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
            , CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MANGROVE_TILES = registerBlock("mangrove_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MANGROVE_TILE_SLAB = registerBlock("mangrove_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MANGROVE_TILE_STAIRS = registerBlock("mangrove_tile_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MANGROVE_TILE_WALL = registerBlock("mangrove_tile_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);



    public static final RegistryObject<Block> CARVED_OAK_PLANKS = registerBlock("carved_oak_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> OAK_CARVED_PLANK_SLAB = registerBlock("oak_carved_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> OAK_CARVED_PLANK_STAIRS = registerBlock("oak_carved_plank_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> OAK_CARVED_PLANK_WALL = registerBlock("oak_carved_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CARVED_SPRUCE_PLANKS = registerBlock("carved_spruce_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> SPRUCE_CARVED_PLANK_SLAB = registerBlock("spruce_carved_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> SPRUCE_CARVED_PLANK_STAIRS = registerBlock("spruce_carved_plank_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> SPRUCE_CARVED_PLANK_WALL = registerBlock("spruce_carved_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CARVED_BIRCH_PLANKS = registerBlock("carved_birch_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> BIRCH_CARVED_PLANK_SLAB = registerBlock("birch_carved_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> BIRCH_CARVED_PLANK_STAIRS = registerBlock("birch_carved_plank_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> BIRCH_CARVED_PLANK_WALL = registerBlock("birch_carved_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CARVED_JUNGLE_PLANKS = registerBlock("carved_jungle_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> JUNGLE_CARVED_PLANK_SLAB = registerBlock("jungle_carved_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> JUNGLE_CARVED_PLANK_STAIRS = registerBlock("jungle_carved_plank_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> JUNGLE_CARVED_PLANK_WALL = registerBlock("jungle_carved_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CARVED_ACACIA_PLANKS = registerBlock("carved_acacia_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ACACIA_CARVED_PLANK_SLAB = registerBlock("acacia_carved_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ACACIA_CARVED_PLANK_STAIRS = registerBlock("acacia_carved_plank_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> ACACIA_CARVED_PLANK_WALL = registerBlock("acacia_carved_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CARVED_DARK_OAK_PLANKS = registerBlock("carved_dark_oak_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> DARK_OAK_CARVED_PLANK_SLAB = registerBlock("dark_oak_carved_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> DARK_OAK_CARVED_PLANK_STAIRS = registerBlock("dark_oak_carved_plank_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> DARK_OAK_CARVED_PLANK_WALL = registerBlock("dark_oak_carved_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CARVED_WARPED_PLANKS = registerBlock("carved_warped_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
            , CreativeModeTab.TAB_BUILDING_BLOCKS, false, 300);

    public static final RegistryObject<Block> WARPED_CARVED_PLANK_SLAB = registerBlock("warped_carved_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WARPED_CARVED_PLANK_STAIRS = registerBlock("warped_carved_plank_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> WARPED_CARVED_PLANK_WALL = registerBlock("warped_carved_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CARVED_CRIMSON_PLANKS = registerBlock("carved_crimson_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
            , CreativeModeTab.TAB_BUILDING_BLOCKS, false, 300);

    public static final RegistryObject<Block> CRIMSON_CARVED_PLANK_SLAB = registerBlock("crimson_carved_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            , CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CRIMSON_CARVED_PLANK_STAIRS = registerBlock("crimson_carved_plank_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            , CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CRIMSON_CARVED_PLANK_WALL = registerBlock("crimson_carved_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS))
            , CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CARVED_MANGROVE_PLANKS = registerBlock("carved_mangrove_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MANGROVE_CARVED_PLANK_SLAB = registerBlock("mangrove_carved_plank_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MANGROVE_CARVED_PLANK_STAIRS = registerBlock("mangrove_carved_plank_stairs",
            () -> new StairBlock(() -> Blocks.OAK_STAIRS.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS).noOcclusion())
            {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> MANGROVE_CARVED_PLANK_WALL = registerBlock("mangrove_carved_plank_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);



    public static final RegistryObject<Block> CHISELED_OAK_PLANKS = registerBlock("chiseled_oak_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHISELED_SPRUCE_PLANKS = registerBlock("chiseled_spruce_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHISELED_BIRCH_PLANKS = registerBlock("chiseled_birch_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHISELED_JUNGLE_PLANKS = registerBlock("chiseled_jungle_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHISELED_ACACIA_PLANKS = registerBlock("chiseled_acacia_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHISELED_DARK_OAK_PLANKS = registerBlock("chiseled_dark_oak_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);

    public static final RegistryObject<Block> CHISELED_WARPED_PLANKS = registerBlock("chiseled_warped_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
            , CreativeModeTab.TAB_BUILDING_BLOCKS, false, 300);

    public static final RegistryObject<Block> CHISELED_CRIMSON_PLANKS = registerBlock("chiseled_crimson_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS))
            , CreativeModeTab.TAB_BUILDING_BLOCKS, false, 300);

    public static final RegistryObject<Block> CHISELED_MANGROVE_PLANKS = registerBlock("chiseled_mangrove_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return true; }
                @Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 60; }
                @Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) { return 30; }
            }, CreativeModeTab.TAB_BUILDING_BLOCKS, true, 300);




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab, Boolean isFuel, Integer fuelAmount) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, isFuel, fuelAmount);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlockNoItem(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab, Boolean isFuel, Integer fuelAmount) {
        if(isFuel == false) {
            return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                    new Item.Properties().tab(tab)));
        } else {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)){
            @Override public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {return fuelAmount;}});
        }
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}