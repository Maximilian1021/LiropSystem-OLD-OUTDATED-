package me.Maximilian1021.Ränge;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Maximilian1021.LiropSystem.LiropSystem;

public class Legende implements CommandExecutor
{

	public Legende(LiropSystem liropSystem) {
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
	     Player spieler = (Player) sender;

	     sender.sendMessage("§7§m                      §C§l Legende Rang §7§m                     ");;
	     sender.sendMessage("§9Kosten §3 --> §a30 Euro");
	     sender.sendMessage("");
	     sender.sendMessage("§9Hier Kaufbar §3 --> §ahttp://lirop.net/spenden");
	     sender.sendMessage("§9Zahlbar via §3--> §aPayPal & PaySafeCard");									//Legende Vorteile
	     sender.sendMessage("");
	     sender.sendMessage("§9Rechte:");
	     sender.sendMessage("§a/nick, Farbige Nicks, Vollen Server joinen, Farbige Schrift");
	     sender.sendMessage("§aPermanentes Redstone, WorldEditLimit von 30.000 Blöcken");
	  // sender.sendMessage("");
	     sender.sendMessage("§7§m                      §C§l Legende Rang §7§m                     ");
	     spieler.playSound(spieler.getLocation(), Sound.ENTITY_ARROW_HIT_PLAYER, 0.5f, 1.0f);
	     return false;
	}


}
