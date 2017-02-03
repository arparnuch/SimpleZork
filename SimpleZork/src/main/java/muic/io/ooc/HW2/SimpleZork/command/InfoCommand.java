package muic.io.ooc.HW2.SimpleZork.command;

import muic.io.ooc.HW2.SimpleZork.item.Item;
import muic.io.ooc.HW2.SimpleZork.Player;
import muic.io.ooc.HW2.SimpleZork.Room;

import java.util.Iterator;

/**
 * Created by arparnuch on 2/1/2017 AD.
 */
public class InfoCommand implements Command {

    @Override
    public void apply(Player player) {

        System.out.println("Player Status:");
        System.out.println("Current HP: " + player.getHPPlayer());
        System.out.println("Current ATK: " + player.getAttackPoint());
        System.out.println("Current EXP: " + player.getExp());
        System.out.println("Inside his bag: ");
        Iterator<Item> loop = player.getBags().iterator();
        while (loop.hasNext()){
            System.out.println(loop.next().getName());
        }



        System.out.println("===================================================");
        Room currentRoom = player.getRoom();
        String start = "This room has: ";
        String output = "";
        if (currentRoom.getMonster() != null){
            output+= "1 monster, ";

        }
        if (currentRoom.getItem() != null) output = output + "1 " + currentRoom.getItem().getName();
        if (output.equals("")) output = "None";
        System.out.println(start + output);

        start =  "There are exits at: ";
        output = "";
        if (currentRoom.getNorth() != null) output += "North ";
        if (currentRoom.getSouth() != null) output += "South ";
        if (currentRoom.getWest() != null) output += "West ";
        if (currentRoom.getEast() != null) output += "East ";





        System.out.println(start + output);


    }
}
