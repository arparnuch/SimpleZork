package muic.io.ooc.HW2.SimpleZork.factory;

import muic.io.ooc.HW2.SimpleZork.*;
import muic.io.ooc.HW2.SimpleZork.item.Potion;

import java.util.Random;

/**
 * Created by arparnuch on 1/31/2017 AD.
 */
public class MapLevel3Factory implements MapFactory{
    @Override
    public void introOfTheLevel() {
        System.out.println("Your HP is restored and increased to 20.");
        System.out.println("Objective 3: Defeat Devil Cat in order to free your beloved cat soul. Find him!!");
    }


    @Override
    public GameMap generateMap() {
        Room[] map = new Room[6];
        createRooms(map);
        Monster[] monsters = createMonsters(3);
        Potion[] potions = createPotion(3);
        Random random = new Random();
        int randomRoom = random.nextInt(6);
        map[randomRoom].setMonster(monsters[0]);
//        System.out.println("big boss is at " + randomRoom);

        map[0].setItem(potions[0]);
        map[2].setItem(potions[1]);
        map[4].setItem(potions[2]);

        setConnectedRooms(map);

        GameMap gameMap = new GameMap();
        gameMap.setMap(map);
        gameMap.setItems(potions);
        gameMap.setMonsters(monsters);
        return gameMap;
    }



    @Override
    public void createRooms(Room[] map){

        for (int i = 0; i < map.length; i++) {
            map[i] = new Room();
        }

    }

    @Override
    public Monster[] createMonsters(int monsNum){


        Monster[] monsters = new Monster[monsNum];
        for (int i = 0; i < monsNum; i++) {
            Monster monster = new Monster();
            monster.setAttackPoint(5);
            monster.setHP(25);
            monster.setLevel(3);
            monster.setNameM("Devil Cat!");
            monsters[i] = monster;

        }
        return monsters;

    }


    @Override
    public Potion[] createPotion(int poNum){

        Potion[] potions = new Potion[poNum];
        for (int i = 0; i < poNum; i++) {
            Potion potion = new Potion();
            potion.setName("Yellow_potion");
            potion.setHealPoint(6);
            potion.setItem_type(0);
            potions[i] = potion;
        }
        return potions;
    }


    @Override
    public void setConnectedRooms(Room[] map){
        map[0].setEast(map[1]); map[0].setSouth(map[3]);

        map[1].setWest(map[0]); map[1].setEast(map[2]); map[1].setSouth(map[4]);

        map[2].setWest(map[1]); map[2].setSouth(map[5]);

        map[3].setNorth(map[0]); map[3].setEast(map[4]);

        map[4].setNorth(map[1]); map[4].setWest(map[3]); map[4].setEast(map[5]);

        map[5].setWest(map[4]); map[5].setNorth(map[2]);


    }

}
