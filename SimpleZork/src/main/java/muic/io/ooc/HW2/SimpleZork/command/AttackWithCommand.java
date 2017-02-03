package muic.io.ooc.HW2.SimpleZork.command;

import muic.io.ooc.HW2.SimpleZork.*;
import muic.io.ooc.HW2.SimpleZork.item.Item;
import muic.io.ooc.HW2.SimpleZork.item.Weapon;

import java.util.Iterator;

import static muic.io.ooc.HW2.SimpleZork.ZorkGame.args;
/**
 * Created by arparnuch on 2/1/2017 AD.
 */
public class AttackWithCommand implements Command {
    @Override
    public void apply(Player player) {

        Room room = player.getRoom();
        Monster monster = room.getMonster();
        String weapon = args.get("attack with").get(0);
        Iterator<Item> bags = player.getBags().iterator();
        boolean valid = false;
        double totalAttack = 0;
        while (bags.hasNext()){
            Item item = bags.next();

            if (item.getName().equals(weapon)){ //
                valid = true;
                totalAttack = player.getAttackPoint() + ((Weapon) item).getDamagePoint();
                break;
            }


        }


        if (monster != null && valid){ // if there is a monster + you have such weapon in your bag !
            System.out.println("Hit monster with " + totalAttack);
            monster.setHP(monster.getHP() - totalAttack);
            System.out.println("Monster hit you back with " + monster.getAttackPoint());
            player.setHPPlayer(player.getHPPlayer() - monster.getAttackPoint());
            System.out.println("Remaining HP of Meow : " + player.getHPPlayer());


        }else {
            System.out.println("What are you hitting at ??");
        }

        if (monster != null && monster.getHP() <= 0){
            System.out.println("Monster Die!");
            player.setExp(player.getExp() + 2);


            player.setAttackPoint(player.getAttackPoint() * 1.1);
            player.getRoom().setMonster(null);


        }

        if (player.getHPPlayer() <= 0){
            System.out.println("Player Dies! Game Over!!");
            Command quitCommand = new QuitCommand();
            quitCommand.apply(player);
        }

    }


}

