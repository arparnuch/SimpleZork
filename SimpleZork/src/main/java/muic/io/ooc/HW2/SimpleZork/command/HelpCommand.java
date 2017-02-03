package muic.io.ooc.HW2.SimpleZork.command;

import muic.io.ooc.HW2.SimpleZork.Player;

/**
 * Created by arparnuch on 2/1/2017 AD.
 */
public class HelpCommand implements Command {
    @Override
    public void apply(Player player) {
        System.out.println("Commands are: ");
        System.out.println("'info' / 'quit' / 'help'");
        System.out.println("'drop <item1>'");
        System.out.println("'go <direction>' eg. go east etc.");
        System.out.println("'take <item1> <item2> <item3> ....'");
        System.out.println("'use <potion>' eg. use Green_potion *use with Potion only*");
        System.out.println("'attack with <weapon>' eg. attack with Rusty_sword");
    }
}
