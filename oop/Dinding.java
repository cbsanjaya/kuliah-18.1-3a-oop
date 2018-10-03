import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dinding here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dinding extends World
{

    /**
     * Constructor for objects of class Dinding.
     * 
     */
    public Dinding()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        Semut semut = new Semut();
        
        addObject(semut, 300, 200);
        
    }

}
