 package me.Maximilian1021.sonstiges;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import me.Maximilian1021.LiropSystem.LiropSystem;

public class Events implements Listener 
{
	
	private LiropSystem plugin;


	public Events(LiropSystem plugin) {
	this.plugin = plugin;
	}
	
	
	  @EventHandler
	  public void onKlick(InventoryClickEvent e)
	  {
	  		  
	    Player p = (Player)e.getWhoClicked();
	    if (e.getInventory().getName().equalsIgnoreCase("Wähle eine Welt aus..."))
	    {
	      e.setCancelled(true);
	      if (e.getCurrentItem().getType() == Material.ENDER_PORTAL) {
	        p.sendMessage("§4Wähle eine Welt aus...");
	      }
	      if (e.getCurrentItem().getType() == Material.FENCE)
	      {
	        p.sendMessage("§aDu wurdest in die Normale Welt Teleportiert.");
	        FileConfiguration cfg = plugin.getConfig();
	        String n = cfg.getString("spawns.normal.world");
	        double x = cfg.getDouble("spawns.normal.x");
	        double y = cfg.getDouble("spawns.normal.y");
	        double z = cfg.getDouble("spawns.normal.z");
	        double pitch = cfg.getDouble("spawns.normal.pitch");
	        double yaw = cfg.getDouble("spawns.normal.yaw");
	        Location loc = new Location(Bukkit.getWorld(n), x, y, z);
	        loc.setYaw((float)yaw);
	        loc.setPitch((float)pitch);
	        p.teleport(loc);
	        p.closeInventory();
	      }
	      if (e.getCurrentItem().getType() == Material.WOOL)
	      {
	        p.sendMessage("§aComing soon.");
	        FileConfiguration cfg = plugin.getConfig();
	        String n = cfg.getString("spawns.game.world");
	        double x = cfg.getDouble("spawns.game.x");
	        double y = cfg.getDouble("spawns.game.y");
	        double z = cfg.getDouble("spawns.game.z");
	        double pitch = cfg.getDouble("spawns.game.pitch");
	        double yaw = cfg.getDouble("spawns.game.yaw");
	        Location loc = new Location(Bukkit.getWorld(n), x, y, z);
	        loc.setYaw((float)yaw);
	        loc.setPitch((float)pitch);
	        p.teleport(loc);
	        p.closeInventory();
	      }
	      if (e.getCurrentItem().getType() == Material.GRASS)
	      {
	        p.sendMessage("§aDu wurdest in die SkyBlock Welt Teleportiert.");
	        FileConfiguration cfg = plugin.getConfig();
	        String n = cfg.getString("spawns.skyblock.world");
	        double x = cfg.getDouble("spawns.skyblock.x");
	        double y = cfg.getDouble("spawns.skyblock.y");
	        double z = cfg.getDouble("spawns.skyblock.z");
	        double pitch = cfg.getDouble("spawns.skyblock.pitch");
	        double yaw = cfg.getDouble("spawns.skyblock.yaw");
	        Location loc = new Location(Bukkit.getWorld(n), x, y, z);
	        loc.setYaw((float)yaw);
	        loc.setPitch((float)pitch);
	        p.teleport(loc);
	    	p.closeInventory();
	      }
	      if (e.getCurrentItem().getType() == Material.STONE)
	      {
	        p.sendMessage("§aDu wurdest in die Freebuild Welt Teleportiert.");
	        FileConfiguration cfg = plugin.getConfig();
	        String n = cfg.getString("spawns.freebuild.world");
	        double x = cfg.getDouble("spawns.freebuild.x");
	        double y = cfg.getDouble("spawns.freebuild.y");
	        double z = cfg.getDouble("spawns.freebuild.z");
	        double pitch = cfg.getDouble("spawns.freebuild.pitch");
	        double yaw = cfg.getDouble("spawns.freebuild.yaw");
	        Location loc = new Location(Bukkit.getWorld(n), x, y, z);
	        loc.setYaw((float)yaw);
	        loc.setPitch((float)pitch);
	        p.teleport(loc);
	        p.closeInventory();
	      }
	    }
	  }


	public FileConfiguration getConfig() {
		return null;
	} 
	
	

}
