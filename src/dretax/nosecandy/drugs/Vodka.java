package dretax.nosecandy.drugs;

import java.util.Map;
import dretax.nosecandy.Config;
import dretax.nosecandy.NoseCandy;
import dretax.nosecandy.addiction.Addict;
import dretax.nosecandy.addiction.AddictionManager;
import net.minecraft.server.v1_5_R3.EntityPlayer;
import net.minecraft.server.v1_5_R3.MobEffect;
import org.bukkit.block.BlockFace;
import org.bukkit.craftbukkit.v1_5_R3.entity.CraftPlayer;
import org.bukkit.inventory.ItemStack;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.player.SpoutPlayer;
import org.getspout.spoutapi.sound.SoundManager;

public class Vodka extends BaseDrug
{
	Addict a;

	public Vodka(NoseCandy plugin)
	{
		super(plugin, Config.vodkaName, Config.vodkaTex);
	}

	public boolean onItemInteract(SpoutPlayer player, SpoutBlock block, BlockFace face)
	{
		CraftPlayer p = (CraftPlayer)player;

		SpoutManager.getSoundManager().playCustomSoundEffect(NoseCandy.instance, player, "http://dl.dropbox.com/u/41217801/SpoutDrugs/vodkaGlug.ogg", true);

		p.getHandle().addEffect(new MobEffect(2, 300, 3));
		p.getHandle().addEffect(new MobEffect(9, 300, 1));

		this.a = ((Addict)AddictionManager.addicts.get(player.getName()));
		this.a.useVodka();

		consume(player);
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