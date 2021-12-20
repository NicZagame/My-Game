import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class minimush here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Minimush extends Obstactles
{
   GifImage mush = new GifImage("MiniMush.gif");
    /**
     * Act - do whatever the Mushroom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(mush.getCurrentImage());
    }
}
