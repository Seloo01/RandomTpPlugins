package randomtpplugins.randomtp;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import randomtpplugins.randomtp.command.RandomTpCommand;

public class RandomTp extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info(ChatColor.BLUE + "Plugin Başlatıldı!");

       getCommand("rt").setExecutor(new RandomTpCommand());
    }



}
