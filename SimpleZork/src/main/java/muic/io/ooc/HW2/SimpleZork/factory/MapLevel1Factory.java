package muic.io.ooc.HW2.SimpleZork.factory;

import muic.io.ooc.HW2.SimpleZork.*;
import muic.io.ooc.HW2.SimpleZork.item.Potion;

/**
 * Created by arparnuch on 1/30/2017 AD.
 */
public class MapLevel1Factory implements MapFactory{

    @Override
    public void introOfTheLevel() {
        System.out.println("Objective 1: please kill all monsters and take 3 souls in order to power the exit gate.");
    }

    @Override
    public GameMap generateMap() {
        Room[] map = new Room[5];
        createRooms(map);
        Monster[] monsters = createMonsters(3);
        Potion[] potions = createPotion(3);

        map[1].setMonster(monsters[0]);
        map[1].setItem(potions[0]);
        map[2].setMonster(monsters[1]);
        map[2].setItem(potions[0]);
        map[3].setMonster(monsters[2]);
        map[3].setItem(potions[0]);
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
            monster.setAttackPoint(2);
            monster.setHP(5);
            monster.setLevel(1);
            monster.setNameM("A");
            monsters[i] = monster;

        }
        return monsters;

    }


    @Override
    public Potion[] createPotion(int poNum){

        Potion[] potions = new Potion[poNum];
        for (int i = 0; i < poNum; i++) {
            Potion potion = new Potion();
            potion.setName("soul");
            potion.setHealPoint(0);
            potion.setItem_type(0);
            potions[i] = potion;
        }
        return potions;
    }


    @Override
    public void setConnectedRooms(Room[] map){
//        Room currentRoom = map.remove(0);

//        ArrayList<Room> connectedRoom = new ArrayList<>();
//        Random random = new Random();
        for (int i = 0; i < map.length; i++) {
            if (i != map.length-1)  map[i].setEast(map[i+1]);
            if (i != 0) map[i].setWest(map[i-1]);
        }


    }


}

