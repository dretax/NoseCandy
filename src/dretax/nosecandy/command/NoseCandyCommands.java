package dretax.nosecandy.command;

import dretax.nosecandy.Items;
import dretax.nosecandy.NoseCandy;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.getspout.spoutapi.inventory.SpoutItemStack;

public class NoseCandyCommands
  implements CommandExecutor
{
  public NoseCandyCommands(NoseCandy plugin)
  {
  }

  public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
  {
    String commandName = command.getName().toLowerCase();

    if (!(sender instanceof Player)) {
      sender.sendMessage("/" + commandName + " can only be run from in game.");
      return true;
    }

    if (commandName.equals("drugs")) {
      Player player = (Player)sender;

      if (player.hasPermission("nosecandy.spawn"))
      {
        player.getInventory().addItem(new ItemStack[] { new SpoutItemStack(Items.rollingPapers, 1) });
        player.getInventory().addItem(new ItemStack[] { new SpoutItemStack(Items.glassPipe, 1) });
        player.getInventory().addItem(new ItemStack[] { new SpoutItemStack(Items.emptyBong, 1) });
        player.getInventory().addItem(new ItemStack[] { new SpoutItemStack(Items.loadedBong, 1) });
        player.getInventory().addItem(new ItemStack[] { new SpoutItemStack(Items.emptySyringe, 1) });
        player.getInventory().addItem(new ItemStack[] { new SpoutItemStack(Items.heroinSyringe, 1) });
        player.getInventory().addItem(new ItemStack[] { new SpoutItemStack(Items.cocaine, 1) });
        player.getInventory().addItem(new ItemStack[] { new SpoutItemStack(Items.weed, 1) });
        player.getInventory().addItem(new ItemStack[] { new SpoutItemStack(Items.heroin, 1) });
        player.getInventory().addItem(new ItemStack[] { new SpoutItemStack(Items.vodka, 1) });
        player.getInventory().addItem(new ItemStack[] { new SpoutItemStack(Items.spliff, 1) });
        player.getInventory().addItem(new ItemStack[] { new SpoutItemStack(Items.fertilizer, 1) });
        player.getInventory().addItem(new ItemStack[] { new SpoutItemStack(Items.MagicMushroom, 1) });
        player.getInventory().addItem(new ItemStack[] { new SpoutItemStack(Items.GarrusPlate, 1) });
        player.getInventory().addItem(new ItemStack[] { new SpoutItemStack(Items.BluePoison, 1) });
        player.getInventory().addItem(new ItemStack[] { new SpoutItemStack(Items.Adderal, 1) });
        player.getInventory().addItem(new ItemStack[] { new SpoutItemStack(Items.Borsodi, 1) });
        player.getInventory().addItem(new ItemStack[] { new SpoutItemStack(Items.Royal, 1) });
        player.getInventory().addItem(new ItemStack[] { new SpoutItemStack(Items.Szolo, 1) });
        player.getInventory().addItem(new ItemStack[] { new SpoutItemStack(Items.Tokaji, 1) });
        player.getInventory().addItem(new ItemStack[] { new SpoutItemStack(Items.Komlo, 1) });
      }

      return true;
    }

    return false;
  }
}