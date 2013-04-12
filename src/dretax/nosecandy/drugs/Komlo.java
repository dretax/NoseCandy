package dretax.nosecandy.drugs;

import dretax.nosecandy.Config;
import dretax.nosecandy.NoseCandy;
import org.bukkit.block.BlockFace;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.player.SpoutPlayer;

public class Komlo extends BaseDrug
{
	public Komlo(NoseCandy plugin)
	{
		super(plugin, Config.komloName, Config.komloTex);
	}

	public boolean onItemInteract(SpoutPlayer player, SpoutBlock block, BlockFace face)
	{
		return super.onItemInteract(player, block, face);
	}
}