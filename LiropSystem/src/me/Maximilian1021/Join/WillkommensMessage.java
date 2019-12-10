package me.Maximilian1021.Join;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class WillkommensMessage implements Listener 
{
@EventHandler
public void onJoin (PlayerJoinEvent e)
{
	Player p = e.getPlayer();
	
	p.sendMessage("§b-------------------------------------");
	p.sendMessage("§b|             §l§nWillkommen auf Lirop§f            §b|");
	p.sendMessage("§b|                                                       |");
	p.sendMessage("§b|        Website:        http://lirop.net           |");
	p.sendMessage("§b|        TeamSpeak3:  gm1block.de:6321         |");
	p.sendMessage("§b--------------------------------------");
}
}
