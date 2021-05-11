package me.moob.hardersurvival;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.*;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.EventHandler;

//this class handles things related to damage.
//this class deals with spawning skeletons/spiders in response to players attacking from 3 blocks up,
//and making mobs do double damage

public class MobDamageEvent implements Listener {

    @EventHandler
    public void whenDamage (EntityDamageByEntityEvent event) {

        Entity attacker = event.getDamager() ;
        Entity defender = event.getEntity() ;
        World mob_world = defender.getWorld();
        Settings settings = new Settings();
        EntityType attacker_type = attacker.getType();
        EntityType defender_type = defender.getType();

        if (attacker instanceof Monster && attacker_type != EntityType.PLAYER) {//double damage for every entity except for the player
            event.setDamage(event.getDamage() * settings.damage_times) ;
        }

        if (attacker_type == EntityType.PLAYER && defender_type != EntityType.PLAYER
                && !(defender instanceof Skeleton) && !(defender instanceof Spider)
                && settings.getSummon_reinforcements()//if the entity isn't able to attack pillar players on it's own, 1/5 chance,
                && defender.getLocation().getChunk().getEntities().length <= settings.spawn_limit){//and amount of entities in chunk less than 50

            Location defender_location = defender.getLocation();

            if ((attacker.getLocation().getY() - defender_location.getY()) >= settings.attack_cheat_height) {
                Spawn spawn = new Spawn();
                if (settings.getReinforcement_is_a_skeleton()) {
                    spawn.spawnOne(defender_location, mob_world, settings.spawn_distance, EntityType.SKELETON);
                }
                else {
                    spawn.spawnOne(defender_location, mob_world, settings.spawn_distance, EntityType.SPIDER);
                }
            }
        }
    }
}
