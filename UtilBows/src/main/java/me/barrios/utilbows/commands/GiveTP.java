package me.barrios.utilbows.commands;

import me.barrios.utilbows.util.BowUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class GiveTP implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {


        if (sender instanceof Player p ) {

            if (p.hasPermission("UtilBows.givebow")) {


                //giving to self
                if (args.length == 0) {
                    ItemStack bow = BowUtils.createTPBow();
                    p.getInventory().addItem(bow);
                    p.getInventory().addItem(new ItemStack(Material.ARROW));

                    p.sendMessage(ChatColor.GREEN + "Given Tp bow");


                }
                else {
                    Player target = Bukkit.getPlayerExact(args[0]);

                    if (target == null) {
                        p.sendMessage(ChatColor.RED + "No player found");
                        return true;
                    }

                    ItemStack bow = BowUtils.createTPBow();
                    target.getInventory().addItem(bow);
                    target.getInventory().addItem(new ItemStack(Material.ARROW));

                    target.sendMessage(ChatColor.GREEN + "Given Tp bow");

                }
            }



        }



        return true;
    }
}
