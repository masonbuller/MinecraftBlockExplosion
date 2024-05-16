package org.maseunknown.plugins.blockexplosion;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerMovementListener implements Listener {
    @EventHandler
    public void onPlayerMove (PlayerMoveEvent event) {
        Player p = event.getPlayer();
        Block b = p.getLocation().getBlock().getRelative(BlockFace.DOWN);


        if (b.getType() == Material.GRASS_BLOCK) {
            World w = p.getWorld();
            w.createExplosion(p.getLocation(), 5);
        }
        else if (b.getType() == Material.STONE) {
            World w = p.getWorld();
            w.createExplosion(p.getLocation(), 5);
        }
        else if (b.getType() == Material.NETHERRACK) {
            World w = p.getWorld();
            w.createExplosion(p.getLocation(), 5);
        }
        else if (b.getType() == Material.END_STONE) {
            World w = p.getWorld();
            w.createExplosion(p.getLocation(), 5);
        }
    }
}
