package muic.io.ooc.HW2.SimpleZork;

import muic.io.ooc.HW2.SimpleZork.command.Command;
import muic.io.ooc.HW2.SimpleZork.command.CommandFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by arparnuch on 1/25/2017 AD.
 */
public class Main {


    public static void main(final String[] arguments) {
        ZorkGame zorkGame = new ZorkGame();
        zorkGame.start(zorkGame);

    }
}
