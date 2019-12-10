package me.Maximilian1021.sonstiges;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import me.Maximilian1021.LiropSystem.LiropSystem;

public class TeamChat implements Listener
{

	public TeamChat(LiropSystem liropSystem) {
	}

	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e)
	{
		  Player p = e.getPlayer();
	  if ((p.hasPermission("Lirop.Teamchat")) && 
	    (e.getMessage().startsWith("@tc")))
	  {
	    for (Player a : Bukkit.getOnlinePlayers())
	    {
	      if (a.hasPermission("Lirop.Teamchat")) {
	        a.sendMessage("§aTC §f| §6" + p.getName() + " §f| §c" + e.getMessage().replaceAll("@tc", ""));
	      }
	      if (!a.hasPermission("Lirop.Teamchat")) {
	        e.setCancelled(true);
	      }
	      e.setCancelled(true);
	    }
	  }
	  else if (e.getMessage().startsWith("@tc"))
	  {
	    p.sendMessage("§dLiropSystem §f| §cComputer sagt §4NEIN!!");
	    e.setCancelled(true);
	  }
	}
	
}
