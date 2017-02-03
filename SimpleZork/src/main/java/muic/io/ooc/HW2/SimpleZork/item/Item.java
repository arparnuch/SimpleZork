package muic.io.ooc.HW2.SimpleZork.item;

import muic.io.ooc.HW2.SimpleZork.Player;

/**
 * Created by arparnuch on 1/29/2017 AD.
 */
public abstract class Item{
    final int MAX_ITEM = 3;
    int item_type;
    String name;


    public int getItem_type() {
        return item_type;
    } // 0 = potion , 1 = weapon

    public void setItem_type(int item_type) {
        this.item_type = item_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public abstract void useItem(Player player, Item item); // use






}

