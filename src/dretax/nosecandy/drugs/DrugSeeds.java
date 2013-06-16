package dretax.nosecandy.drugs;

import dretax.nosecandy.Config;
import dretax.nosecandy.Items;
import dretax.nosecandy.NoseCandy;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.player.SpoutPlayer;

public class DrugSeeds extends BaseDrug
{
	public DrugSeeds(NoseCandy plugin)
	{
		super(plugin, Config.DrugSeedsName, Config.DrugSeedsTex);
	}

	public boolean onItemInteract(SpoutPlayer player, SpoutBlock block, BlockFace face)
	{
		return super.onItemInteract(player, block, face);
	}
	
}