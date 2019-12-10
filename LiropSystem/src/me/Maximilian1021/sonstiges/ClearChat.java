package me.Maximilian1021.sonstiges;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import me.Maximilian1021.LiropSystem.LiropSystem;

public class ClearChat implements CommandExecutor
{
	public String prefix = "§5Lirop §f| ";
	private LiropSystem plugin;

	public ClearChat(LiropSystem plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		for (int i = 0; i < 100; i++)  {
			for (Player p : plugin.getServer().getOnlinePlayers())	{
				p.sendMessage("");
			}
		}
		sender.sendMessage("§3Du hast den Chat gecleart!");																
		Bukkit.broadcastMessage(prefix + "§3Der Chat wurde gelöscht von §c§l" + sender.getName());
		return true;
	}

}
