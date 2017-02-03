package muic.io.ooc.HW2.SimpleZork.item;

import muic.io.ooc.HW2.SimpleZork.Player;
import muic.io.ooc.HW2.SimpleZork.item.Item;

/**
 * Created by arparnuch on 1/29/2017 AD.
 */
public class Potion extends Item {
    private int healPoint;

    public int getHealPoint() {
        return healPoint;
    }

    public void setHealPoint(int healPoint) {
        this.healPoint = healPoint;
    }


}
