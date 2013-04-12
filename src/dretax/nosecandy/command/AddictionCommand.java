package dretax.nosecandy.command;

import java.util.Map;
import dretax.nosecandy.NoseCandy;
import dretax.nosecandy.addiction.Addict;
import dretax.nosecandy.addiction.AddictionManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AddictionCommand
  implements CommandExecutor
{
  public AddictionCommand(NoseCandy plugin)
  {
  }

  public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
  {
    Player player = null;

    if ((sender instanceof Player)) {
      player = (Player)sender;
    }

    if ((player != null) && 
      (command.getName().equalsIgnoreCase("addiction"))) {
      Addict a = (Addict)AddictionManager.addicts.get(player.getName());

      player.sendMessage("==== NoseCandy ====");
      player.sendMessage("== Cocaine ==");
      player.sendMessage("Usage: " + a.getCocaineUse());
      player.sendMessage("Addiction: " + a.getCocaineAddiction());
      player.sendMessage("== Weed ==");
      player.sendMessage("Usage: " + a.getWeedUse());
      player.sendMessage("Addiction: " + a.getWeedAddiction());
      player.sendMessage("== Heroin ==");
      player.sendMessage("Usage: " + a.getHeroinUse());
      player.sendMessage("Addiction: " + a.getHeroinAddiction());
      player.sendMessage("== Vodka ==");
      player.sendMessage("Usage: " + a.getVodkaUse());
      player.sendMessage("Addiction: " + a.getVodkaAddiction());
      player.sendMessage("== GarrusPlate ==");
      player.sendMessage("Usage: " + a.getGarrusPlateUse());
      player.sendMessage("Addiction: " + a.getGarrusPlateAddiction());
      player.sendMessage("== MagicMushroom ==");
      player.sendMessage("Usage: " + a.getMagicMushroomUse());
      player.sendMessage("Addiction: " + a.getMagicMushroomAddiction());
      player.sendMessage("== BluePoison ==");
      player.sendMessage("Usage: " + a.getBluePoisonUse());
      player.sendMessage("Addiction: " + a.getBluePoisonAddiction());
      player.sendMessage("== Adderal ==");
      player.sendMessage("Usage: " + a.getAdderalUse());
      player.sendMessage("Addiction: " + a.getAdderalAddiction());
      player.sendMessage("== Grape ==");
      player.sendMessage("Usage: " + a.getSzoloUse());
      player.sendMessage("Addiction: " + a.getSzoloAddiction());
      player.sendMessage("== Royal ==");
      player.sendMessage("Usage: " + a.getRoyalUse());
      player.sendMessage("Addiction: " + a.getRoyalAddiction());
      player.sendMessage("== Szolo ==");
      player.sendMessage("Usage: " + a.getSzoloUse());
      player.sendMessage("Addiction: " + a.getSzoloAddiction());
      player.sendMessage("== Tokaji ==");
      player.sendMessage("Usage: " + a.getTokajiUse());
      player.sendMessage("Addiction: " + a.getTokajiAddiction());
      
      return true;
    }

    return false;
  }
}