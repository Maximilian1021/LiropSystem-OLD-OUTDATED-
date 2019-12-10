package me.Maximilian1021.Join;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class LeaveMessage implements Listener
{
@EventHandler
public void onleave(PlayerQuitEvent e)
{
	Player p = e.getPlayer();
	e.setQuitMessage("§c-§9 " + p.getName());
}
}
