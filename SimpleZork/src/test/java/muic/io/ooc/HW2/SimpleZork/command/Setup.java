package muic.io.ooc.HW2.SimpleZork.command;

import muic.io.ooc.HW2.SimpleZork.Player;
import muic.io.ooc.HW2.SimpleZork.factory.GameMap;
import muic.io.ooc.HW2.SimpleZork.factory.MapFactory;
import muic.io.ooc.HW2.SimpleZork.factory.MapLevel1Factory;
import muic.io.ooc.HW2.SimpleZork.item.Potion;
import muic.io.ooc.HW2.SimpleZork.item.Weapon;

import java.util.Scanner;

/**
 * Created by arparnuch on 2/4/2017 AD.
 */
public class Setup {

    public Player createSetup(){
        Player player = new Player();

        player.setAttackPoint(3);
        player.setHPPlayer(10);
        player.setName("Meow");
        player.setExp(0);
        Potion testPotion = new Potion();
        testPotion.setItem_type(0); testPotion.setName("Green_potion"); testPotion.setHealPoint(3);
        Weapon testWeapon = new Weapon();
        testWeapon.setName("Rusty_sword");
        testWeapon.setItem_type(1);
        testWeapon.setDamagePoint(2);

        player.take(testPotion);  player.take(testWeapon);
        MapFactory testFactory = new MapLevel1Factory();
        testFactory.introOfTheLevel();
        GameMap testMap = testFactory.generateMap();

        player.setRoom(testMap.getMap()[0]);
        player.setGameMap(testMap);

        return player;
    }

    public void setupCommand(){
        Scanner scanner = new Scanner(System.in);

    }
}
