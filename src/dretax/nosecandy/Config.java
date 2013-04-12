package dretax.nosecandy;

import java.io.File;
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class Config {
	public static String cocaineTex;
	public static String weedTex;
	public static String loadedBongTex;
	public static String emptyBongTex;
	public static String heroinTex;
	public static String emptySyringeTex;
	public static String heroinSyringeTex;
	public static String vodkaTex;
	public static String rollingPapersTex;
	public static String spliffTex;
	public static String glassPipeTex;
	public static String fertilizerTex;
	public static String GarrusPlateTex;
	public static String BluePoisonTex;
	public static String MagicMushroomTex;
	public static String SzoloTex;
	public static String AdderalTex;
	public static String BorsodiTex;
	public static String RoyalTex;
	public static String TokajiTex;
	public static String komloTex;
	public static boolean hardcore;
	public static String cocaineName;
	public static String weedName;
	public static String loadedBongName;
	public static String emptyBongName;
	public static String heroinName;
	public static String emptySyringeName;
	public static String heroinSyringeName;
	public static String vodkaName;
	public static String rollingPapersName;
	public static String spliffName;
	public static String glassPipeName;
	public static String GarrusPlateName;
	public static String MagicMushroomName;
	public static String BluePoisonName;
	public static String SzoloName;
	public static String AdderalName;
	public static String BorsodiName;
	public static String RoyalName;
	public static String TokajiName;
	public static String komloName;
	public static String addictionMsg;
	public static int withdrawal;
	public static int cocaineChance;
	public static int weedChance;
	public static int heroinChance;
	public static int GarrusPlateChance;
	public static int MagicMushroomChance;
	public static int BluePoisonChance;
	public static int SzoloChance;
	public static int AdderalChance;
	public static int BorsodiChance;
	public static int RoyalChance;
	public static int TokajiChance;
	public static File ncFolder;
	public static File configFile;
	public static FileConfiguration config;

	public static void create() {
		config = new YamlConfiguration();
		ncFolder = new File(NoseCandy.instance.getDataFolder(), "Configuration");
		configFile = new File(ncFolder, "config.yml");

		if ((ncFolder.exists()) && (configFile.exists())) {
			load();
		} else {
			if (!ncFolder.exists()) {
				try {
					ncFolder.mkdirs();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			if (!configFile.exists()) {
				try {
					configFile.createNewFile();
				} catch (Exception e) {
					e.printStackTrace();
				}

				config = new YamlConfiguration();
				config.set("Hardcore mode", Boolean.valueOf(false));
				config.set("Addiction message", "You feel withdrawal symptoms.");
				config.set("Addition level for withdrawal", Integer.valueOf(10));
				config.set("Increase addiction chance.Cocaine", Integer.valueOf(30));
				config.set("Increase addiction chance.Weed", Integer.valueOf(25));
				config.set("Increase addiction chance.Heroin", Integer.valueOf(40));
				config.set("Increase addiction chance.GarrusPlate", Integer.valueOf(25));
				config.set("Increase addiction chance.Tokaji", Integer.valueOf(25));
				config.set("Increase addiction chance.Adderal", Integer.valueOf(25));
				config.set("Increase addiction chance.Royal", Integer.valueOf(25));
				config.set("Increase addiction chance.Borsodi", Integer.valueOf(25));
				config.set("Cocaine.URL", "http://dl.dropbox.com/u/41217801/SpoutDrugs/Cocaine.png");
				config.set("Weed.URL", "http://dl.dropbox.com/u/136953717/marijuanaleaf.png");
				config.set("LoadedBong.URL", "http://dl.dropbox.com/u/41217801/SpoutDrugs/LoadedBong.png");
				config.set("EmptyBong.URL", "http://dl.dropbox.com/u/41217801/SpoutDrugs/Bong.png");
				config.set("Heroin.URL", "http://dl.dropbox.com/u/136953717/largeheroin.png");
				config.set("EmptySyringe.URL", "http://dl.dropbox.com/u/41217801/SpoutDrugs/EmptySyringe.png");
				config.set("HeroinSyringe.URL", "http://dl.dropbox.com/u/41217801/SpoutDrugs/HeroinSyringe.png");
				config.set("Vodka.URL", "http://dl.dropbox.com/u/41217801/SpoutDrugs/Vodka.png");
				config.set("RollingPapers.URL", "http://dl.dropbox.com/u/41217801/SpoutDrugs/Rizla.png");
				config.set("Spliff.URL", "http://dl.dropbox.com/u/136953717/Spliff.png");
				config.set("GlassPipe.URL", "http://dl.dropbox.com/u/41217801/SpoutDrugs/GlassPipe.png");
				config.set("Fertilizer.URL", "http://dl.dropbox.com/u/41217801/SpoutDrugs/Fertilizer.png");
				config.set("GarrusPlate.URL", "http://dl.dropbox.com/u/136953717/platepower.png");
				config.set("MagicMushroom.URL", "http://dl.dropbox.com/u/136953717/InfectedMushroom.png");
				config.set("BluePoison.URL", "http://dl.dropbox.com/u/136953717/kekuveg.png");
				config.set("Adderal.URL", "http://dl.dropbox.com/u/136953717/adderal.png");
				config.set("Borsodi.URL", "http://dl.dropbox.com/u/136953717/borsodi.png");
				config.set("Royal.URL", "http://dl.dropbox.com/u/136953717/royal.png");
				config.set("Szolo.URL", "http://dl.dropbox.com/u/136953717/szolo.png");
				config.set("Tokaji.URL", "http://dl.dropbox.com/u/136953717/tokaji.png");
				config.set("Komlo.URL", "http://dl.dropbox.com/u/136953717/hophop.png");

				config.set("Cocaine.Name", "Cocaine");
				config.set("Weed.Name", "Weed");
				config.set("LoadedBong.Name", "LoadedBong");
				config.set("EmptyBong.Name", "EmptyBong");
				config.set("Heroin.Name", "Heroin");
				config.set("EmptySyringe.Name", "EmptySyringe");
				config.set("HeroinSyringe.Name", "HeroinSyringe");
				config.set("Vodka.Name", "Vodka");
				config.set("RollingPapers.Name", "RollingPapers");
				config.set("Spliff.Name", "Spliff");
				config.set("GlassPipe.Name", "GlassPipe");
				config.set("GarrusPlate.Name", "GarrusPlate");
				config.set("MagicMushroom.Name", "MagicMushroom");
				config.set("BluePoison.Name", "BluePoison");
				config.set("Adderal.Name", "Adderal");
				config.set("Borsodi.Name", "Hungarian Borsodi");
				config.set("Royal.Name", "Royal");
				config.set("Szolo.Name", "Grape");
				config.set("Tokaji.Name", "Hungarian Tokaji");
				config.set("Komlo.Name", "Hop");
				try {
					config.save(configFile);
				} catch (Exception e) {
					e.printStackTrace();
				}
				load();
			}
		}
	}

	public static void load() {
		config = new YamlConfiguration();
		try {
			config.load(configFile);
		} catch (Exception e) {
			e.printStackTrace();
		}

		hardcore = config.getBoolean("Hardcore mode");

		addictionMsg = config.getString("Addiction message");
		withdrawal = config.getInt("Addition level for withdrawal");

		cocaineChance = config.getInt("Increase addiction chance.Cocaine");
		weedChance = config.getInt("Increase addiction chance.Weed");
		heroinChance = config.getInt("Increase addiction chance.Heroin");
		GarrusPlateChance = config.getInt("Increase addiction chance.GarrusPlate");
		MagicMushroomChance = config.getInt("Increase addiction chance.MagicMushroom");
		RoyalChance = config.getInt("Increase addiction chance.Royal");
		AdderalChance = config.getInt("Increase addiction chance.Adderal");
		BorsodiChance = config.getInt("Increase addiction chance.Borsodi");
		SzoloChance = config.getInt("Increase addiction chance.Szolo");
		TokajiChance = config.getInt("Increase addiction chance.Tokaji");

		cocaineTex = config.getString("Cocaine.URL");
		weedTex = config.getString("Weed.URL");
		loadedBongTex = config.getString("LoadedBong.URL");
		emptyBongTex = config.getString("EmptyBong.URL");
		emptySyringeTex = config.getString("EmptySyringe.URL");
		heroinSyringeTex = config.getString("HeroinSyringe.URL");
		komloTex = config.getString("Komlo.URL");
		vodkaTex = config.getString("Vodka.URL");
		rollingPapersTex = config.getString("RollingPapers.URL");
		spliffTex = config.getString("Spliff.URL");
		glassPipeTex = config.getString("GlassPipe.URL");
		heroinTex = config.getString("Heroin.URL");
		fertilizerTex = config.getString("Fertilizer.URL");
		GarrusPlateTex = config.getString("GarrusPlate.URL");
		MagicMushroomTex = config.getString("MagicMushroom.URL");
		BluePoisonTex = config.getString("BluePoison.URL");
		RoyalTex = config.getString("Royal.URL");
		BorsodiTex = config.getString("Borsodi.URL");
		AdderalTex = config.getString("Adderal.URL");
		SzoloTex = config.getString("Szolo.URL");
		TokajiTex = config.getString("Tokaji.URL");

		cocaineName = config.getString("Cocaine.Name");
		weedName = config.getString("Weed.Name");
		loadedBongName = config.getString("LoadedBong.Name");
		emptyBongName = config.getString("EmptyBong.Name");
		emptySyringeName = config.getString("EmptySyringe.Name");
		heroinSyringeName = config.getString("HeroinSyringe.Name");
		vodkaName = config.getString("Vodka.Name");
		rollingPapersName = config.getString("RollingPapers.Name");
		spliffName = config.getString("Spliff.Name");
		glassPipeName = config.getString("GlassPipe.Name");
		heroinName = config.getString("Heroin.Name");
		GarrusPlateName = config.getString("GarrusPlate.Name");
		MagicMushroomName = config.getString("MagicMushroom.Name");
		BluePoisonName = config.getString("BluePoison.Name");
		RoyalName = config.getString("Royal.Name");
		BorsodiName = config.getString("Borsodi.Name");
		AdderalName = config.getString("Adderal.Name");
		SzoloName = config.getString("Szolo.Name");
		TokajiName = config.getString("Tokaji.Name");
		komloName = config.getString("Komlo.Name");

		NoseCandy.log.info("[NoseCandy] Config file loaded.");
	}
}