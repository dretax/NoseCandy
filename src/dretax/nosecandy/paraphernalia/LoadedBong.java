package dretax.nosecandy.paraphernalia;

import java.util.Map;
import dretax.nosecandy.Config;
import dretax.nosecandy.Items;
import dretax.nosecandy.NoseCandy;
import dretax.nosecandy.addiction.Addict;
import dretax.nosecandy.addiction.AddictionManager;
import dretax.nosecandy.drugs.smoke.LargeSmokeEffect;
import net.minecraft.server.v1_5_R3.EntityPlayer;
import net.minecraft.server.v1_5_R3.MobEffect;
import org.bukkit.block.BlockFace;
import org.bukkit.craftbukkit.v1_5_R3.entity.CraftPlayer;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.player.SpoutPlayer;
import org.getspout.spoutapi.sound.SoundManager;

public class LoadedBong extends BaseParaphernalia
{
  NoseCandy plugin;
  Addict a;

  public LoadedBong(NoseCandy plugin)
  {
    super(plugin, Config.loadedBongName, Config.loadedBongTex);
  }

  public boolean onItemInteract(SpoutPlayer player, SpoutBlock block, BlockFace face)
  {
    CraftPlayer p = (CraftPlayer)player;
    p.getHandle().addEffect(new MobEffect(9, 300, 3));
    consume(player);
    player.updateInventory();

    this.a = ((Addict)AddictionManager.addicts.get(player.getName()));
    this.a.useWeed();

    new LargeSmokeEffect(player);

    SpoutManager.getSoundManager().playCustomSoundEffect(NoseCandy.instance, player, "http://dl.dropbox.com/u/41217801/SpoutDrugs/bongHit.ogg", true);

    return super.onItemInteract(player, block, face);
  }

  private void consume(SpoutPlayer player)
  {
    if (player.getItemInHand().getAmount() == 1) {
      player.setItemInHand(new SpoutItemStack(Items.emptyBong, 1));
    } else {
      player.getItemInHand().setAmount(player.getItemInHand().getAmount() - 1);
      player.getInventory().addItem(new ItemStack[] { new SpoutItemStack(Items.emptyBong, 1) });
    }
  }
}