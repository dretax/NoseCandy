package dretax.nosecandy.drugs.smoke;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.World;
import org.getspout.spoutapi.player.SpoutPlayer;

public class SmokeEffect
{
  public SmokeEffect(SpoutPlayer player)
  {
    Location loc = player.getLocation();
    double y = loc.getY() + 1.0D;
    loc.setY(y);

    player.getWorld().playEffect(loc, Effect.SMOKE, 1);
  }
}