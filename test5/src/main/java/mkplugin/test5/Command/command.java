package mkplugin.test5.Command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class command implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {

        if (commandSender instanceof Player) {
            Player p = (Player) commandSender;
            if (args.length == 0) {
                p.sendMessage("테스트 성공");

            } else {
                if (args[0].equals("성공")) { // 마크에서 /test 성공을 칠시 성공!이라고 메세지가 뜬다

                    p.sendMessage("성공!");
                }


            }
            return false;
        }
        return false;
    }
}










