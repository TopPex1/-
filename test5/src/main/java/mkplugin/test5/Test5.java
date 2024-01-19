package mkplugin.test5;

import mkplugin.test5.Command.command;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class Test5 extends JavaPlugin implements Listener, CommandExecutor {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("테스트 플러그인이 활성화 되었습니다.");
        getServer().getPluginManager().registerEvents(this, this);
        getCommand("test").setExecutor(new command());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("테스트 플러그인이 비활성화 되었습니다.");

    }

    @EventHandler
    public void join(PlayerJoinEvent a) {
        String p = a.getPlayer().getName();

        a.setJoinMessage(ChatColor.GOLD + p + ChatColor.AQUA + "님이 서버에서 참가하셨습니다.");
    }

    @EventHandler
    public void quit(PlayerQuitEvent a) {
        String p = a.getPlayer().getName();

        a.setQuitMessage(ChatColor.GOLD + p + ChatColor.RED + "님이 서버에서 나가셨습니다.");
    }

 


}






