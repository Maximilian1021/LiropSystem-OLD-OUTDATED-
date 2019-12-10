package me.Maximilian1021.sonstiges;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

import me.Maximilian1021.LiropSystem.LiropSystem;

public class book implements CommandExecutor {

	public book(LiropSystem liropSystem) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
		Player p = (Player) sender;
		
		if(args.length == 0)
		{
		ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
		BookMeta meta = (BookMeta) book.getItemMeta();
		meta.setAuthor("Irgend so n bekloppter Typ");
		meta.setDisplayName("Irgendso ein komischens Buch");
		meta.addPage("            §bWillkommen in diesen Buch \n Ich sehe du liest das gerade, das \n freut mich");
		meta.addPage("Test2");
		meta.addPage("Test3");
		meta.addPage("Test4");
		meta.addPage("Test5");
		meta.addPage("Test6");
		meta.addPage("ENDE");
		book.setItemMeta(meta);
		p.getInventory().addItem(book);
		} else {
			p.sendMessage("§4Fehler §f| §cFalsche Eingabe!");
		}
		return false;
	}

}
