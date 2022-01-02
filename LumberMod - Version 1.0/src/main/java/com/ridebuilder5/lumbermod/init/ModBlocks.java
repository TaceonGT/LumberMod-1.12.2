package com.ridebuilder5.lumbermod.init;

import java.util.ArrayList;
import java.util.List;

import com.ridebuilder5.lumbermod.blocks.araucaria.AraucariaLog;
import com.ridebuilder5.lumbermod.blocks.araucaria.AraucariaPlanks;
import com.ridebuilder5.lumbermod.blocks.cedar.CedarLog;
import com.ridebuilder5.lumbermod.blocks.cedar.CedarPlanks;
import com.ridebuilder5.lumbermod.blocks.celery.CeleryLog;
import com.ridebuilder5.lumbermod.blocks.celery.CeleryPlanks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block ARAUCARIA_LOG = new AraucariaLog("araucaria_log", Material.WOOD);
	public static final Block ARAUCARIA_PLANK = new AraucariaPlanks("araucaria_planks", Material.WOOD);
	
	public static final Block CEDAR_LOG = new CedarLog("cedar_log", Material.WOOD);
	public static final Block CEDAR_PLANKS = new CedarPlanks("cedar_planks", Material.WOOD);
	
	public static final Block CELERY_LOG = new CeleryLog("celery_log", Material.WOOD);
	public static final Block CELERY_PLANKS = new CeleryPlanks("celery_planks", Material.WOOD);
}
