package com.daimaxue.dgamxtools;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class DGamxTools extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("[DGamxTools] =========§eDGamxTools§f=============");
        Bukkit.getConsoleSender().sendMessage("[DGamxTools] DGamxTools已加载完成,作者Daimaxue");
        Bukkit.getConsoleSender().sendMessage("[DGamxTools] =================================");
        Bukkit.getPluginCommand("Gamemode").setExecutor(this);
        Bukkit.getPluginCommand("Fly").setExecutor(this);
    }


    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("=========§eDGamxTools§f=============");
        Bukkit.getConsoleSender().sendMessage("DGamxTools已卸载完成,作者Daimaxue");
        Bukkit.getConsoleSender().sendMessage("====================================");
    }
}
