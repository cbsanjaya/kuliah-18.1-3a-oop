import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Semut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Semut extends Actor
{
    /**
     * Act - do whatever the Semut wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if ( Greenfoot.isKeyDown("up") ) {
            move(2);
        } else
        if ( Greenfoot.isKeyDown("down") ) {
            move(-1);
        }
        
        if ( Greenfoot.isKeyDown("left") ) {
            turn(-4);
        } else
        if ( Greenfoot.isKeyDown("right") ) {
            turn(4);
        }
    }
}
