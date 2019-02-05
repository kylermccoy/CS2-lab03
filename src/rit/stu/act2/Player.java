/**
 * Player.java
 * Lab 3
 * Author: Kyle McCoy krm7269@rit.edu
 */
package rit.stu.act2;

/**
 * interface for Hostage, Guerilla, Predator, and Soldier classes
 */
public interface Player {
    public void defeat(Player player) ;
    public void victory(Player player) ;
}
