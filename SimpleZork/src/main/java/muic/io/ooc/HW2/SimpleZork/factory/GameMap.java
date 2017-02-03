package muic.io.ooc.HW2.SimpleZork.factory;

import muic.io.ooc.HW2.SimpleZork.Level;
import muic.io.ooc.HW2.SimpleZork.item.Item;
import muic.io.ooc.HW2.SimpleZork.Monster;
import muic.io.ooc.HW2.SimpleZork.Room;

/**
 * Created by arparnuch on 1/29/2017 AD.
 */
public class GameMap {
    private Monster[] monsters;
    private Item[] items;
    private Room[] map;

    public Monster[] getMonsters() {
        return monsters;
    }

    public void setMonsters(Monster[] monsters) {
        this.monsters = monsters;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public Room[] getMap() {
        return map;
    }

    public void setMap(Room[] map) {
        this.map = map;
    }
}
