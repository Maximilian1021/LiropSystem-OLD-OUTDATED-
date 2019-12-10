package me.Maximilian1021.Ränge;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Maximilian1021.LiropSystem.LiropSystem;

public class VIP implements CommandExecutor 
{

	public VIP(LiropSystem liropSystem) {
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
		   Player spieler = (Player) sender;

		   sender.sendMessage("§7§m                      §C§l Lirop Spenden §7§m                     ");
		   sender.sendMessage("§5Danke für dein Interesse an einer Spende.");
		   sender.sendMessage("");
		   sender.sendMessage("§3Elite - §5 10 Euro");
		   sender.sendMessage("§3Titan - §5 15 Euro");														//Lirop Spenden Command
		   sender.sendMessage("§3Legende - §5 30 Euro");
		   sender.sendMessage("§3Ultimate -§5 50 Euro");
		   sender.sendMessage("");
		   sender.sendMessage("§5Spenden kannst du über PayPal und Paysafe!");
		   sender.sendMessage("§5 Gehe dazu auf §e§lLirop.net/spenden !");
		   sender.sendMessage("§7§m                      §C§l Lirop Spenden §7§m                     ");
		   spieler.playSound(spieler.getLocation(), Sound.ENTITY_ARROW_HIT_PLAYER, 0.5f, 1.0f);
		   return false;
	}

}
