package dretax.nosecandy.drugs;

import dretax.nosecandy.Config;
import dretax.nosecandy.NoseCandy;
import org.bukkit.block.BlockFace;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.player.SpoutPlayer;

public class Heroin extends BaseDrug
{
	public Heroin(NoseCandy plugin)
	{
		super(plugin, Config.heroinName, Config.heroinTex);
	}

	public boolean onItemInteract(SpoutPlayer player, SpoutBlock block, BlockFace face)
	{
		return super.onItemInteract(player, block, face);
	}
}