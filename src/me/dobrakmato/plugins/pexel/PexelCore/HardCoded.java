package me.dobrakmato.plugins.pexel.PexelCore;

import me.dobrakmato.plugins.pexel.ColorWar.ColorWarMinigame;
import me.dobrakmato.plugins.pexel.PexelNetworking.Server;
import me.dobrakmato.plugins.pexel.TntTag.TntTagMinigame;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.util.Vector;

/**
 * Class where is all hard coded stuff stored.
 * 
 * @author Mato Kormuth
 * 
 */
public class HardCoded
{
	/**
	 * Main method called from Plugin.onEnable()
	 */
	public static final void main()
	{
		//Initialize tnt tag minigame
		new TntTagMinigame();
		//Initialize color war mingiame
		new ColorWarMinigame();
		
		//Initialize main gates
		StorageEngine.addGate("Lsurvival",
				new TeleportGate(new Region(new Vector(-7, 50, 258),
						new Vector(-9, 54, 264), Bukkit.getWorld("world")),
						new TeleportAction(null, new Server(null, "survival",
								"survival"))));
		
		StorageEngine.addGate("Lstarving",
				new TeleportGate(new Region(new Vector(26, 50, 266),
						new Vector(28, 55, 260), Bukkit.getWorld("world")),
						new TeleportAction(null, new Server(null, "starving",
								"starving"))));
		
		StorageEngine.addGate(
				"Lminigame",
				new TeleportGate(new Region(new Vector(7, 50, 280), new Vector(
						13, 55, 282), Bukkit.getWorld("world")),
						new TeleportAction(
								new Location(Bukkit.getWorld("world"), 1972.5,
										147.5, 2492.5), Server.THIS_SERVER)));
	}
}
