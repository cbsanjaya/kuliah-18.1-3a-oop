import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lalat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lalat extends Actor
{
    int kecepatan = 1;
    
    /**
     * Act - do whatever the Lalat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // majukan obyek ke depan.
        move(kecepatan);
        
        // digunakan untuk mendapatkan nilai acak 
        int acak = Greenfoot.getRandomNumber(11) - 5;
        
        // untuk membelokkan aktor sesuai dengan nilai acak
        turn(acak);
        
        // jika ada di pinggir World belokkan aktor 45 derajat.
        if ( isAtEdge()) {
            turn(45);
        }
        
    }
    
    public void setKecepatan(int maju)
    {
        kecepatan = maju;
    }
        
}
