package muic.io.ooc.HW2.SimpleZork.command;

import junit.framework.TestCase;
import muic.io.ooc.HW2.SimpleZork.Monster;
import muic.io.ooc.HW2.SimpleZork.Player;
import muic.io.ooc.HW2.SimpleZork.Room;
import muic.io.ooc.HW2.SimpleZork.factory.GameMap;
import muic.io.ooc.HW2.SimpleZork.item.Item;
import muic.io.ooc.HW2.SimpleZork.item.Potion;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import static muic.io.ooc.HW2.SimpleZork.ZorkGame.args;
import static org.junit.Assert.*;

/**
 * Created by arparnuch on 2/3/2017 AD.
 */
public class CommandTest{

    @Test
    public void commandParser() throws Exception{

        assertEquals(CommandFactory.getCommand("quit").getClass(), new QuitCommand().getClass());
        assertEquals(CommandFactory.getCommand("drop").getClass(), new DropCommand().getClass());
        assertEquals(CommandFactory.getCommand("help").getClass(), new HelpCommand().getClass());
        assertEquals(CommandFactory.getCommand("attack with").getClass(), new AttackWithCommand().getClass());
        assertEquals(CommandFactory.getCommand("gp").getClass(), new GoCommand().getClass());
        assertEquals(CommandFactory.getCommand("use").getClass(), new UseCommand().getClass());
        assertEquals(CommandFactory.getCommand("info").getClass(), new InfoCommand().getClass());
        assertEquals(CommandFactory.getCommand("take").getClass(), new TakeCommand().getClass());

    }


    @Test
    public void takeItemtoBags(){
        Potion potion = new Potion();
        potion.setName("test potion");

        Player player = new Player();
        player.setBags(new ArrayList<>());
        player.take(potion);
        assertTrue(potion == player.getBags().get(0));

    }



    @Test
    public void AttackWithCommand() throws Exception {
//

    }

    @Test
    public void DropCommand() throws Exception {
//        Setup setup = new Setup();
//        Player player = setup.createSetup();
//        Potion potion = new Potion();
//        potion.setHealPoint(5);
//        double beforeHP = player.getHPPlayer();
//        System.out.println("before " + beforeHP);
//        player.take(potion);
//        potion.setName("test");
//        ArrayList<String> name = new ArrayList<>(); name.add("test");
//        args.put("drop", name);
//        ArrayList<String> willBeDropItem = args.get("drop"); // can only use one item!!
//
//        CommandFactory.getCommand("use").apply(player);

//        System.out.println("Now " + player.getHPPlayer());
    }

    @Test
    public void dieAll() throws Exception {
        GameMap gameMap = new GameMap();
        Room room = new Room();


        room.setMonster(new Monster());
        Room[] map = {room,room,room};
        gameMap.setMap(map);
        Monster[] monsters = {new Monster(), new Monster(), new Monster()};
        gameMap.setMonsters(monsters);
        gameMap.setMonsters(monsters);

        assertFalse(gameMap.getMonsters() == null);



    }




    @Test
    public void UseCommand() throws Exception {
        Setup setup = new Setup();
        Player player = setup.createSetup();
        Potion potion = new Potion();
        potion.setHealPoint(5);
        double beforeHP = player.getHPPlayer();
        System.out.println("before " + beforeHP);
        player.take(potion);
        potion.setName("test");
        ArrayList<String> name = new ArrayList<>(); name.add("test");
        args.put("use", name);
        ArrayList<String> willBeUsedItem = args.get("use"); // can only use one item!!
        CommandFactory.getCommand("use").apply(player);
        double nowHP = player.getHPPlayer();
//        System.out.println("Now " + player.getHPPlayer());

        assertTrue(nowHP > beforeHP);

    }




}