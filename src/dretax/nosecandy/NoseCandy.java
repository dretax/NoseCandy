package dretax.nosecandy;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import dretax.nosecandy.addiction.AddictionTask;
import dretax.nosecandy.command.AddictionCommand;
import dretax.nosecandy.command.NoseCandyCommands;
import dretax.nosecandy.listeners.NoseCandyListener;
import dretax.nosecandy.metrics.*;

import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.block.design.Texture;
import org.getspout.spoutapi.player.FileManager;

public class NoseCandy extends JavaPlugin {
	public static NoseCandy instance;
	public static Logger log = Logger.getLogger("Minecraft");
	public static ConsoleCommandSender _cs;
	public static final String _prefix = ChatColor.AQUA
			+ "[NoseCandy Reloaded] ";
	public Metrics metrics;
	public NoseCandyListener listener;
	public static Object hooks;
	private NoseCandyCommands drugCmd;
	private AddictionCommand addictCmd;
	public Texture CropTextureFile;
	Items items;

	public void onDisable() {
		sendConsoleMessage(ChatColor.RED + "NoseCandy Metrics Disabled!");
	}
	
	public static void sendConsoleMessage(String msg) {
		_cs.sendMessage(_prefix + ChatColor.AQUA + msg);
	}
	public void onEnable() {
		_cs = getServer().getConsoleSender();
		instance = this;
		this.listener = new NoseCandyListener(instance);
		Config.create();
		setTextures();
		this.addictCmd = new AddictionCommand(instance);
		this.drugCmd = new NoseCandyCommands(instance);
		getCommand("drugs").setExecutor(this.drugCmd);
		getCommand("addiction").setExecutor(this.addictCmd);

		this.items = new Items();
		new CraftingRecipe(this);

		new AddictionTask(instance);

		sendConsoleMessage(ChatColor.GREEN + "NoseCandy Enabled!");
		try {
		    Metrics metrics = new Metrics(this);
		    metrics.start();
		    sendConsoleMessage(ChatColor.GREEN + "NoseCandy Metrics Enabled!");
		} catch (IOException e) {
		    // Failed to submit the stats :-(
		}
	}

	public void setTextures() {
		this.CropTextureFile = new Texture(this, "http://dl.dropbox.com/u/41217801/SpoutDrugs/CropTextureFile.png", 256, 256, 16);
		SpoutManager.getFileManager().addToPreLoginCache(this, "http://dl.dropbox.com/u/41217801/SpoutDrugs/CropTextureFile.png");
	}
}