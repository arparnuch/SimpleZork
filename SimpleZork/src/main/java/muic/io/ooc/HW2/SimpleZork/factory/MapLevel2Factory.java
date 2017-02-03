package muic.io.ooc.HW2.SimpleZork.factory;

import muic.io.ooc.HW2.SimpleZork.*;
import muic.io.ooc.HW2.SimpleZork.item.Potion;

/**
 * Created by arparnuch on 1/31/2017 AD.
 */
public class MapLevel2Factory implements MapFactory {

    @Override
    public void introOfTheLevel() {
        System.out.println("Your HP is restored and increased to 15.");
        System.out.println("Objective 2: You have to fight your way through to make it to the Heaven. Kill them all!!");
    }

    @Override
    public GameMap generateMap() {
        Room[] map = new Room[7];
        createRooms(map);
        Monster[] monsters = createMonsters(4);
//        Potion[] potions = createPotion(3);

        map[6].setMonster(monsters[0]);

        map[4].setMonster(monsters[1]);

        map[2].setMonster(monsters[2]);

        map[3].setMonster(monsters[3]);

        setConnectedRooms(map);

        GameMap gameMap = new GameMap();
        gameMap.setMap(map);
        gameMap.setItems(null);
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
            monster.setAttackPoint(4);
            monster.setHP(10);
            monster.setLevel(2);
            monster.setNameM("B");
            monsters[i] = monster;

        }
        return monsters;

    }


    @Override
    public Potion[] createPotion(int poNum){
        return null;

    }


    @Override
    public void setConnectedRooms(Room[] map){
        map[0].setWest(map[5]); map[0].setEast(map[1]);

        map[1].setWest(map[0]); map[1].setNorth(map[2]); map[1].setSouth(map[3]);

        map[2].setSouth(map[1]);

        map[3].setNorth(map[1]);

        map[4].setNorth(map[5]);

        map[5].setNorth(map[6]); map[5].setSouth(map[4]); map[5].setEast(map[0]);

        map[6].setSouth(map[5]);


    }

}
