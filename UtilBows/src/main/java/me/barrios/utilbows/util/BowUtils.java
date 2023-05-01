package me.barrios.utilbows.util;


import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

// create bows
public class BowUtils {

    public static ItemStack createTPBow() {

        ItemStack bow = new ItemStack(Material.BOW, 1);
        ItemMeta bowMeta = bow.getItemMeta();
        bowMeta.setDisplayName(ChatColor.AQUA + "Teleport Bow");
        List<String> lore = new ArrayList<>();
        lore.add("fire your arrow");
        lore.add("and go anywhere");
        bowMeta.setLore(lore);
        bowMeta.addEnchant(Enchantment.ARROW_INFINITE, 1,false);

        bow.setItemMeta(bowMeta);

        return bow;

    }
}
