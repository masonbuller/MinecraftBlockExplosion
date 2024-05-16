package org.maseunknown.plugins.blockexplosion;

import org.bukkit.plugin.java.JavaPlugin;

public final class BlockExplosion extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new PlayerMovementListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
