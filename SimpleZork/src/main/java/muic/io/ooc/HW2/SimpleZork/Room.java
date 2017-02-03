package muic.io.ooc.HW2.SimpleZork;

import muic.io.ooc.HW2.SimpleZork.item.Item;

/**
 * Created by arparnuch on 1/29/2017 AD.
 */
public class Room {
    Room North = null;
    Room South = null;
    Room East = null;
    Room West = null;
    Monster monster = null;
    Item item = null;


    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Room getNorth() {
        return North;
    }

    public void setNorth(Room north) {
        North = north;
    }

    public Room getSouth() {
        return South;
    }

    public void setSouth(Room south) {
        South = south;
    }

    public Room getEast() {
        return East;
    }

    public void setEast(Room east) {
        East = east;
    }

    public Room getWest() {
        return West;
    }

    public void setWest(Room west) {
        West = west;
    }
}
