package dretax.nosecandy.drugs.smoke;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.World;
import org.getspout.spoutapi.player.SpoutPlayer;

public class LargeSmokeEffect
{
  public LargeSmokeEffect(SpoutPlayer player)
  {
    Location loc = player.getLocation();
    Location loc2 = loc;
    Location loc3 = loc;

    double y = loc.getY();
    double x = loc.getX();
    double z = loc.getZ();
    loc.setY(y + 1.0D);

    loc2.setY(y + 1.0D);
    loc2.setX(x + 1.0D);

    loc3.setY(y + 1.0D);
    loc3.setX(x - 1.0D);

    player.getWorld().playEffect(loc, Effect.SMOKE, 1);
    player.getWorld().playEffect(loc2, Effect.SMOKE, 2);
    player.getWorld().playEffect(loc3, Effect.SMOKE, 3);
  }
}