package dretax.nosecandy.drugs;

import java.util.Map;
import dretax.nosecandy.Config;
import dretax.nosecandy.NoseCandy;
import dretax.nosecandy.addiction.Addict;
import dretax.nosecandy.addiction.AddictionManager;
import net.minecraft.server.v1_5_R2.EntityPlayer;
import net.minecraft.server.v1_5_R2.MobEffect;
import org.bukkit.block.BlockFace;
import org.bukkit.craftbukkit.v1_5_R2.entity.CraftPlayer;
import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.player.SpoutPlayer;
import org.getspout.spoutapi.sound.SoundManager;

public class BluePoison extends BaseDrug
{
	Addict a;

  	public BluePoison(NoseCandy plugin)
  	{
  		super(plugin, Config.BluePoisonName, Config.BluePoisonTex);
  	}

  	public boolean onItemInteract(SpoutPlayer player, SpoutBlock block, BlockFace face)
  	{
  		CraftPlayer p = (CraftPlayer)player;
  		p.getHandle().addEffect(new MobEffect(18, 300, 3));
  		p.getHandle().addEffect(new MobEffect(17, 300, 1));
  		p.getHandle().addEffect(new MobEffect(17, 500, 2));
  		SpoutManager.getSoundManager().playCustomSoundEffect(NoseCandy.instance, player, "http://dl.dropbox.com/u/41217801/SpoutDrugs/vodkaGlug.ogg", true);
  		consume(player);
  		this.a = ((Addict)AddictionManager.addicts.get(player.getName()));
  		this.a.useBluePoison();
  		return super.onItemInteract(player, block, face);
  	}

  	private void consume(SpoutPlayer player)
  	{
  		if (player.getItemInHand().getAmount() == 1)
  			player.setItemInHand(null);
  		else
  			player.getItemInHand().setAmount(player.getItemInHand().getAmount() - 1);
  	}
}