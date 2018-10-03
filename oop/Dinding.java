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
        
        // Buat Obyek Semut dan tambahkan ke World
        Semut semut = new Semut();        
        addObject(semut, 200, 200);
        
        // Buat Obyek Lalat dan tambahkan ke World
        Lalat lalat = new Lalat();
        addObject(lalat, 400, 200);
        
    }

}
