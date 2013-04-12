package dretax.nosecandy.crops;

import dretax.nosecandy.NoseCandy;


import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEvent;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.MaterialData;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
import org.bukkit.inventory.ItemStack;

public class BaseCrop extends GenericCubeCustomBlock
{
	public BaseCrop(NoseCandy plugin, String name, int[] id) {
		super(plugin, name, new GenericCubeBlockDesign(plugin, plugin.CropTextureFile, id));
		setBlockDesign(new CropDesign(plugin, plugin.CropTextureFile, id));
	}
  
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e) {
		if (e.getClickedBlock().getType().equals(MaterialData.farmland)) {
		//	if (e.getPlayer().getInventory().getItemInHand.equals())
		}
	}
	
	public void Seed() {
		
	}
}