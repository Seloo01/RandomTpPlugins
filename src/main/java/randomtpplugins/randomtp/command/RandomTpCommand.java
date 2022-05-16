package randomtpplugins.randomtp.command;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import java.util.Random;

public class RandomTpCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;

            Random random = new Random();

            int x = random.nextInt(200);
            int y = 60;
            int z = random.nextInt(200);


            Location randomLocation = new Location(player.getWorld(), x, y, z);
            player.teleport(randomLocation);
        }
        return true;
    }
}