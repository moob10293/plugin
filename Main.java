package me.moob.hardersurvival;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new EatingEvent(),this);//using the eat plugin
        getServer().getPluginManager().registerEvents(new MobDamageEvent(),this);//using the damgage plugin
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
