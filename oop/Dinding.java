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
        
        // membuat obyek lalat baru
        Lalat lalatPutih = new Lalat();
        
        // tambahkan lalat putih ke Dinding
        addObject(lalatPutih, 50, 100);
        
        // Lalat cepat = new Lalat();
        // cepat.setKecepatan(2);
        
        // addObject(cepat, 50, 200);
        
        
        
    }

}