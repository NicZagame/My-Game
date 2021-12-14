import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1337, 800, 1); 
        setBackground("Sky.jpg");
        
        
        
        Platform platform0 = new Platform();
        addObject(platform0, 100, 668);
        
        Platform platform1 = new Platform();
        addObject(platform1, 346, 602);
        
        Platform platform2 = new Platform();
        addObject(platform2, 571, 524);
        
        Platform platform3 = new Platform();
        addObject(platform3, 784, 433);
        
        Platform platform4 = new Platform();
        addObject(platform4, 1040, 355);
        
        Platform platform5 = new Platform();
        addObject(platform5, 1239, 355);
        
        Platform platform6 = new Platform();
        addObject(platform6, 1060, 740);
        
        Portal portal = new Portal();
        addObject(portal,1290,284);
        
        MusicPlayer music = new MusicPlayer(true);
        addObject(music, 335,102);
        
        Tortle spikyboi = new Tortle();
        addObject(spikyboi,994,702);
        
        Mushroom mush = new Mushroom();
        addObject(mush,1108,696);
        
        Warning warn = new Warning();
        addObject(warn,1100,650);
        
        
        
        Ember ember = new Ember(music);
        addObject(ember, 87, 624);
        
    }
    
}
