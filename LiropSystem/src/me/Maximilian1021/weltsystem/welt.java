package me.Maximilian1021.weltsystem;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.Maximilian1021.LiropSystem.LiropSystem;
import net.minecraft.server.v1_11_R1.CommandExecute;

public class welt extends CommandExecute implements CommandExecutor {
	 
	public welt(LiropSystem liropSystem) {
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
		Player p = (Player) sender;
		
		
	    ItemStack welt1 = new ItemStack(Material.FENCE);
	    ItemMeta standart = welt1.getItemMeta();
	    standart.setDisplayName("§c§lPlot Welten");
	    ArrayList<String> Text = new ArrayList<String>();
	    Text.add("§7Lass deiner Creativit§t");
	    Text.add("§7hier freien Lauf.");
	    Text.add("§bKlicke um zu Teleportieren.");
	    standart.setLore(Text);
	    welt1.setItemMeta(standart);
	    
	    ItemStack welt2 = new ItemStack(Material.WOOL);
	    ItemMeta standart2 = welt2.getItemMeta();
	    standart2.setDisplayName("§c§lLirop-Games");
	    ArrayList<String> Text2 = new ArrayList<String>();
	    Text2.add("§7Lass deiner Spielelust");
	    Text2.add("§7hier freien lauf.");
	    Text2.add("§bKlicke um zu Teleportieren.");
	    standart2.setLore(Text2);
	    welt2.setItemMeta(standart2);
	    
	    ItemStack welt3 = new ItemStack(Material.STONE);
	    ItemMeta standart3 = welt3.getItemMeta();
	    standart3.setDisplayName("§c§lCityBuild Welt");
	    ArrayList<String> Text3 = new ArrayList<String>();
	    Text3.add("§7Werde Teil der Lirop-City");
	    Text3.add("§7oder Gr§nde deine Eigene.");
	    Text3.add("§bKlicke um zu Teleportieren.");
	    standart3.setLore(Text3);
	    welt3.setItemMeta(standart3);
	    
	    ItemStack welt5 = new ItemStack(Material.GRASS);
	    ItemMeta standart5 = welt5.getItemMeta();
	    standart5.setDisplayName("§c§lSkyblock Welt");
	    ArrayList<String> Text5 = new ArrayList<String>();
	    Text5.add("§7180x180 Gebiet");
	    Text5.add("§7erhalte kostenlos eine Insel");
	    Text5.add("§bKlicke um zu Teleportieren.");
	    standart5.setLore(Text5);
	    welt5.setItemMeta(standart5);
	    
	    ItemStack portal = new ItemStack(Material.ENDER_PORTAL);
	    ItemMeta standart4 = portal.getItemMeta();
	    standart4.setDisplayName(" ");
	    ArrayList<String> Text4 = new ArrayList<String>();
	    Text4.add("§8Suche eine Welt aus.");
	    Text4.add(" ");
	    standart4.setLore(Text4);
	    portal.setItemMeta(standart4);
	    
	    Inventory inv2 = p.getServer().createInventory(null, 27, "Wähle eine Welt aus...");
	    p.openInventory(inv2);
	    inv2.clear();
	    inv2.setItem(11, portal);
	    inv2.setItem(13, portal);
	    inv2.setItem(15, portal);
	    inv2.setItem(0, portal);
	    inv2.setItem(1, portal);
	    inv2.setItem(2, portal);
	    inv2.setItem(3, portal);
	    inv2.setItem(4, portal);
	    inv2.setItem(5, portal);
	    inv2.setItem(6, portal);
	    inv2.setItem(7, portal);
	    inv2.setItem(8, portal);
	    inv2.setItem(9, portal);
	    inv2.setItem(10, welt1);
	    inv2.setItem(12, welt3);
	    inv2.setItem(14, welt5);
	    inv2.setItem(16, welt2);
	    inv2.setItem(17, portal);
	    inv2.setItem(18, portal);
	    inv2.setItem(19, portal);
	    inv2.setItem(20, portal);
	    inv2.setItem(21, portal);
	    inv2.setItem(22, portal);
	    inv2.setItem(23, portal);
	    inv2.setItem(24, portal);
	    inv2.setItem(25, portal);
	    inv2.setItem(26, portal);
		return false;
	  }
	
}

