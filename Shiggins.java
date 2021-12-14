import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shiggins here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shiggins extends Easteregg
{
    GifImage shig = new GifImage("Shig.gif");
    /**
     * Act - do whatever the Shiggins wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(shig.getCurrentImage());
    }
    
}
