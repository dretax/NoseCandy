package dretax.nosecandy.paraphernalia;

import dretax.nosecandy.Config;
import dretax.nosecandy.NoseCandy;
import org.bukkit.block.BlockFace;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.player.SpoutPlayer;

public class Fertilizer extends BaseParaphernalia
{
  public Fertilizer(NoseCandy plugin)
  {
    super(plugin, "Fertilizer", Config.fertilizerTex);
  }

  public boolean onItemInteract(SpoutPlayer player, SpoutBlock block, BlockFace face)
  {
    consume();
    return super.onItemInteract(player, block, face);
  }

  private void consume()
  {
  }
}