package dretax.nosecandy.addiction;

import java.util.Map;
import java.util.Random;
import dretax.nosecandy.NoseCandy;
import dretax.nosecandy.drugs.Vodka;
import net.minecraft.server.v1_5_R2.Material;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Result;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.getspout.spoutapi.inventory.MaterialManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.MaterialData;

public class LowerAddiction
{
  NoseCandy p;
  private Addict a;
  private Player[] players;
  private Random r = new Random();

  public LowerAddiction(NoseCandy plugin)
  {
    this.p = plugin;
    lowerAddiction();
  }

  public void lowerAddiction()
  {
    this.p.getServer().getScheduler().scheduleSyncRepeatingTask(this.p, new Runnable()
    {
      public void run() {
        if (Bukkit.getServer().getOnlinePlayers().length > 0) {
          LowerAddiction.this.players = Bukkit.getServer().getOnlinePlayers();

          for (int i = 0; i < LowerAddiction.this.players.length; i++)
            switch (LowerAddiction.this.r.nextInt(4)) {
            case 0:
              LowerAddiction.this.a = ((Addict)AddictionManager.addicts.get(LowerAddiction.this.players[i].getName()));
              LowerAddiction.this.a.lowerCocaineAddiction();
              break;
            case 1:
              LowerAddiction.this.a = ((Addict)AddictionManager.addicts.get(LowerAddiction.this.players[i].getName()));
              LowerAddiction.this.a.lowerWeedAddiction();
              break;
            case 2:
              LowerAddiction.this.a = ((Addict)AddictionManager.addicts.get(LowerAddiction.this.players[i].getName()));
              LowerAddiction.this.a.lowerHeroinAddiction();
              break;
            case 3:
              LowerAddiction.this.a = ((Addict)AddictionManager.addicts.get(LowerAddiction.this.players[i].getName()));
              LowerAddiction.this.a.lowerVodkaAddiction();
            case 4:
              LowerAddiction.this.a = ((Addict)AddictionManager.addicts.get(LowerAddiction.this.players[i].getName()));
              LowerAddiction.this.a.lowerGarrusPlateAddiction();
            case 5:
              LowerAddiction.this.a = ((Addict)AddictionManager.addicts.get(LowerAddiction.this.players[i].getName()));
              LowerAddiction.this.a.lowerMagicMushroomAddiction();
            case 6:
              LowerAddiction.this.a = ((Addict)AddictionManager.addicts.get(LowerAddiction.this.players[i].getName()));
              LowerAddiction.this.a.lowerAdderalAddiction();
            case 7:
              LowerAddiction.this.a = ((Addict)AddictionManager.addicts.get(LowerAddiction.this.players[i].getName()));
              LowerAddiction.this.a.lowerBorsodiAddiction();
            case 8:
              LowerAddiction.this.a = ((Addict)AddictionManager.addicts.get(LowerAddiction.this.players[i].getName()));
              LowerAddiction.this.a.lowerRoyalAddiction();
            case 9:
              LowerAddiction.this.a = ((Addict)AddictionManager.addicts.get(LowerAddiction.this.players[i].getName()));
              LowerAddiction.this.a.lowerSzoloAddiction();
            case 10:
              LowerAddiction.this.a = ((Addict)AddictionManager.addicts.get(LowerAddiction.this.players[i].getName()));
              LowerAddiction.this.a.lowerTokajiAddiction();
            }
        }
      }
    }
    , 60L, 12000L);
  }
}