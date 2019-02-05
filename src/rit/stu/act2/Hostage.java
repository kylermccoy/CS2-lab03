/**
 * Hostage.java
 * Lab 3
 * Author: Kyle McCoy krm7269@rit.edu
 */
package rit.stu.act2;

/**
 * represents hostage with unique ID
 */
public class Hostage implements Player {
    private int id ; // unique ID

    /**
     * create a new hostage
     * @param id unique id
     */
    public Hostage(int id) {
        this.id = id ;
    }

    /**
     * If the hostage losses to player, it displays the message,
     * "{hostage} cries, 'Defeated by {player}!'".
     * @param player
     */
    public void defeat(Player player) {
        System.out.println(this.toString() + " cries, 'Defeated by " + player + "!'") ;
    }

    /**
     * The string representation of a hostage is: "Hostage #n", where n is their id.
     * @return String
     */
    @Override
    public String toString() {
        return "Hostage #" + this.id ;
    }

    /**
     * If the hostage is triumphant over player,
     * it displays the message, "{hostage} yells, 'Victory over {player}!'".
     * @param player
     */
    public void victory(Player player) {
        System.out.println(this.toString() + " yells, 'Victory over " + player + "!'") ;
    }
}
