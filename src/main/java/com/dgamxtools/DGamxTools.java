package com.dgamxtools;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public final class DGamxTools extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("=========GamxTools========");
        System.out.println("DGamxTools已加载,作者Daimaxue");
        System.out.println("===========================");
        Bukkit.getPluginCommand("Gamemode").setExecutor(new Gamemode());
        Bukkit.getPluginCommand("Crash").setExecutor(new Crash());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("=========GamxTools========");
        System.out.println("DGamxTools已卸载,作者Daimaxue");
        System.out.println("===========================");
    }
}
