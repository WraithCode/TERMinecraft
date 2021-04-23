package fr.grpTER.ter;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("Test de spigot activé");
		this.getCommand("manger").setExecutor(new CmdManger());
		this.getCommand("boire").setExecutor(new CmdBoire());
		}

	@Override
	public void onDisable() {
		System.out.println("Oh non le serveur s'éteiiinnnnt....");
		}

}
