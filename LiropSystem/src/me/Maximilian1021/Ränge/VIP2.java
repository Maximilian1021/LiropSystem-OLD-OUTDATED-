package me.Maximilian1021.Ränge;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.Maximilian1021.LiropSystem.LiropSystem;

public class VIP2 implements CommandExecutor 
{

	public VIP2(LiropSystem liropSystem) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
		Player p = (Player) sender;
			{
			Inventory Rang = Bukkit.createInventory(null, 27, "§cWähle einen Rang");
			
			ItemStack Elite = new ItemStack(Material.LEATHER_CHESTPLATE, 1, (short) 0);
			ItemMeta EliteM = Elite.getItemMeta();
			EliteM.setDisplayName("§bElite");
			Elite.setItemMeta(EliteM);
			
			ItemStack Titan = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1, (short) 0);
			ItemMeta TitanM = Titan.getItemMeta();
			TitanM.setDisplayName("§bTitan");
			Titan.setItemMeta(TitanM);
			
			ItemStack Legende = new ItemStack(Material.IRON_CHESTPLATE, 1, (short) 0);
			ItemMeta LegendeM = Legende.getItemMeta();
			LegendeM.setDisplayName("§bLegende");
			Legende.setItemMeta(LegendeM);
			
			ItemStack Ultimate = new ItemStack(Material.DIAMOND_CHESTPLATE, 1, (short) 0);
			ItemMeta UltimateM = Ultimate.getItemMeta();
			UltimateM.setDisplayName("§bUltimate");
			Ultimate.setItemMeta(UltimateM);
			
			Rang.setItem(10, Elite);
			Rang.setItem(12, Titan);
			Rang.setItem(14, Legende);
			Rang.setItem(16, Ultimate);
			p.openInventory(Rang);
				}
		return false;
	}
}
