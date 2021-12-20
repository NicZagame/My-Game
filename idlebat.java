import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class idlebat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class idlebat extends Obstactles
{
    GifImage idle = new GifImage("IdleBat.gif");
    /**
     * Act - do whatever the idlebat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(idle.getCurrentImage());
    }
}
