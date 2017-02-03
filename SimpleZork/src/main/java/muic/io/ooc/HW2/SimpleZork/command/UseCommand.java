package muic.io.ooc.HW2.SimpleZork.command;

import muic.io.ooc.HW2.SimpleZork.item.Item;
import muic.io.ooc.HW2.SimpleZork.Player;
import muic.io.ooc.HW2.SimpleZork.item.Potion;

import java.util.ArrayList;
import java.util.Iterator;

import static muic.io.ooc.HW2.SimpleZork.ZorkGame.args;

/**
 * Created by arparnuch on 2/1/2017 AD.
 */
public class UseCommand implements Command {
    @Override
    public void apply(Player player) {
        ArrayList<String> willBeUsedItem = args.get("use"); // can only use one item!!

        String usedItem = willBeUsedItem.get(0);
        ArrayList<Item> bags = player.getBags();
        Iterator<Item> iterator = bags.iterator();
        boolean found = false;
        while (iterator.hasNext()){
            Item currentItemInBags = iterator.next();

            if (currentItemInBags.getItem_type() == 0){
                if (usedItem.equals(currentItemInBags.getName())){
                    player.setHPPlayer(player.getHPPlayer() + ((Potion) currentItemInBags).getHealPoint());
                    System.out.println("Current player HP: " +player.getHPPlayer());
                    iterator.remove();
                    System.out.println(bags);
                    found = true;
                    break;
                }
            }


        }

        if(!found){
            System.out.println("There is no such item in your bag! OR you cannot use 'use' command with weapon");
        }

    }
}
