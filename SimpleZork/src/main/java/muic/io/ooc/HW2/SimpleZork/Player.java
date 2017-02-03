package muic.io.ooc.HW2.SimpleZork;

import muic.io.ooc.HW2.SimpleZork.factory.*;
import muic.io.ooc.HW2.SimpleZork.item.Item;
import muic.io.ooc.HW2.SimpleZork.item.Weapon;

import java.util.ArrayList;

/**
 * Created by arparnuch on 1/29/2017 AD.
 */
public class Player{
    private String name; // Meow
    private double HPPlayer; // 10
    private double attackPoint; // 1
    private float exp; // 0
    private ArrayList<Item> bags = new ArrayList<Item>();
    private boolean completeObjective = true;
    private Room room = null;

    private GameMap gameMap;

    public void setBags(ArrayList<Item> bags) {
        this.bags = bags;
    }

    public GameMap getGameMap() {
        return gameMap;
    }

    public void setGameMap(GameMap gameMap) {
        this.gameMap = gameMap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHPPlayer() {
        return HPPlayer;
    }

    public void setHPPlayer(double HPPlayer) {
        this.HPPlayer = HPPlayer;
    }

    public double getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(double attackPoint) {
        this.attackPoint = attackPoint;
    }

    public float getExp() {
        return exp;
    }

    public void setExp(float exp) {
        this.exp = exp;
    }



    public ArrayList<Item> getBags() {
        return bags;
    }

    public void take(Item item) {
        this.bags.add(item);
    }

    public boolean isCompleteObjective() {
        return completeObjective;
    }

    public void setCompleteObjective(boolean completeObjective) {
        this.completeObjective = completeObjective;
    }


    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }




}




