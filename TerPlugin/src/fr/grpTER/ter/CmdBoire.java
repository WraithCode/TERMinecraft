package fr.grpTER.ter;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CmdBoire implements CommandExecutor {

	@Override
	   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	       if(sender instanceof Player){
	           Player p = (Player) sender;
	           Inventory inv = p.getInventory();
	           ItemStack coca = new ItemStack(Material.POTION, 1); //Item + Nombre de l'item
	           ItemMeta metacoca = coca.getItemMeta(); //Récupérer la meta de l'item afin de personnaliser l'item !
	           metacoca.setDisplayName("§cCoca§eCola"); //§ est le signe des codes couleurs minecraft. Chaque lettre/chiffre est associée à une couleur..
	           coca.setItemMeta(metacoca); //Définir une bonne fois pour toute la meta de nos magnifiques steaks-frites.
	           p.sendMessage("§aVoici ton délicieux coca cola !");
	           inv.addItem(coca); //ajouter les steaks à l'inventaire du joueur.
	       }
	       return true;
	   }

}
