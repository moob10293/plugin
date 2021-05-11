package me.moob.hardersurvival;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import java.util.ArrayList;

//this class is part of the group that destroys player creations. this class detects when a player places blocks and
//adds it to the list of blocks that should be destroyed

public class PlayerPlaceEvent implements Listener {
    ArrayList<Location> list_of_player_blocks;
    PlayerPlaceEvent(ArrayList<Location> list){
        this.list_of_player_blocks = list;
    }

    @EventHandler
    public void whenPlace(BlockPlaceEvent event){
        Block block_placed = event.getBlockPlaced();
        list_of_player_blocks.add(block_placed.getLocation());
    }
}
