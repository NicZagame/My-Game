import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Enemy #1 The turtle
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tortle extends Obstactles
{
    GifImage boi = new GifImage("Spikyboi.gif");
    /**
     * Act - do whatever the Badguy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(boi.getCurrentImage());
    }
}
