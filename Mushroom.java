import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Enemy #2 The mushroom
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mushroom extends Obstactles
{
    GifImage mush = new GifImage("Mushroom.gif");
    /**
     * Act - do whatever the Mushroom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(mush.getCurrentImage());
    }
}
