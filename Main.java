package me.moob.hardersurvival;

import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.ArrayList;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        ArrayList<Location> list_of_player_blocks = new ArrayList<>();
        getServer().getPluginManager().registerEvents(new FoodEvent(),this);//using the plugins
        getServer().getPluginManager().registerEvents(new MobDamageEvent(),this);
        getServer().getPluginManager().registerEvents(new MobSpawnEvent(),this);
        getServer().getPluginManager().registerEvents(new PlayerPlaceEvent(list_of_player_blocks),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
