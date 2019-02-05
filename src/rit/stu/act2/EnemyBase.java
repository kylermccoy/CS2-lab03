/**
 * EnemyBase.java
 * Lab 3
 * Author: Kyle McCoy krm7269@rit.edu
 */
package rit.stu.act2;

import rit.stu.act1.QueueNode ;
import rit.stu.act1.StackNode ;

/**
 * This class represents the enemy base. It contains a guard line of guerillas
 * that are guarding a group of hostages stored in a narrow cave with only an
 * entrance and now way for the hostages to reorder themselves.
 */
public class EnemyBase {
    private QueueNode<Guerilla> guerillas ; // the guard line of guerillas
    private StackNode<Hostage> hostages ; // the hostage stack
    private int numGuerillas ; // number of guerillas
    private int numHostages ; // number of hostages

    /**
     * Create the enemy base with a number of hostages, 1-numHostages,
     * pushed into the cave in order, and a number of guerillas, 1-numGuerillas,
     * added to the guard line in order.
     * @param numHostages number of hostages
     * @param numGuerillas number of guerillas
     */
    public EnemyBase(int numHostages, int numGuerillas) {
        this.numGuerillas = numGuerillas ;
        this.guerillas = new QueueNode<Guerilla>() ;
        for (int i =1; i <= numGuerillas; i++) {
            this.guerillas.enqueue(new Guerilla(i)) ;
        }
        this.numHostages = numHostages ;
        this.hostages = new StackNode<Hostage>() ;
        for (int i = 1; i <= numHostages; i++) {
            this.hostages.push(new Hostage(i)) ;
        }
    }

    /**
     * add guerilla to queue
     * @param guerilla guerilla to be added
     */
    private void addGuerilla(Guerilla guerilla) {
        this.guerillas.enqueue(guerilla) ;
        this.numGuerillas++ ;
    }

    /**
     * add hostage to stack
     * @param hostage hostage to be added
     */
    private void addHostage(Hostage hostage) {
        this.hostages.push(hostage) ;
        this.numHostages++ ;
    }

    /**
     * get guerilla from front of queue
     * @return guerilla
     */
    private Guerilla getGuerilla() {
        assert !this.guerillas.empty() ;
        this.numGuerillas-- ;
        return this.guerillas.dequeue() ;
    }

    /**
     * get hostage from top of stack
     * @return hostage
     */
    private Hostage getHostage() {
        assert !this.hostages.empty() ;
        this.numHostages-- ;
        return this.hostages.pop() ;
    }

    /**
     * number of guerillas
     * @return int
     */
    public int getNumGuerillas() {
        return this.numGuerillas ;
    }

    /**
     * number of hostages
     * @return int
     */
    public int getNumHostages() {
        return this.numHostages ;
    }

    /**
     * a soldier enters the base and attempts to rescue the hostage
     * @param soldier
     * @return hostage
     */
    public Hostage rescueHostage(Soldier soldier) {
        System.out.println(soldier.toString() + " enters the enemy base...") ;
        Hostage rescuee = this.hostages.pop() ;
        if (this.numGuerillas == 0) {
            this.numHostages-- ;
            return rescuee ;
        }else{
            Guerilla fighter = getGuerilla() ;
            int rand = Battlefield.nextInt(1, 100) ;
            System.out.println(soldier.toString() + " battles " + fighter.toString() + " who rolls a " + rand + ".") ;
            if (rand > fighter.CHANCE_TO_BEAT_SOLDIER) {
                soldier.victory(fighter) ;
                fighter.defeat(soldier) ;
                this.numHostages-- ;
                return rescuee ;
            }else{
                fighter.victory(soldier) ;
                soldier.defeat(fighter) ;
                this.hostages.push(rescuee) ;
                this.guerillas.enqueue(fighter) ;
                this.numGuerillas++ ;
                return null ;
            }
        }
    }
}
