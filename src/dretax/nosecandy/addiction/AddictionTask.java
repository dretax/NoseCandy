package dretax.nosecandy.addiction;

import dretax.nosecandy.Config;
import dretax.nosecandy.NoseCandy;
import net.minecraft.server.v1_5_R3.MobEffect;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_5_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class AddictionTask
{
  NoseCandy p;
  private Addict a;
  private Player[] players;
  private CraftPlayer cp;

  public AddictionTask(NoseCandy plugin)
  {
    this.p = plugin;
    addiction();
  }

  private void addiction()
  {
    this.p.getServer().getScheduler().scheduleSyncRepeatingTask(this.p, new Runnable()
    {
      public void run() {
        if (Bukkit.getServer().getOnlinePlayers().length > 0) {
          AddictionTask.this.players = Bukkit.getServer().getOnlinePlayers();

          for (int i = 0; i < AddictionTask.this.players.length; i++) {
            AddictionTask.this.a = ((Addict)AddictionManager.addicts.get(AddictionTask.this.players[i].getName()));
            if ((AddictionTask.this.a.getCocaineAddiction() > Config.withdrawal) || (AddictionTask.this.a.getWeedAddiction() > Config.withdrawal) || (AddictionTask.this.a.getHeroinAddiction() > Config.withdrawal) || (AddictionTask.this.a.getVodkaAddiction() > Config.withdrawal) || (AddictionTask.this.a.getGarrusPlateAddiction() > Config.withdrawal) || (AddictionTask.this.a.getBluePoisonAddiction() > Config.withdrawal) || (AddictionTask.this.a.getMagicMushroomAddiction() > Config.withdrawal) || (AddictionTask.this.a.getLSDAddiction() > Config.withdrawal) || (AddictionTask.this.a.getEcstacyAddiction() > Config.withdrawal) || (AddictionTask.this.a.getMethAddiction() > Config.withdrawal) || (AddictionTask.this.a.getJDBAddiction() > Config.withdrawal) || (AddictionTask.this.a.getJDOAddiction() > Config.withdrawal)) {
              AddictionTask.this.cp = ((CraftPlayer)AddictionTask.this.players[i]);
              AddictionTask.this.cp.getHandle().addEffect(new MobEffect(9, 300, 3));
              AddictionTask.this.cp.sendMessage(Config.addictionMsg);

              if (Config.hardcore) {
                AddictionTask.this.cp.setFoodLevel(AddictionTask.this.cp.getFoodLevel() - 2);
                AddictionTask.this.cp.damage(3);
              }
            }
          }
        }
      }
    }
    , 60L, 4800L);
  }
}