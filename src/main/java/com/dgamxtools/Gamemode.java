package com.dgamxtools;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gamemode implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("[DGamxTools]此命令只能由管理员执行！");
            return true;
        }

        Player player = (Player) sender;

        if (args.length != 1) {
            player.sendMessage("[DGamxTools]指令:/Gamemode或/gm <模式>");
            return true;
        }

        String mode = args[0].toLowerCase();

        switch (mode) {
            case "survival", "0", "生存" -> {
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage("[DGamxTools]游戏模式已切换为生存模式！");
            }
            case "creative", "1", "创造" -> {
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage("[DGamxTools]游戏模式已切换为创造模式！");
            }
            case "adventure", "2", "冒险" -> {
                player.setGameMode(GameMode.ADVENTURE);
                player.sendMessage("[DGamxTools]游戏模式已切换为冒险模式！");
            }
            case "spectator", "3", "旁观" -> {
                player.setGameMode(GameMode.SPECTATOR);
                player.sendMessage("[DGamxTools]游戏模式已切换为旁观者模式！");
            }
            default -> player.sendMessage("[DGamxTools]无效的游戏模式！");
        }

        return true;
    }
}
