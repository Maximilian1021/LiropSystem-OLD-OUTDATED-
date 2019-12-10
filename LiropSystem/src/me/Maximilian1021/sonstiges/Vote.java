package me.Maximilian1021.sonstiges;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.Maximilian1021.LiropSystem.LiropSystem;

public class Vote implements CommandExecutor
{

	public Vote(LiropSystem liropSystem) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
	{
		sender.sendMessage("");
		sender.sendMessage("§6Vote auf §cvote.lirop.de §6um Worldedit und Redstone freizuschalten!");
		sender.sendMessage("");
		return false;
	}

}
