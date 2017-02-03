package muic.io.ooc.HW2.SimpleZork.command;

import muic.io.ooc.HW2.SimpleZork.Player;

/**
 * Created by arparnuch on 2/1/2017 AD.
 */
public class QuitCommand implements Command {
    @Override
    public void apply(Player player) {
        System.exit(0);
    }
}
