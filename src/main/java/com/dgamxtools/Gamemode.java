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
            sender.sendMessage("[DGamxTools]������ֻ���ɹ���Աִ�У�");
            return true;
        }

        Player player = (Player) sender;

        if (args.length != 1) {
            player.sendMessage("[DGamxTools]ָ��:/Gamemode��/gm <ģʽ>");
            return true;
        }

        String mode = args[0].toLowerCase();

        switch (mode) {
            case "survival", "0", "����" -> {
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage("[DGamxTools]��Ϸģʽ���л�Ϊ����ģʽ��");
            }
            case "creative", "1", "����" -> {
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage("[DGamxTools]��Ϸģʽ���л�Ϊ����ģʽ��");
            }
            case "adventure", "2", "ð��" -> {
                player.setGameMode(GameMode.ADVENTURE);
                player.sendMessage("[DGamxTools]��Ϸģʽ���л�Ϊð��ģʽ��");
            }
            case "spectator", "3", "�Թ�" -> {
                player.setGameMode(GameMode.SPECTATOR);
                player.sendMessage("[DGamxTools]��Ϸģʽ���л�Ϊ�Թ���ģʽ��");
            }
            default -> player.sendMessage("[DGamxTools]��Ч����Ϸģʽ��");
        }

        return true;
    }
}
