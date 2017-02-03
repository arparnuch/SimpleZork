package muic.io.ooc.HW2.SimpleZork.command;

import muic.io.ooc.HW2.SimpleZork.item.Item;
import muic.io.ooc.HW2.SimpleZork.Player;

import java.util.Iterator;

import static muic.io.ooc.HW2.SimpleZork.ZorkGame.args;


/**
 * Created by arparnuch on 2/1/2017 AD.
 */
public class DropCommand implements Command {
    @Override
    public void apply(Player player) {
        String wilBeDropItem = args.get("drop").get(0); //

        Iterator<Item> bags = player.getBags().iterator();

        while (bags.hasNext()){
            if (wilBeDropItem.equals(bags.next().getName())){
                System.out.println("Drop " + wilBeDropItem);
                bags.remove();
            }
        }

    }
}
