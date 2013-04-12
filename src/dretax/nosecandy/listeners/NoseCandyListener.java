package dretax.nosecandy.listeners;

import dretax.nosecandy.NoseCandy;
import dretax.nosecandy.addiction.AddictionManager;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.PluginManager;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.player.FileManager;
import org.getspout.spoutapi.player.SpoutPlayer;

public class NoseCandyListener
  implements Listener
{
  NoseCandy p;
  AddictionManager ac = new AddictionManager();

  public NoseCandyListener(NoseCandy plugin)
  {
    this.p = plugin;
    Bukkit.getServer().getPluginManager().registerEvents(this, this.p);
  }

  @EventHandler
  public void onPlayerJoin(PlayerJoinEvent event)
  {
    SpoutPlayer sp = (SpoutPlayer)event.getPlayer();
    if (sp.isSpoutCraftEnabled()) {
      SpoutManager.getFileManager().addToPreLoginCache(this.p, "http://dl.dropbox.com/u/41217801/SpoutDrugs/Cocaine.png");
      SpoutManager.getFileManager().addToPreLoginCache(this.p, "http://dl.dropbox.com/u/41217801/SpoutDrugs/Vodka.png");
      SpoutManager.getFileManager().addToPreLoginCache(this.p, "http://dl.dropbox.com/u/136953717/marijuanaleaf.png");
      SpoutManager.getFileManager().addToPreLoginCache(this.p, "http://dl.dropbox.com/u/41217801/SpoutDrugs/Bong.png");
      SpoutManager.getFileManager().addToPreLoginCache(this.p, "http://dl.dropbox.com/u/41217801/SpoutDrugs/LoadedBong.png");
      SpoutManager.getFileManager().addToPreLoginCache(this.p, "http://dl.dropbox.com/u/41217801/SpoutDrugs/EmptySyringe.png");
      SpoutManager.getFileManager().addToPreLoginCache(this.p, "http://dl.dropbox.com/u/41217801/SpoutDrugs/HeroinSyringe.png");
      SpoutManager.getFileManager().addToPreLoginCache(this.p, "http://dl.dropbox.com/u/41217801/SpoutDrugs/Rizla.png");
      SpoutManager.getFileManager().addToPreLoginCache(this.p, "http://dl.dropbox.com/u/136953717/Spliff.png");
      SpoutManager.getFileManager().addToPreLoginCache(this.p, "http://dl.dropbox.com/u/41217801/SpoutDrugs/GlassPipe.png");
      SpoutManager.getFileManager().addToPreLoginCache(this.p, "http://dl.dropbox.com/u/136953717/largeheroin.png");
      SpoutManager.getFileManager().addToPreLoginCache(this.p, "http://dl.dropbox.com/u/41217801/SpoutDrugs/TestCrop.png");
      SpoutManager.getFileManager().addToPreLoginCache(this.p, "http://dl.dropbox.com/u/41217801/SpoutDrugs/CropTextureFile.png");
      SpoutManager.getFileManager().addToPreLoginCache(this.p, "http://dl.dropbox.com/u/41217801/SpoutDrugs/bongHit.ogg");
      SpoutManager.getFileManager().addToPreLoginCache(this.p, "http://dl.dropbox.com/u/41217801/SpoutDrugs/lighter.ogg");
      SpoutManager.getFileManager().addToPreLoginCache(this.p, "http://dl.dropbox.com/u/41217801/SpoutDrugs/vodkaGlug.ogg");
      SpoutManager.getFileManager().addToPreLoginCache(this.p, "http://dl.dropbox.com/u/41217801/SpoutDrugs/Snort.ogg");
      SpoutManager.getFileManager().addToPreLoginCache(this.p, "http://dl.dropbox.com/u/136953717/SandwichEat09.ogg");
      SpoutManager.getFileManager().addToPreLoginCache(this.p, "http://dl.dropbox.com/u/136953717/platepower.png");
      SpoutManager.getFileManager().addToPreLoginCache(this.p, "http://dl.dropbox.com/u/136953717/InfectedMushroom.png");
      SpoutManager.getFileManager().addToPreLoginCache(this.p, "http://dl.dropbox.com/u/136953717/kekuveg.png");
      SpoutManager.getFileManager().addToPreLoginCache(this.p, "http://dl.dropbox.com/u/136953717/adderal.png");
      SpoutManager.getFileManager().addToPreLoginCache(this.p, "http://dl.dropbox.com/u/136953717/borsodi.png");
      SpoutManager.getFileManager().addToPreLoginCache(this.p, "http://dl.dropbox.com/u/136953717/royal.png");
      SpoutManager.getFileManager().addToPreLoginCache(this.p, "http://dl.dropbox.com/u/136953717/szolo.png");
      SpoutManager.getFileManager().addToPreLoginCache(this.p, "http://dl.dropbox.com/u/136953717/tokaji.png");
      SpoutManager.getFileManager().addToPreLoginCache(this.p, "http://dl.dropbox.com/u/136953717/hophop.png");
    }

    this.ac.checkPlayer(event.getPlayer().getName());
  }

  @EventHandler
  public void onPlayerQuit(PlayerQuitEvent event) {
    this.ac.savePlayer(event.getPlayer().getName());
  }
}