package me.moob.hardersurvival;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

//this class takes care of the things regarding food(poisonous rotten flesh and less hunger points restored)

public class EatingEvent implements Listener{
    @EventHandler
    public void eatingEvent(PlayerItemConsumeEvent event){
        ItemStack eaten_item = event.getItem();
        Player person=event.getPlayer();

        if (eaten_item.getType() == Material.ROTTEN_FLESH){//rotten flesh

            PotionEffect ouch = new PotionEffect(PotionEffectType.POISON,200,2);//initialises the effects to give

            person.addPotionEffect(ouch);//applies the effects
        }
        else if (eaten_item.getType() == Material.CHICKEN){
            PotionEffect hungry = new PotionEffect(PotionEffectType.HUNGER,600,1);//the chance used to be 30%, now it's 100%
            person.addPotionEffect(hungry);

        }
        else {
            person.setFoodLevel(person.getFoodLevel()-2);
        }
    }
}
