package muic.io.ooc.HW2.SimpleZork.command;

import muic.io.ooc.HW2.SimpleZork.item.Item;
import muic.io.ooc.HW2.SimpleZork.Player;
import muic.io.ooc.HW2.SimpleZork.Room;

import java.util.ArrayList;
import java.util.Iterator;

import static muic.io.ooc.HW2.SimpleZork.ZorkGame.args;
/**
 * Created by arparnuch on 2/1/2017 AD.
 */
public class TakeCommand implements Command {


    @Override
    public void apply(Player player) {
        Room currentRoom = player.getRoom();
        ArrayList<String> items = args.get("take");
        System.out.println(items);

        Iterator<String> iterator = items.iterator();

        while (iterator.hasNext()){
            String willBeTakeItem = iterator.next();
            Item itemOfcurrentRoom = currentRoom.getItem();

            if (itemOfcurrentRoom != null){ // if there is no item to take then what are you doing

                if (willBeTakeItem.equals(itemOfcurrentRoom.getName())){
                    // if there is item to take in the room and take the correct one
                    player.take(itemOfcurrentRoom);
                    currentRoom.setItem(null);
                    System.out.println("Player take " + willBeTakeItem);
                }else { // what you take is not in the room!
                    System.out.println("There is no such item in this room");
                }
            }else {
                System.out.println("There is no item in this room!");
                break;
            }




        }




    }
}
