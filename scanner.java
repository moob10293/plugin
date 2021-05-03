package plugin.somefile.main;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ItemStack;
import org.bukkit.Material;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

//this class takes care of the things regarding food(poisonous rotten flesh and less hunger points restored)

public class Eating impements Listener{
    @EventHandler
    public void whenEat(PlayerItemConsumeEvent event){
        ItemStack thingeaten = event.getItem();
        Player person=event.getPlayer();
        if (thingeaten.getType()==Material.ROTTEN_FLESH){//rotten flesh
            event.setCancelled(true);//no, I don't want to add hunger on top of hunger
            thingeaten.setType(Material.AIR);//gets rid of the food that you ate(possible bug, gets rid of all the food in the stack)
            PotionEffect owch=new PotionEffect(PotionEffectType.POISON,10,2);//initalises the effects to give
            PotionEffect hungry=new PotionEffect(PotionEffectType.HUNGER,30,1);
            person.addPotionEffect(owch);//applies the effects
            person.addPotionEffect(hungry);
            person.setFoodLevel(person.getFoodLevel()+4);//applies the hunger rotten flesh restores(no change here)
        }
        else if (thingeaten.getType()==Material.CHICKEN){
            event.setCancelled(true);
            person.setFoodLevel(person.getFoodLevel()+2);//no change here either
            thingeaten.setType(Material.AIR);
            PotionEffect hungry=new PotionEffect(PotionEffectType.HUNGER,30,1);//the chance used to be 30%, now it's 100%
            person.addPotionEffect(hungry);
        }
        else {
            setFoodLevel(person.getFoodLevel()-1)
        }
        }
    }
    
}