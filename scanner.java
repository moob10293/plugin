package plugin.somefile.main;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ItemStack;
import org.bukkit.Material;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
public class eventhappen impements Listener{
    @EventHandler
    public void wheneat(PlayerItemConsumeEvent event){
        ItemStack thingeaten = event.getItem();
        if (thingeaten.getType()==Material.ROTTEN_FLESH){
            event.setCancelled(true);
            thingeaten.setType(Material.AIR);
            Player person=event.getPlayer();
            PotionEffect effect=new PotionEffect(PotionEffectType.POISON,10,2);
            person.addPotionEffect(effect);


        }
    }
    
}