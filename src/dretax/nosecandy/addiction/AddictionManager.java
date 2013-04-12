package dretax.nosecandy.addiction;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import dretax.nosecandy.NoseCandy;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class AddictionManager
{
  public static Map<String, Addict> addicts = new HashMap<String, Addict>();
  File folder;

  public void checkPlayer(String name)
  {
    this.folder = new File(NoseCandy.instance.getDataFolder(), "players");
    File playerFile = new File(this.folder, name.toLowerCase() + ".yml");
    FileConfiguration player = new YamlConfiguration();

    if (!this.folder.exists()) {
      try {
        this.folder.mkdirs();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    if (!playerFile.exists()) {
      try {
        playerFile.createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
      }

      player.set("Addiction.Cocaine", Integer.valueOf(0));
      player.set("Addiction.Weed", Integer.valueOf(0));
      player.set("Addiction.Heroin", Integer.valueOf(0));
      player.set("Addiction.Vodka", Integer.valueOf(0));
      player.set("Addiction.GarrusPlate", Integer.valueOf(0));
      player.set("Addiction.MagicMushroom", Integer.valueOf(0));
      player.set("Addiction.BluePoison", Integer.valueOf(0));
      player.set("Addiction.Adderal", Integer.valueOf(0));
      player.set("Addiction.Borsodi", Integer.valueOf(0));
      player.set("Addiction.Royal", Integer.valueOf(0));
      player.set("Addiction.Szolo", Integer.valueOf(0));
      player.set("Addiction.Tokaji", Integer.valueOf(0));

      player.set("Drug use.Cocaine", Integer.valueOf(0));
      player.set("Drug use.Weed", Integer.valueOf(0));
      player.set("Drug use.Heroin", Integer.valueOf(0));
      player.set("Drug use.Vodka", Integer.valueOf(0));
      player.set("Drug use.GarrusPlate", Integer.valueOf(0));
      player.set("Drug use.MagicMushroom", Integer.valueOf(0));
      player.set("Drug use.BluePoison", Integer.valueOf(0));
      player.set("Drug use.Adderal", Integer.valueOf(0));
      player.set("Drug use.Borsodi", Integer.valueOf(0));
      player.set("Drug use.Royal", Integer.valueOf(0));
      player.set("Drug use.Szolo", Integer.valueOf(0));
      player.set("Drug use.Tokaji", Integer.valueOf(0));
      try
      {
        player.save(playerFile);
      } catch (Exception e) {
        e.printStackTrace();
      }

      Addict a = new Addict(name);
      a.newAddict();
      addicts.put(name, a);
    } else {
      loadPlayer(name, playerFile);
    }
  }

  private void loadPlayer(String name, File playerFile) {
    FileConfiguration player = new YamlConfiguration();
    Addict a = new Addict(name);
    try {
      player.load(playerFile);
    } catch (Exception e) {
      e.printStackTrace();
    }

    a.setInfo(player.getInt("Drug use.Cocaine"), player.getInt("Addiction.Cocaine"), player.getInt("Drug use.Weed"), player.getInt("Addiction.Weed"), player.getInt("Drug use.Heroin"), player.getInt("Addiction.Heroin"), player.getInt("Drug use.Vodka"), player.getInt("Addiction.Vodka"), player.getInt("Addiction.Adderal"), player.getInt("Addiction.Borsodi"), player.getInt("Addiction.Royal"), player.getInt("Addiction.Szolo"), player.getInt("Addiction.Tokaji"));
    addicts.put(name, a);
  }

  public void savePlayer(String name) {
    File playerFile = new File(this.folder, name.toLowerCase() + ".yml");
    FileConfiguration player = new YamlConfiguration();
    Addict a;
    if (addicts.containsKey(name))
      a = (Addict)addicts.get(name);
    else
      return;

    player.set("Addiction.Cocaine", Integer.valueOf(a.getCocaineAddiction()));
    player.set("Addiction.Weed", Integer.valueOf(a.getWeedAddiction()));
    player.set("Addiction.Heroin", Integer.valueOf(a.getHeroinAddiction()));
    player.set("Addiction.Vodka", Integer.valueOf(a.getVodkaAddiction()));
    player.set("Addiction.GarrusPlate", Integer.valueOf(a.getGarrusPlateAddiction()));
    player.set("Addiction.MagicMushroom", Integer.valueOf(a.getMagicMushroomAddiction()));
    player.set("Addiction.BluePoison", Integer.valueOf(a.getBluePoisonAddiction()));
    player.set("Addiction.Adderal", Integer.valueOf(a.getBluePoisonAddiction()));
    player.set("Addiction.Borsodi", Integer.valueOf(a.getBluePoisonAddiction()));
    player.set("Addiction.Royal", Integer.valueOf(a.getBluePoisonAddiction()));
    player.set("Addiction.Szolo", Integer.valueOf(a.getBluePoisonAddiction()));
    player.set("Addiction.Tokaji", Integer.valueOf(a.getBluePoisonAddiction()));

    player.set("Drug use.Cocaine", Integer.valueOf(a.getCocaineUse()));
    player.set("Drug use.Weed", Integer.valueOf(a.getWeedUse()));
    player.set("Drug use.Heroin", Integer.valueOf(a.getHeroinUse()));
    player.set("Drug use.Vodka", Integer.valueOf(a.getVodkaUse()));
    player.set("Drug use.GarrusPlate", Integer.valueOf(a.getGarrusPlateUse()));
    player.set("Drug use.MagicMushroom", Integer.valueOf(a.getMagicMushroomUse()));
    player.set("Drug use.BluePoison", Integer.valueOf(a.getBluePoisonUse()));
    player.set("Drug use.Adderal", Integer.valueOf(a.getBluePoisonUse()));
    player.set("Drug use.Borsodi", Integer.valueOf(a.getBluePoisonUse()));
    player.set("Drug use.Royal", Integer.valueOf(a.getBluePoisonUse()));
    player.set("Drug use.Szolo", Integer.valueOf(a.getBluePoisonUse()));
    player.set("Drug use.Tokaji", Integer.valueOf(a.getBluePoisonUse()));
    try
    {
      player.save(playerFile);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}