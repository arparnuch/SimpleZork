package muic.io.ooc.HW2.SimpleZork.command;

import muic.io.ooc.HW2.SimpleZork.Level;
import muic.io.ooc.HW2.SimpleZork.Player;
import muic.io.ooc.HW2.SimpleZork.Room;
import muic.io.ooc.HW2.SimpleZork.ZorkGame;
import muic.io.ooc.HW2.SimpleZork.factory.MapFactory;
import muic.io.ooc.HW2.SimpleZork.factory.MapLevel1Factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by arparnuch on 1/31/2017 AD.
 */
public final class CommandFactory {

    private static final HashMap<String, Command> commands = new HashMap<String, Command>() {
        {
            // commands are added here using lambdas. It is also possible to dynamically add commands without editing the code.
            put("help", new HelpCommand());
            put("quit", new QuitCommand());
            put("attack with", new AttackWithCommand());
            put("drop", new DropCommand());
            put("go", new GoCommand());
            put("info", new InfoCommand());
            put("use" , new UseCommand());
            put("take", new TakeCommand());


        }
    };



    public static Command getCommand(String name) {
        return commands.get(name);
    }


}
