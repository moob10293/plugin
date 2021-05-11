package me.moob.hardersurvival;

import org.bukkit.inventory.EquipmentSlot;

//a class that stores the settings(not the player placed blocks, though)

public class Settings {
    int spawn_limit;
    int spawn_distance;
    int damage_times;
    int attack_cheat_height;
    EquipmentSlot[] list_of_slots;
    Chance armor_chance;
    Chance another_monster;
    Chance no_animal;
    Chance summon_reinforcements;
    Chance reinforcement_is_a_skeleton;

    Settings() {
        this.armor_chance = new Chance(1,3);
        this.another_monster = new Chance(3,4);
        this.no_animal = new Chance(1,2);
        this.summon_reinforcements = new Chance(1,5);
        this.reinforcement_is_a_skeleton = new Chance(1,2);
        this.spawn_limit = 50;
        this.spawn_distance = 5;
        this.damage_times = 2;
        this.attack_cheat_height = 3;
        this.list_of_slots = new EquipmentSlot[] {EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS,
                EquipmentSlot.FEET};
    }
    public Boolean getArmor_chance() {
        return armor_chance.getChance();
    }
    public Boolean getAnother_monster() {
        return another_monster.getChance();
    }
    public Boolean getNo_animal() {
        return no_animal.getChance();
    }
    public Boolean getSummon_reinforcements() {
        return summon_reinforcements.getChance();
    }
    public Boolean getReinforcement_is_a_skeleton() {
        return reinforcement_is_a_skeleton.getChance();
    }
}
