/**
 * Guerilla.java
 * Lab 3
 * Author: Kyle McCoy krm7269@rit.edu
 */
package rit.stu.act2;

/**
 * represent guerilla whom has a unique id
 */
public class Guerilla implements Player {
    public static final int CHANCE_TO_BEAT_SOLDIER = 20 ;
    private int id ; // unique id

    /**
     * create a new guerilla
     * @param id unique tag
     */
    public Guerilla(int id) {
        this.id = id ;
    }

    /**
     * If the guerilla losses to player,
     * it displays the message, "{guerilla} cries, 'Derrotado por {player}!'".
     * @param player
     */
    public void defeat(Player player) {
        System.out.println(this.toString() + " cries, 'Derrotado por " + player + "!'") ;
    }

    /**
     * The string representation of a guerilla is: "Guerilla #n", where n is their id.
     * @return String
     */
    @Override
    public String toString() {
        return "Guerilla #" + this.id ;
    }

    /**
     * If the guerilla is triumphant over player, it displays the message,
     * "{guerilla} yells, 'Victoria sobre {player}!'".
     * @param player
     */
    public void victory(Player player) {
        System.out.println(this.toString() + " yells, 'Victoria sobre " + player + "!'") ;
    }
}
