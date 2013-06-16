package dretax.nosecandy.drugs;

import java.util.Map;
import dretax.nosecandy.Config;
import dretax.nosecandy.NoseCandy;
import dretax.nosecandy.addiction.Addict;
import dretax.nosecandy.addiction.AddictionManager;
import net.minecraft.server.v1_5_R3.EntityPlayer;
import net.minecraft.server.v1_5_R3.MobEffect;
import net.minecraft.server.v1_5_R3.MobEffectList;

import org.bukkit.block.BlockFace;
import org.bukkit.craftbukkit.v1_5_R3.entity.CraftPlayer;
import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.player.SpoutPlayer;
import org.getspout.spoutapi.sound.SoundManager;

public class Ecstacy extends BaseDrug
{
	Addict a;

 	public Ecstacy(NoseCandy plugin)
 	{
 		super(plugin, Config.EcstacyName, Config.EcstacyTex);
 	}

 	public boolean onItemInteract(SpoutPlayer player, SpoutBlock block, BlockFace face)
 	{
 		CraftPlayer p = (CraftPlayer)player;
 		p.getHandle().addEffect(new MobEffect(1, 1200, 3));
 		p.getHandle().addEffect(new MobEffect(11, 1000, 4));
 		p.getHandle().addEffect(new MobEffect(9, 400, 5));
 		SpoutManager.getSoundManager().playCustomSoundEffect(NoseCandy.instance, player, "http://dl.dropbox.com/u/136953717/SandwichEat09.ogg", true);
 		consume(player);
 		this.a = ((Addict)AddictionManager.addicts.get(player.getName()));
    	this.a.useEcstacy();
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