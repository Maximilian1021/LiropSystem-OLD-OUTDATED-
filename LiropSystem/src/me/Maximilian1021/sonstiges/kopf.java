package me.Maximilian1021.sonstiges;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import me.Maximilian1021.LiropSystem.LiropSystem;


public class kopf implements CommandExecutor 

{
	public ConsoleCommandSender console = Bukkit.getConsoleSender();
	public kopf(LiropSystem liropSystem) {
		
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
		
		if(!(sender instanceof Player)){
			sender.sendMessage("§4Fehler §f| Nur Spieler!");
			return false;
		}
		
		Player player = (Player) sender;
		int argumentLength = args.length;
		
		if(argumentLength > 1){
			player.sendMessage("§4Fehler §f| §c /kopf <Name>");
			return false;
		}
		
		String playerName = args.length == 0 ? player.getName() : args[0];
		
		ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (short)3);
		SkullMeta meta = (SkullMeta) skull.getItemMeta();
		meta.setOwner(playerName);
		skull.setItemMeta(meta);
		
		player.getInventory().addItem(skull);
		player.sendMessage("§dDu hast den Kopf von §5" +playerName + " §derhalten.");
		return false;
	   }
}
