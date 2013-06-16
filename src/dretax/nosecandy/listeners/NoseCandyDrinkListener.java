package dretax.nosecandy.listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import dretax.nosecandy.addiction.Addict;

public class NoseCandyDrinkListener implements Listener {

	@EventHandler
	public void onDrinkMilk(PlayerInteractEvent event) {
		if(event.getAction() == Action.RIGHT_CLICK_AIR
		|| event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if(event.getPlayer().getInventory().getItemInHand().getType() == Material.MILK_BUCKET) {	
				if (Addict.BluePoisonAddiction > 0)
					Addict.BluePoisonAddiction -= 1;
				if (Addict.MagicMushroomAddiction > 0)
					Addict.MagicMushroomAddiction -= 1;
				if (Addict.GarrusPlateAddiction > 0)
					Addict.GarrusPlateAddiction -= 1;
				if (Addict.vodkaAddiction > 0)
					Addict.vodkaAddiction -= 1;
				if (Addict.heroinAddiction > 0)
					Addict.heroinAddiction -= 1;
				if (Addict.weedAddiction > 0)
					Addict.weedAddiction -= 1;
				if (Addict.AdderalAddiction > 0)
					Addict.AdderalAddiction -= 1;
				if (Addict.BorsodiAddiction > 0)
					Addict.BorsodiAddiction -= 1;
				if (Addict.RoyalAddiction > 0)
					Addict.RoyalAddiction -= 1;
				if (Addict.SzoloAddiction > 0)
					Addict.SzoloAddiction -= 1;
				if (Addict.TokajiAddiction > 0)
					Addict.TokajiAddiction -= 1;
				if (Addict.EcstacyAddiction > 0)
					Addict.EcstacyAddiction -= 1;
				if (Addict.LSDAddiction > 0)
					Addict.LSDAddiction -= 1;
				if (Addict.MethAddiction > 0)
					Addict.MethAddiction -= 1;
				if (Addict.JDBAddiction > 0)
					Addict.JDBAddiction -= 1;
				if (Addict.JDOAddiction > 0)
					Addict.JDOAddiction -= 1;
			}
		}
	}
}