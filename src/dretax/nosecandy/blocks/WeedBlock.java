
package dretax.nosecandy.blocks;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.material.block.GenericCubeCustomBlock;
import org.getspout.spoutapi.player.SpoutPlayer;



public class WeedBlock extends GenericCubeCustomBlock {
    public WeedBlock(Plugin plugin) {
        super(plugin, "TestBlock", "http://cdn.spout.org/img/icon/spout_16x16.png", 16);
    }
 
    public void onNeighborBlockChange(World world, int x, int y, int z, int changedId) {
    }
 
    public void onBlockPlace(World w, int x, int y, int z, LivingEntity living) {
    	Location loc = new Location(w, x, y-1, z);
    	SpoutBlock b = (SpoutBlock) w.getBlockAt(loc);
    	if(b.getType() != Material.GRASS && b.getType() != Material.DIRT && b.getType() == Material.SOIL) {
    		Location oloc = new Location(w,x,y,z);
    		SpoutBlock pb = (SpoutBlock) w.getBlockAt(oloc);
    		pb.setCustomBlock(null);
    		pb.setType(Material.AIR);
    		
    	}
    }
 
    public void onBlockDestroyed(World world, int x, int y, int z) {
    }
 
    public boolean onBlockInteract(World world, int x, int y, int z, SpoutPlayer player) {
        return true;
    }
 
    public void onEntityMoveAt(World world, int x, int y, int z, Entity entity) {
    }
 
    public void onBlockClicked(World world, int x, int y, int z, SpoutPlayer player) {
    }
 
    public boolean isProvidingPowerTo(World world, int x, int y, int z, BlockFace face) {
        return false;
    }
 
    public boolean isIndirectlyProvidingPowerTo(World world, int x, int y, int z, BlockFace face) {
        return false;
    }
    
}