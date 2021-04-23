package com.ter.modter.init;

import java.util.ArrayList;
import java.util.List;

import com.ter.modter.objects.blocks.BlockBasic;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit
{
	public static List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_TER = new BlockBasic("block_ter", Material.ROCK);
}