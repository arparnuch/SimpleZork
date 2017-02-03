package muic.io.ooc.HW2.SimpleZork.command;

import muic.io.ooc.HW2.SimpleZork.Player;
import muic.io.ooc.HW2.SimpleZork.Room;

import static muic.io.ooc.HW2.SimpleZork.ZorkGame.args;/**
 * Created by arparnuch on 2/1/2017 AD.
 */
public class GoCommand implements Command {

    @Override
    public void apply(Player player) {
        Room currentRoom = player.getRoom();
        String direct = args.get("go").get(0);
        System.out.println(direct);


        if (direct.equals("north") && currentRoom.getNorth() != null) player.setRoom(currentRoom.getNorth());
        else if (direct.equals("south") && currentRoom.getSouth() != null) player.setRoom(currentRoom.getSouth());
        else if (direct.equals("west") && currentRoom.getWest() != null) player.setRoom(currentRoom.getWest());
        else if (direct.equals("east") && currentRoom.getEast() != null) player.setRoom(currentRoom.getEast());
        else System.out.println("You cannot go in this direction");
}



}
