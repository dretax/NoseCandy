package dretax.nosecandy.listeners;


import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import dretax.nosecandy.Items;

public class NoseCandySeedsListener implements Listener {
	
	/*@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerInteract(PlayerInteractEvent e) {
		Player player = e.getPlayer();
		Block block = e.getClickedBlock();
		World world = block.getWorld();
		if(e.getAction() == Action.RIGHT_CLICK_AIR
		|| e.getAction() == Action.RIGHT_CLICK_BLOCK) {	
			if(e.getClickedBlock().getType().equals(Material.SOIL)) {
				if (player.getItemInHand().getAmount() >= 1) {
					if(e.getPlayer().getInventory().getItemInHand().getType().equals(Items.DrugSeeds)) {
						if (player.getItemInHand().getAmount() >= 1)
							player.setItemInHand(null);
						else
							player.getItemInHand().setAmount(player.getItemInHand().getAmount() - 1);
						block.setType(Texture.CropTextureFile);
						
					}
							
				}
			}
		}
	}*/
	
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onBlockBreak(BlockBreakEvent e) {
		Block block = e.getBlock();
	    World world = block.getWorld();
	    //if (e.getBlock().equals(MaterialData.DrugBlock));
	    //event.setCancelled(true);
	    // for(ItemStack item : block.getDrops()) {
	    // 	if (block.getBlock().equals(Material.S))
	   	//     event.getPlayer().sendMessage("[Debug] [Drop] " + item.getAmount() + "x " + item.getType().name());
	    //}
	    //block.setType(Material.AIR);
	    //world.dropItem(block.getLocation(), new ItemStack(Material.APPLE, 5));
	    //world.dropItemNaturally(block.getLocation(), new ItemStack(Material.WHEAT, 3));
	}
}
