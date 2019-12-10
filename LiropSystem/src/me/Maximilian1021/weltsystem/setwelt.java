package me.Maximilian1021.weltsystem;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import me.Maximilian1021.LiropSystem.LiropSystem;;

public class setwelt implements CommandExecutor{

	private LiropSystem plugin;

	public setwelt(LiropSystem plugin) {
		this.plugin = plugin;
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) 
    {
		Player p = (Player) sender;		
		
		
	      if (!p.hasPermission("liropess.setworld")) {
	        p.sendMessage("§cDu hast keinen Zugriff auf diesen Befehl.");
	      }
	      if (p.hasPermission("liropess.setworld"))
	      {
	        if (args.length == 0)
	        {
	          p.sendMessage("§b/setworld §f<normal|game|freebuild|skyblock>");
	          p.sendMessage("§cBitte nicht unnötig die Spawns verstellen!");
	        }
	        if (args.length == 1)
	        {
	          if (args[0].equalsIgnoreCase("normal"))
	          {
	            p.sendMessage("§aDu hast den Weltenspawn geändert.");
	            FileConfiguration cfg = plugin.getConfig();
	            String n = p.getWorld().getName();
	            double x = p.getLocation().getX();
	            double y = p.getLocation().getY();
	            double z = p.getLocation().getZ();
	            double pitch = p.getLocation().getPitch();
	            double yaw = p.getLocation().getYaw();
	            cfg.set("spawns.normal.world", n);
	            cfg.set("spawns.normal.x", Double.valueOf(x));
	            cfg.set("spawns.normal.y", Double.valueOf(y));
	            cfg.set("spawns.normal.z", Double.valueOf(z));
	            cfg.set("spawns.normal.pitch", Double.valueOf(pitch));
	            cfg.set("spawns.normal.yaw", Double.valueOf(yaw));
	            plugin.saveConfig();
	            plugin.reloadConfig();
	          }
	          if (args[0].equalsIgnoreCase("game"))
	          {
	            p.sendMessage("§aDu hast den Weltenspawn von Game geändert.");
	            FileConfiguration cfg = plugin.getConfig();
	            String n = p.getWorld().getName();
	            double x = p.getLocation().getX();
	            double y = p.getLocation().getY();
	            double z = p.getLocation().getZ();
	            double pitch = p.getLocation().getPitch();
	            double yaw = p.getLocation().getYaw();
	            cfg.set("spawns.game.world", n);
	            cfg.set("spawns.game.x", Double.valueOf(x));
	            cfg.set("spawns.game.y", Double.valueOf(y));
	            cfg.set("spawns.game.z", Double.valueOf(z));
	            cfg.set("spawns.game.pitch", Double.valueOf(pitch));
	            cfg.set("spawns.game.yaw", Double.valueOf(yaw));
	            plugin.saveConfig();
	            plugin.reloadConfig();
	          }
	          if (args[0].equalsIgnoreCase("skyblock"))
	          {
	            p.sendMessage("§aDu hast den Weltenspawn von SkyBlock geändert.");
	            FileConfiguration cfg = plugin.getConfig();
	            String n = p.getWorld().getName();
	            double x = p.getLocation().getX();
	            double y = p.getLocation().getY();
	            double z = p.getLocation().getZ();
	            double pitch = p.getLocation().getPitch();
	            double yaw = p.getLocation().getYaw();
	            cfg.set("spawns.skyblock.world", n);
	            cfg.set("spawns.skyblock.x", Double.valueOf(x));
	            cfg.set("spawns.skyblock.y", Double.valueOf(y));
	            cfg.set("spawns.skyblock.z", Double.valueOf(z));
	            cfg.set("spawns.skyblock.pitch", Double.valueOf(pitch));
	            cfg.set("spawns.skyblock.yaw", Double.valueOf(yaw));
	            plugin.saveConfig();
	            plugin.reloadConfig();
	          }
	          if (args[0].equalsIgnoreCase("freebuild"))
	          {
	            p.sendMessage("§aDu hast den Weltenspawn von Freebuild geändert.");
	            FileConfiguration cfg = plugin.getConfig();
	            String n = p.getWorld().getName();
	            double x = p.getLocation().getX();
	            double y = p.getLocation().getY();
	            double z = p.getLocation().getZ();
	            double pitch = p.getLocation().getPitch();
	            double yaw = p.getLocation().getYaw();
	            cfg.set("spawns.freebuild.world", n);
	            cfg.set("spawns.freebuild.x", Double.valueOf(x));
	            cfg.set("spawns.freebuild.y", Double.valueOf(y));
	            cfg.set("spawns.freebuild.z", Double.valueOf(z));
	            cfg.set("spawns.freebuild.pitch", Double.valueOf(pitch));
	            cfg.set("spawns.freebuild.yaw", Double.valueOf(yaw));
	            plugin.saveConfig();
	            plugin.reloadConfig();
	          }
	        }
	      }
		return false;
	    }


		
	}


