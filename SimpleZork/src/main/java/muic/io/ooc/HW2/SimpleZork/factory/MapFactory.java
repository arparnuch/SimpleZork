package muic.io.ooc.HW2.SimpleZork.factory;

import muic.io.ooc.HW2.SimpleZork.*;
import muic.io.ooc.HW2.SimpleZork.item.Potion;

/**
 * Created by arparnuch on 1/30/2017 AD.
 */
public interface MapFactory {

    String filePath = "/Users/arparnuch/Desktop/MUIC/OOC/Assignment2/SimpleZork/src/main/resources/map.txt";

    void introOfTheLevel();

    GameMap generateMap();

    void createRooms(Room[] map);

    Monster[] createMonsters(int monsNum);

    Potion[] createPotion(int poNum);

    void setConnectedRooms(Room[] map);



//    private Room[][] generateMap(String filePath){
//        Room[][] maps = new Room[3][3];
//        try {
//            List<String> lines = FileUtils.readLines(new File(filePath), "UTF-8");
//
//            for (String line:lines) {
//                line.charAt(0)
//            }
//
//        }catch (IOException ex){
//
//        }
//
//    }

}
