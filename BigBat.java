import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BigBat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BigBat extends Obstactles
{
    GifImage bigbat = new GifImage("BigBat.gif");
    /**
     * Act - do whatever the BigBat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(bigbat.getCurrentImage());
    }
}
