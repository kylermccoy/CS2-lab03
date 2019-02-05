/**
 * Predator.java
 * Lab 3
 * Author: Kyle McCoy krm7269@rit.edu
 */
package rit.stu.act2;

/**
 * represents the predator
 */
public class Predator implements Player {
    public static final int CHANCE_TO_BEAT_HOSTAGE = 75 ;
    public static final int CHANCE_TO_BEAT_SOLDIER = 50 ;

    /**
     * creates predator class
     */
    public Predator() {}

    /**
     * If the predator loses, the display the message,
     * "The predator cries out in glorious defeat to {player}!".
     * @param player
     */
    public void defeat(Player player) {
        System.out.println("The predator cries out in glorious defeat to " + player + "!") ;
    }

    /**
     * The string representation of the predator is simply, "Predator".
     * @return String
     */
    @Override
    public String toString() {
        return "Predator" ;
    }

    /**
     * If the predator wins, they display the message,
     * "The predator yells out in triumphant victory over {player}!".
     * @param player
     */
    public void victory(Player player) {
        System.out.println("The predator yells out in triumphant victory over " + player + "!") ;
    }
}
