package com.ter.modter.init;

import java.util.ArrayList;
import java.util.List;

import com.ter.modter.objects.items.ItemBase;

import net.minecraft.item.Item;

public class ItemInit //referencement de tous les nouveaux items
{
	public static List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final Item TER_INGOT = new ItemBase("ter_ingot");
}
