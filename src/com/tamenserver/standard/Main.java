package com.tamenserver.standard;

import org.bukkit.plugin.ServicePriority;
import org.bukkit.plugin.java.JavaPlugin;

import com.tamenserver.standard.setinterpreter.SetInterpreter;

public class Main extends JavaPlugin {
    
    @Override
    public void onEnable() {
        getLogger().info("Standard plugin is enabled!");
        this.getServer().getServicesManager().register(SetInterpreter.class, new SetInterpreter(), this, ServicePriority.Highest);
    }
    
    @Override
    public void onDisable() {
        getLogger().info("Standard plugin is disabled!");
        this.getServer().getServicesManager().unregisterAll(this);
    }
    
}
