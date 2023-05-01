package me.barrios.utilbows.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class TpListener implements Listener {
    @EventHandler
    public void onArrowLand(ProjectileHitEvent e) {



            //check if shot by tpbow

            if (e.getEntity().getShooter() instanceof Player p) {

                ItemStack itemInMainHand = p.getInventory().getItemInMainHand();

                if (itemInMainHand.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.AQUA + "Teleport Bow")) {

                    Location location = e.getEntity().getLocation();

                    p.teleport(location);
                    e.getEntity().remove();
                }

            }



    }
}
