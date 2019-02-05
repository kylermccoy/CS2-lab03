/**
 * Bunker.java
 * Lab 3
 * Author: Kyle McCoy   krm7269@rit.edu
 */
package rit.stu.act2;

import rit.stu.act1.QueueNode ;

/**
 * class to simulator the bunker
 * holds a queue of soldiers
 */
public class Bunker {
    private QueueNode<Soldier> bunker ; // the queue of soldiers
    private int numSoldiers ; // the number of soldiers in the bunker

    /**
     * create the bunker
     * @param numSoldiers
     */
    public Bunker(int numSoldiers) {
        this.numSoldiers = numSoldiers ;
        this.bunker = new QueueNode<Soldier>()  ;
        for (int i = 1; i <= numSoldiers; i++) {
            this.bunker.enqueue(new Soldier(i));
        }
    }

    /**
     * remove the next soldier from the front of the bunker to be deployed on
     * a rescue attempt
     * @return a soldier class
     */
    public Soldier deployNextSoldier() {
        assert !this.bunker.empty() ;
        this.numSoldiers-- ;
        return this.bunker.dequeue() ;
    }

    /**
     * add a new soldier to the end of the bunker
     * @param soldier
     */
    public void fortifySoldiers(Soldier soldier) {
        this.bunker.enqueue(soldier) ;
        this.numSoldiers++ ;
    }

    /**
     * get how many soldiers are in the bunker
     * @return int of soldiers in the bunker
     */
    public int getNumSoldiers() {
        return this.numSoldiers ;
    }

    /**
     * checks if there are soldiers in the bunker
     * @return boolean
     */
    public boolean hasSoldiers() {
        return (this.numSoldiers != 0) ;
    }
}
