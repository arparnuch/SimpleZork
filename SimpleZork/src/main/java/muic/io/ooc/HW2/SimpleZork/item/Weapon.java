package muic.io.ooc.HW2.SimpleZork.item;

import muic.io.ooc.HW2.SimpleZork.Player;
import muic.io.ooc.HW2.SimpleZork.item.Item;

/**
 * Created by arparnuch on 1/29/2017 AD.
 */
public class Weapon extends Item {
    private String type;
    private int damagePoint;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDamagePoint() {
        return damagePoint;
    }

    public void setDamagePoint(int damagePoint) {
        this.damagePoint = damagePoint;
    }
}
