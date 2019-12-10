package me.Maximilian1021.sonstiges;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.Maximilian1021.LiropSystem.LiropSystem;

public class Beta implements CommandExecutor {

	public Beta(LiropSystem liropSystem) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
	      sender.sendMessage("§7§m                      §C§l Beta §7§m                     ");
	      sender.sendMessage("§6Commands:");
	      sender.sendMessage("§a/Elite, Titan, Legende, Ultimate");
	      sender.sendMessage("§a/VIP --> 1. Version von Vip");
	      sender.sendMessage("§a/VIP2 --> 2. Version von VIP ");
	      sender.sendMessage("§a/kopf, clearChat,");
	      sender.sendMessage("§a/welt --> Welten müssen mit /setwelt gesetzt werden");
	      sender.sendMessage("§a/beta --> COmmand wird wieder entfernt!");
	      sender.sendMessage("§aTeamChat mit @tc");
	      sender.sendMessage("§aDie Bauwetti Befehle kommen auch noch!");
	      sender.sendMessage("");
	      sender.sendMessage("§a");
	      sender.sendMessage("§c§lDas ist eine geupdatete version des Liropsystem Plugin und befindet sich noch in der Alpha!");
	      sender.sendMessage("§a");
	      sender.sendMessage("§a");
	      sender.sendMessage("§7§m                      §C§l Beta §7§m                     ");


		return false;
	}

}
