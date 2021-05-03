package plugin.somefile.main;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
//In this version, this plugin will dectect when damage is dealt by an entity(hostile mob) and add some damage to it
public class mobdamage impements Listener{
    @EventHandler
    public void whenDamage(EntityDamageByEntityEvent event){
        Entity attacker=event.getDamager()
        if (attacker.getType()!=EntityType.PLAYER){//double damage for every entity except for the player
            if (event.getCause()==DamageCause.ENTITY_ATTACK){//I know the event is an EntityDamageByEntityEvent, but just in case
                event.setDamage(event.getDamage()*2)
            }
        }
    }
}