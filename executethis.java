package plugin.somefile.main;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin{//
    @Override
    public void onEnable(){
        getServer().getPluginManager().registerEvents(new Eating(),this);//using the eat plugin
        getServer().getPluginManager().registerEvents(new whenDamage(),this);//using the damgage plugin
    }
    @Override
    public void onDisable(){

    }
}
