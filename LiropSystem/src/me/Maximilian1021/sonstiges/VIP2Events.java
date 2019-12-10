package me.Maximilian1021.sonstiges;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import me.Maximilian1021.LiropSystem.LiropSystem;

public class VIP2Events implements Listener
{
	public VIP2Events(LiropSystem liropSystem) {
		// TODO Auto-generated constructor stub
	}

	@EventHandler
	public void adv(InventoryClickEvent e)
	{
	    Player p = (Player)e.getWhoClicked();
	    if (e.getInventory().getName().equalsIgnoreCase("§cWähle einen Rang"))
	    {
	      e.setCancelled(true);
	      if (e.getCurrentItem().getType() == Material.ENDER_PORTAL) {
	        p.sendMessage("§4Wähle eine Welt aus...");
	      }
	      if (e.getCurrentItem().getType() == Material.LEATHER_CHESTPLATE)
	      {
	    	p.chat("/elite");
	        p.closeInventory();
	      }
	      if (e.getCurrentItem().getType() == Material.CHAINMAIL_CHESTPLATE)
	      {
	        p.chat("/titan");
	        p.closeInventory();
	      }
	      if (e.getCurrentItem().getType() == Material.IRON_CHESTPLATE)
	     {
	        p.chat("/Legende");
	        p.closeInventory();
	      }
	      if (e.getCurrentItem().getType() == Material.DIAMOND_CHESTPLATE)
	      {
	        p.chat("/Ultimate");
	        p.closeInventory();
	      }
	    }
	  }
}
