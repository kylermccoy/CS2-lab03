/**
 * Chopper.java
 * Lab 3
 * Author: Kyle McCoy krm7269@rit.edu
 */
package rit.stu.act2;

import rit.stu.act1.StackNode ;

/**
 * class to simulate the chopper
 */
public class Chopper {
    public static final int MAX_OCCUPANCY = 6 ; // max chopper can hold
    private StackNode<Player> chopper ; // stack of passengers
    private int numPassengers ; // number of passengers
    private int numRescued ; // number rescued

    /**
     * create the chopper with empty seats and no one rescued
     */
    public Chopper() {
        this.numPassengers = 0 ;
        this.numRescued = 0 ;
        this.chopper = new StackNode<Player>() ;
    }

    /**
     * board a passenger onto the chopper
     * @param player person being boarded
     */
    public void boardPassenger(Player player) {
        this.chopper.push(player) ;
        this.numPassengers++ ;
        System.out.println(player.toString() + " boards the chopper!") ;
        if (this.isFull()) {
            this.rescuePassengers() ;
        }
    }

    /**
     * get total number of passengers rescued
     * @return int of passengers rescued
     */
    public int getNumRescued() {
        return this.numRescued ;
    }

    /**
     * is the chopper empty
     * @return boolean
     */
    public boolean isEmpty() {
        return this.chopper.empty() ;
    }

    /**
     * is the chopper full
     * @return boolean
     */
    public boolean isFull() {
        return this.numPassengers == MAX_OCCUPANCY ;
    }

    /**
     * when the chopper is full take the passengers to safety
     */
    public void rescuePassengers() {
        while(!this.isEmpty()) {
            Player player = this.chopper.pop() ;
            this.numRescued++ ;
            System.out.println("Chopper transported " + player.toString() + " to safety!") ;
        }
        this.numPassengers = 0 ;
    }
}
