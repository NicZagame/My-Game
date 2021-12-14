import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Portal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portal2 extends Actor
{
    GifImage portal2 = new GifImage("Portal2.gif");
    /**
     *
     * Art Created By: PixelZoink 
     *
     *
     *
     *Act - do whatever the Portal wants to do. This method is called whenever
     the 'Act' or 'Run' button gets pressed in the environment.
     */
     
    public void act()
    {
        setImage(portal2.getCurrentImage());
    }
}
