package me.Maximilian1021.LiropSystem;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import me.Maximilian1021.Join.Joinmessage;
import me.Maximilian1021.Join.LeaveMessage;
import me.Maximilian1021.Join.WillkommensMessage;
import me.Maximilian1021.Ränge.Elite;
import me.Maximilian1021.Ränge.Legende;
import me.Maximilian1021.Ränge.Titan;
import me.Maximilian1021.Ränge.Ultimate;
import me.Maximilian1021.Ränge.VIP;
import me.Maximilian1021.Ränge.VIP2;
import me.Maximilian1021.sonstiges.Beta;
import me.Maximilian1021.sonstiges.ClearChat;
import me.Maximilian1021.sonstiges.Events;
import me.Maximilian1021.sonstiges.TeamChat;
import me.Maximilian1021.sonstiges.VIP2Events;
import me.Maximilian1021.sonstiges.Vote;
import me.Maximilian1021.sonstiges.book;
import me.Maximilian1021.sonstiges.kopf;
import me.Maximilian1021.weltsystem.setwelt;
import me.Maximilian1021.weltsystem.welt;

public class LiropSystem extends JavaPlugin implements Listener
{
	
	public String prefix = "§5Lirop §f| ";
 
public void onEnable()
{
 System.out.println("Liropsystem geladen!");
 getServer().getPluginManager().registerEvents(this, this);
 
 
 initConfig();
 registerCommands();
 registerEvents();
 
 
}

public void initConfig()
{
 getConfig().options().header("Bitte keine Cordinaten verändern. Bitte den Befehl /setwelt nutzen");
 reloadConfig();
 getConfig().addDefault("Datum", "Hier kommt ein Datum hin");
 getConfig().options().copyDefaults(true);
 saveConfig();
}

public void onDisable()
{
 
System.out.println("Liropsystem entladen");

}

public void registerCommands()
{
 getCommand("VIP").setExecutor(new VIP(this));
 getCommand("Elite").setExecutor(new Elite(this)); //Elite Command
 getCommand("Titan").setExecutor(new Titan(this)); //Titan Command
 getCommand("Legende").setExecutor(new Legende(this)); //Legenden Command
 getCommand("Ultimate").setExecutor(new Ultimate(this)); // Ultimate Command
 getCommand("Kopf").setExecutor(new kopf(this));   //Kopf Command
 getCommand("welt").setExecutor(new welt(this)); //Welt Command
 getCommand("setwelt").setExecutor(new setwelt(this)); //der Setwelt Command
 getCommand("VIP2").setExecutor(new VIP2(this)); // Version2 des VIPS
 getCommand("ClearChat").setExecutor(new ClearChat(this)); //ClearChat
 getCommand("beta").setExecutor(new Beta(this));
 getCommand("Vote").setExecutor(new Vote(this));
 getCommand("book").setExecutor(new book(this));
}

public void registerEvents()
{
 Bukkit.getPluginManager().registerEvents(new TeamChat(this), this);
 Bukkit.getPluginManager().registerEvents(new Events(this), this);
 Bukkit.getPluginManager().registerEvents(new VIP2Events(this), this);
 Bukkit.getPluginManager().registerEvents(new Joinmessage(), this);
 Bukkit.getPluginManager().registerEvents(new LeaveMessage(), this);
 Bukkit.getPluginManager().registerEvents(new WillkommensMessage(), this);
}

//public FileConfiguration getConfig() {
// return null;
//}

//public void SaveConfig()
//{
// 
//}

}