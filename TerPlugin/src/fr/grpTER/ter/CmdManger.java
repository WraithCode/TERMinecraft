package fr.grpTER.ter;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CmdManger implements CommandExecutor {
	
   @Override
   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
       if(sender instanceof Player){
           Player p = (Player) sender;
           Inventory inv = p.getInventory();
           ItemStack steak = new ItemStack(Material.COOKED_BEEF, 32); //Item + Nombre de l'item
           ItemMeta metasteak = steak.getItemMeta(); //R�cup�rer la meta de l'item afin de personnaliser l'item !
           metasteak.setDisplayName("�cSteak�eFrites"); //� est le signe des codes couleurs minecraft. Chaque lettre/chiffre est associ�e � une couleur..
           steak.setItemMeta(metasteak); //D�finir une bonne fois pour toute la meta de nos magnifiques steaks-frites.
           p.sendMessage("�aVoici ton bon steak-frites !");
           inv.addItem(steak); //ajouter les steaks � l'inventaire du joueur.
       }
       return true;
   }

}


