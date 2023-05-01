package me.barrios.utilbows;

import me.barrios.utilbows.commands.GiveTP;
import me.barrios.utilbows.listeners.TpListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class UtilBows extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
this.getCommand("TpBow").setExecutor(new GiveTP());
getServer().getPluginManager().registerEvents(new TpListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
