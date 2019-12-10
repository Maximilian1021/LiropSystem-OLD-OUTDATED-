package me.Maximilian1021.Join;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Joinmessage implements Listener
{
@EventHandler 
public void onJoin (PlayerJoinEvent e)
{
	Player p = e.getPlayer();
if(p.hasPlayedBefore()){
	e.setJoinMessage("§2+§9 " + p.getName());
}else{
	e.setJoinMessage("§dWillkommen §5" + p.getName() + " §dauf Lirop.");
}
}
}
