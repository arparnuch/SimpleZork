package muic.io.ooc.HW2.SimpleZork;

import muic.io.ooc.HW2.SimpleZork.command.Command;
import muic.io.ooc.HW2.SimpleZork.command.CommandFactory;
import muic.io.ooc.HW2.SimpleZork.factory.*;
import muic.io.ooc.HW2.SimpleZork.item.Potion;
import muic.io.ooc.HW2.SimpleZork.item.Weapon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by arparnuch on 2/3/2017 AD.
 */
public class ZorkGame {

    public static final HashMap<String, ArrayList<String>> args = new HashMap<>();

    private static Level level = new Level(0);

    public void initialize(Player player, int level){

        if (level == 1) {

            player.setAttackPoint(3);
            player.setHPPlayer(10);
            player.setName("Meow");
            player.setExp(0);
            Potion potion1 = new Potion();
            potion1.setItem_type(0); potion1.setName("Green_potion"); potion1.setHealPoint(3);
            Weapon weapon1 = new Weapon();
            weapon1.setName("Rusty_sword");
            weapon1.setItem_type(1);
            weapon1.setDamagePoint(2);

            player.take(potion1);  player.take(weapon1);

            MapFactory mapFactory = new MapLevel1Factory();
            mapFactory.introOfTheLevel();
            GameMap level1 = mapFactory.generateMap();

            player.setRoom(level1.getMap()[0]);
            player.setGameMap(level1);
        }


        else if (level == 2){
            player.setHPPlayer(15);
//            player.setBags(null);


            Potion potion1 = new Potion();
            potion1.setItem_type(0); potion1.setName("Yellow_potion"); potion1.setHealPoint(6);
            Weapon weapon1 = new Weapon();
            weapon1.setName("Great_sword");
            weapon1.setItem_type(1);
            weapon1.setDamagePoint(5);

            player.take(potion1);  player.take(weapon1);

            MapFactory mapFactory = new MapLevel2Factory();
            mapFactory.introOfTheLevel();
            GameMap level2 = mapFactory.generateMap();

            player.setRoom(level2.getMap()[0]);
            player.setGameMap(level2);
        }

        else {

            player.setHPPlayer(20);
//            player.setBags(null);

            Potion potion1 = new Potion();
            potion1.setItem_type(0); potion1.setName("Red_potion"); potion1.setHealPoint(12);
            Weapon weapon1 = new Weapon();
            weapon1.setName("Sabre");
            weapon1.setItem_type(1);
            weapon1.setDamagePoint(10);

            player.take(potion1);  player.take(weapon1);

            MapFactory mapFactory = new MapLevel3Factory();
            mapFactory.introOfTheLevel();
            GameMap level3 = mapFactory.generateMap();
            player.setRoom(level3.getMap()[0]);
            player.setGameMap(level3);
        }

        player.setCompleteObjective(false);

    }

    protected void start(ZorkGame zorkGame){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        System.out.println("Bot: Hello, Welcome to SimpleZork World! type 'help' if you don't know what to do");
        Player player = new Player();

        while (!quit) {

            if (player.isCompleteObjective()){ // move to new map?
                level.setLevel(level.getLevel()+1);
                zorkGame.initialize(player,level.getLevel());
            }

            System.out.print("You: ");
            String commandLine = scanner.nextLine();
            String[] commandArg = commandLine.split(" ");
            int start;
            if (!commandLine.contains("attack with")){
                commandLine = commandArg[0];
                start = 1;
            }else{
                commandLine = commandArg[0] + " " + commandArg[1];
                start = 2;
            }
            System.out.println("command = " + commandLine);

            Command command = CommandFactory.getCommand(commandLine);
            if (null == command) {
                System.out.println("Unknown command [" + commandLine + "]. There are {info, quit, take, use, go, help, attack with}");
            } else {
                ArrayList<String> arrayList = new ArrayList<>();

                for (int i = start; i < commandArg.length; i++) {
                    arrayList.add(commandArg[i]);
                }
                args.put(commandLine, arrayList);

                System.out.println(args);
                command.apply(player);
                level.complete(player); // toggle boolean ?



            }
        }
    }

}
