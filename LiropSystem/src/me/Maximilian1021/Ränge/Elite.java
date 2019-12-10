package me.Maximilian1021.Ränge;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Maximilian1021.LiropSystem.LiropSystem;

public class Elite implements CommandExecutor {

	public Elite(LiropSystem liropSystem) {
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
	     Player spieler = (Player) sender;

	     sender.sendMessage("§7§m                      §C§l Elite Rang §7§m                     ");;
	     sender.sendMessage("§9Kosten §3 --> §a10 Euro");
	     sender.sendMessage("");
	     sender.sendMessage("§9Hier Kaufbar §3 --> §ahttp://lirop.net/spenden");
	     sender.sendMessage("§9Zahlbar via §3--> §aPayPal & PaySafeCard");									//Elite Vorteile
	     sender.sendMessage("");
	     sender.sendMessage("§9Rechte:");
	     sender.sendMessage("§a/hat,/nick,/tp,Vollen Server joinen, Farbige Schrift");
	     sender.sendMessage("§aPermanentes Redstone, WorldEditLimit von 10.000 Blöcken");
	  // sender.sendMessage("");
	     sender.sendMessage("§7§m                      §C§l Elite Rang §7§m                     ");
	     spieler.playSound(spieler.getLocation(), Sound.ENTITY_ARROW_HIT_PLAYER, 0.5f, 1.0f);
	     return false;
	}

}
