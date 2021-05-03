package plugin.somefile.main;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin{
    @Override
    public void onEnable(){
        System.out.printf("Hello, world!");
    }
    @Override
    public void onDisable(){
        System.out.printf("Hello, world!");
    }
}
