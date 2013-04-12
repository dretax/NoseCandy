package dretax.nosecandy.paraphernalia;

import java.util.Map;
import dretax.nosecandy.Config;
import dretax.nosecandy.Items;
import dretax.nosecandy.NoseCandy;
import dretax.nosecandy.addiction.Addict;
import dretax.nosecandy.addiction.AddictionManager;
import net.minecraft.server.v1_5_R2.EntityPlayer;
import net.minecraft.server.v1_5_R2.MobEffect;
import org.bukkit.block.BlockFace;
import org.bukkit.craftbukkit.v1_5_R2.entity.CraftPlayer;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.player.SpoutPlayer;

public class HeroinSyringe extends BaseParaphernalia
{
  Addict a;

  public HeroinSyringe(NoseCandy plugin)
  {
    super(plugin, Config.heroinSyringeName, Config.heroinSyringeTex);
  }

  public boolean onItemInteract(SpoutPlayer player, SpoutBlock block, BlockFace face)
  {
    CraftPlayer p = (CraftPlayer)player;
    p.getHandle().addEffect(new MobEffect(15, 300, 3));
    consume(player);
    player.updateInventory();

    this.a = ((Addict)AddictionManager.addicts.get(player.getName()));
    this.a.useHeroin();

    return super.onItemInteract(player, block, face);
  }

  private void consume(SpoutPlayer player)
  {
    if (player.getItemInHand().getAmount() == 1) {
      player.setItemInHand(new SpoutItemStack(Items.emptySyringe, 1));
    } else {
      player.getItemInHand().setAmount(player.getItemInHand().getAmount() - 1);
      player.getInventory().addItem(new ItemStack[] { new SpoutItemStack(Items.emptySyringe, 1) });
    }
  }
}