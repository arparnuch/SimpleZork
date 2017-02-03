package muic.io.ooc.HW2.SimpleZork;

import muic.io.ooc.HW2.SimpleZork.factory.GameMap;
import muic.io.ooc.HW2.SimpleZork.item.Item;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by arparnuch on 1/29/2017 AD.
 */
public class Level extends GameMap {
    private int level;


    public Level(int level){
        this.level = level;
    }
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void complete(Player player){


        if (this.level == 1){
            boolean killAll = true;
            boolean takeSouls = false;

            ArrayList<Item> bag = player.getBags();
            int count = 0;
            Iterator<Item> itemIterator = bag.iterator();
            while (itemIterator.hasNext()){
                Item item = itemIterator.next();
                if (item.getName().equals("soul")){
                    count++;
                }
            }


            if (count == 3){
                takeSouls = true;
//                player.setCompleteObjective(true);
            }

            Room[] map = player.getGameMap().getMap();
            for (Room r : map) {
                if (r.getMonster() != null){ // there is still monster left
                    killAll = false;
                    break;
                }
            }

            if (takeSouls && killAll) player.setCompleteObjective(true);

        }else{
            boolean killAll = true;

            Room[] map = player.getGameMap().getMap();
            for (Room r : map) {
                if (r.getMonster() != null){ // there is still monster left
                    killAll = false;
                    break;
                }
            }
            if (killAll){
                player.setCompleteObjective(true);

                if (level==3){
                    System.out.println("Congrats! You free your beloved cat soul!!");
                    System.exit(0);
                }
            }

        }


    }

}
