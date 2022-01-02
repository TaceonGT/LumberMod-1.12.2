package com.ridebuilder5.lumbermod.init;

import java.util.ArrayList;
import java.util.List;

import com.ridebuilder5.lumbermod.blocks.araucaria.AraucariaLog;
import com.ridebuilder5.lumbermod.blocks.araucaria.AraucariaPlanks;
import com.ridebuilder5.lumbermod.blocks.cedar.CedarLog;
import com.ridebuilder5.lumbermod.blocks.cedar.CedarPlanks;
import com.ridebuilder5.lumbermod.blocks.celery.CeleryLog;
import com.ridebuilder5.lumbermod.blocks.celery.CeleryPlanks;
import com.ridebuilder5.lumbermod.blocks.cherry.CherryLog;
import com.ridebuilder5.lumbermod.blocks.cherry.CherryPlanks;
import com.ridebuilder5.lumbermod.blocks.coastredwood.CoastRedwoodLog;
import com.ridebuilder5.lumbermod.blocks.coastredwood.CoastRedwoodPlanks;
import com.ridebuilder5.lumbermod.blocks.cypress.CypressLog;
import com.ridebuilder5.lumbermod.blocks.cypress.CypressPlanks;
import com.ridebuilder5.lumbermod.blocks.douglasfir.DouglasFirLog;
import com.ridebuilder5.lumbermod.blocks.douglasfir.DouglasFirPlanks;
import com.ridebuilder5.lumbermod.blocks.europeanyew.EuropeanYewLog;
import com.ridebuilder5.lumbermod.blocks.europeanyew.EuropeanYewPlanks;
import com.ridebuilder5.lumbermod.blocks.fir.FirLog;
import com.ridebuilder5.lumbermod.blocks.fir.FirPlanks;
import com.ridebuilder5.lumbermod.blocks.hemlock.HemlockLog;
import com.ridebuilder5.lumbermod.blocks.hemlock.HemlockPlanks;
import com.ridebuilder5.lumbermod.blocks.huonpine.HuonPineLog;
import com.ridebuilder5.lumbermod.blocks.huonpine.HuonPinePlanks;
import com.ridebuilder5.lumbermod.blocks.japanese.JapaneseYewLog;
import com.ridebuilder5.lumbermod.blocks.japanese.JapaneseYewPlanks;
import com.ridebuilder5.lumbermod.blocks.kauri.KauriLog;
import com.ridebuilder5.lumbermod.blocks.kauri.KauriPlanks;
import com.ridebuilder5.lumbermod.blocks.larch.LarchLog;
import com.ridebuilder5.lumbermod.blocks.larch.LarchPlanks;
import com.ridebuilder5.lumbermod.blocks.lava.LavaLog;
import com.ridebuilder5.lumbermod.blocks.lava.LavaPlanks;
import com.ridebuilder5.lumbermod.blocks.nootkacypress.NootkaCypressLog;
import com.ridebuilder5.lumbermod.blocks.nootkacypress.NootkaCypressPlanks;
import com.ridebuilder5.lumbermod.blocks.pine.PineLog;
import com.ridebuilder5.lumbermod.blocks.pine.PinePlanks;
import com.ridebuilder5.lumbermod.blocks.queenslandkauri.QueenslandKauriLog;
import com.ridebuilder5.lumbermod.blocks.queenslandkauri.QueenslandKauriPlanks;
import com.ridebuilder5.lumbermod.blocks.redcedar.RedCedarLog;
import com.ridebuilder5.lumbermod.blocks.redcedar.RedCedarPlanks;
import com.ridebuilder5.lumbermod.blocks.rimu.RimuLog;
import com.ridebuilder5.lumbermod.blocks.rimu.RimuPlanks;
import com.ridebuilder5.lumbermod.blocks.shimmer.ShimmerLog;
import com.ridebuilder5.lumbermod.blocks.shimmer.ShimmerPlanks;
import com.ridebuilder5.lumbermod.blocks.sugi.SugiLog;
import com.ridebuilder5.lumbermod.blocks.sugi.SugiPlanks;
import com.ridebuilder5.lumbermod.blocks.whitecedar.WhiteCedarLog;
import com.ridebuilder5.lumbermod.blocks.whitecedar.WhiteCedarPlanks;
import com.ridebuilder5.lumbermod.blocks.zombie.ZombieLog;
import com.ridebuilder5.lumbermod.blocks.zombie.ZombiePlanks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks - Official Release
	public static final Block ARAUCARIA_LOG = new AraucariaLog("araucaria_log", Material.WOOD);
	public static final Block ARAUCARIA_PLANK = new AraucariaPlanks("araucaria_planks", Material.WOOD);
	
	public static final Block CEDAR_LOG = new CedarLog("cedar_log", Material.WOOD);
	public static final Block CEDAR_PLANKS = new CedarPlanks("cedar_planks", Material.WOOD);
	
	public static final Block CELERY_LOG = new CeleryLog("celery_log", Material.WOOD);
	public static final Block CELERY_PLANKS = new CeleryPlanks("celery_planks", Material.WOOD);
	
	//Blocks - Softwood: Part 1
	public static final Block CYPRESS_LOG = new CypressLog("cypress_log", Material.WOOD);
	public static final Block CYPRESS_PLANKS = new CypressPlanks("cypress_planks", Material.WOOD);
	
	public static final Block DOUGLAS_FIR_LOG = new DouglasFirLog("douglas_fir_log", Material.WOOD);
	public static final Block DOUGLAS_FIR_PLANKS = new DouglasFirPlanks("douglas_fir_planks", Material.WOOD);
	
	public static final Block EUROPEAN_YEW_LOG = new EuropeanYewLog("european_yew_log", Material.WOOD);
	public static final Block EUROPEAN_YEW_PLANKS = new EuropeanYewPlanks("european_yew_planks", Material.WOOD);
	
	public static final Block FIR_LOG = new FirLog("fir_log", Material.WOOD);
	public static final Block FIR_PLANKS = new FirPlanks("fir_planks", Material.WOOD);
	
	public static final Block HEMLOCK_LOG = new HemlockLog("hemlock_log", Material.WOOD);
	public static final Block HEMLOCK_PLANKS = new HemlockPlanks("hemlock_planks", Material.WOOD);
	
	public static final Block HUON_PINE_LOG = new HuonPineLog("huon_pine_log", Material.WOOD);
	public static final Block HUON_PINE_PLANKS = new HuonPinePlanks("huon_pine_planks", Material.WOOD);
	
	public static final Block KAURI_LOG = new KauriLog("kauri_log", Material.WOOD);
	public static final Block KAURI_PLANKS = new KauriPlanks("kauri_planks", Material.WOOD);
	
	public static final Block QUEENSLAND_KAURI_LOG = new QueenslandKauriLog("queensland_kauri_log", Material.WOOD);
	public static final Block QUEENSLAND_KAURI_PLANKS = new QueenslandKauriPlanks("queensland_kauri_planks", Material.WOOD);
	
	//Blocks - Chewy's Ideas
	public static final Block CHERRY_LOG = new CherryLog("cherry_log", Material.WOOD);
	public static final Block CHERRY_PLANKS = new CherryPlanks("cherry_planks", Material.WOOD);
	
	public static final Block LAVA_LOG = new LavaLog("lava_log", Material.WOOD);
	public static final Block LAVA_PLANKS = new LavaPlanks("lava_planks", Material.WOOD);
	
	public static final Block SHIMMER_LOG = new ShimmerLog("shimmer_log", Material.WOOD);
	public static final Block SHIMMER_PLANKS = new ShimmerPlanks("shimmer_planks", Material.WOOD);
	
	public static final Block ZOMBIE_LOG = new ZombieLog("zombie_log", Material.WOOD);
	public static final Block ZOMBIE_PLANKS = new ZombiePlanks("zombie_planks", Material.WOOD);
	
	//Blocks - Softwood: Part 2
	public static final Block COAST_REDWOOD_LOG = new CoastRedwoodLog("coast_redwood_log", Material.WOOD);
	public static final Block COAST_REDWOOD_PLANKS = new CoastRedwoodPlanks("coast_redwood_planks", Material.WOOD);
	
	public static final Block JAPANESE_YEW_LOG = new JapaneseYewLog("japanese_yew_log", Material.WOOD);
	public static final Block JAPANESE_YEW_PLANKS = new JapaneseYewPlanks("japanese_yew_planks", Material.WOOD);
	
	public static final Block LARCH_LOG = new LarchLog("larch_log", Material.WOOD);
	public static final Block LARCH_PLANKS = new LarchPlanks("larch_planks", Material.WOOD);
	
	public static final Block NOOTKA_CYPRESS_LOG = new NootkaCypressLog("nootka_cypress_log", Material.WOOD);
	public static final Block NOOTKA_CYPRESS_PLANKS = new NootkaCypressPlanks("nootka_cypress_planks", Material.WOOD);
	
	public static final Block PINE_LOG = new PineLog("pine_log", Material.WOOD);
	public static final Block PINE_PLANKS = new PinePlanks("pine_planks", Material.WOOD);
	
	public static final Block RED_CEDAR_LOG = new RedCedarLog("red_cedar_log", Material.WOOD);
	public static final Block RED_CEDAR_PLANKS = new RedCedarPlanks("red_cedar_planks", Material.WOOD);
	
	public static final Block RIMU_LOG = new RimuLog("rimu_log", Material.WOOD);
	public static final Block RIMU_PLANKS = new RimuPlanks("rimu_planks", Material.WOOD);
	
	public static final Block SUGI_LOG = new SugiLog("sugi_log", Material.WOOD);
	public static final Block SUGI_PLANKS = new SugiPlanks("sugi_planks", Material.WOOD);
	
	public static final Block WHITE_CEDAR_LOG = new WhiteCedarLog("white_cedar_log", Material.WOOD);
	public static final Block WHITE_CEDAR_PLANKS = new WhiteCedarPlanks("white_cedar_planks", Material.WOOD);
	
}
