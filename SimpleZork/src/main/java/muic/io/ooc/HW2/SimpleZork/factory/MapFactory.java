package muic.io.ooc.HW2.SimpleZork.factory;

import muic.io.ooc.HW2.SimpleZork.*;
import muic.io.ooc.HW2.SimpleZork.item.Potion;

/**
 * Created by arparnuch on 1/30/2017 AD.
 */
public interface MapFactory {

    void introOfTheLevel();

    GameMap generateMap();

    void createRooms(Room[] map);

    Monster[] createMonsters(int monsNum);

    Potion[] createPotion(int poNum);

    void setConnectedRooms(Room[] map);





}
