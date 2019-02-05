/**
 * Soldier.java
 * Lab 3
 * Author: Kyle McCoy krm7269@rit.edu
 */
package rit.stu.act2;

/**
 * represents soldiers with unique ID
 */
public class Soldier implements Player {
    private int id ; // unqiue ID

    /**
     * creates new soldier with unique ID
     * @param id unique ID
     */
    public Soldier(int id) {
        this.id = id;
    }

    /**
     * If the soldier losses to player,
     * it displays the message, "{soldier} cries, 'Besiegt von {player}!'".
     * @param player
     */
    public void defeat(Player player) {
        System.out.println(this.toString() + " cries, 'Besiegt von " + player + "!'") ;
    }

    /**
     * The string representation of a soldier is: "Soldier #n", where n is their id.
     * @return String
     */
    @Override
    public String toString() {
        return "Soldier #" + this.id ;
    }

    /**
     * If the soldier is triumphant over player, it displays the message,
     * "{soldier} yells, 'Sieg über {player}!'".
     * @param player
     */
    public void victory(Player player) {
        System.out.println(this.toString() + " yells, 'Sieg über " + player + "!'") ;
    }
}
