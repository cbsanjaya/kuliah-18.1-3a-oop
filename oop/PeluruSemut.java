import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PeluruSemut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PeluruSemut extends Actor
{
    /**
     * Act - do whatever the PeluruSemut wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // gerakkan peluru semut.
        move(4);
        
        if ( isAtEdge() ){
            getWorld().removeObject(this);
        } else {
            if ( isTouching(Lalat.class) ) {
            // peluru meledak
                Ledakan ledakan = new Ledakan();
            
                getWorld().addObject(ledakan, getX(), getY());
            }
        }
    }    
}
