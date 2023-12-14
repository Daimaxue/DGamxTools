package com.daimaxue.dgamxtools.Commands.Other;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.entity.Player;

public class Gamemode implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("此命令只能由玩家执行！");
            return true;
        }

        Player player = (Player) sender;

        if (args.length != 1) {
            player.sendMessage("使用方法：/gm <模式>");
            return true;
        }

        String mode = args[0].toLowerCase();

        // 根据参数切换游戏模式
        switch (mode) {
            case "survival":
            case "s":
            case "生存":
            case "0":
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage("游戏模式已切换为生存模式！");
                break;
            case "creative":
            case "c":
            case "创造":
            case "1":
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage("游戏模式已切换为创造模式！");
                break;
            case "adventure":
            case "a":
            case "冒险":
            case "2":
                player.setGameMode(GameMode.ADVENTURE);
                player.sendMessage("游戏模式已切换为冒险模式！");
                break;
            case "spectator":
            case "sp":
            case "旁观":
            case "3":
                player.setGameMode(GameMode.SPECTATOR);
                player.sendMessage("游戏模式已切换为旁观者模式！");
                break;
            default:
                player.sendMessage("无效的游戏模式！");
                break;
        }

        return true;
    }
}