import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1337, 800, 1); 
        setBackground("Sky.jpg");
        
        Platform platform0 = new Platform();
        addObject(platform0, 100, 668);
        
        Platform platform1 = new Platform();
        addObject(platform1, 404, 560);
        
        Platform platform2 = new Platform();
        addObject(platform2, 722, 777);
        
        Platform platform3 = new Platform();
        addObject(platform3, 993, 665);
        
        Platform platform4 = new Platform();
        addObject(platform4, 1241,542);
        
        Platform platform5 = new Platform();
        addObject(platform5, 100,158);
        
        Platform platform6 = new Platform();
        addObject(platform6, 299, 158);
        
        Platform platform7 = new Platform();
        addObject(platform7, 499, 158);
        
        Platform platform8 = new Platform();
        addObject(platform8, 760, 298);
        
        Platform platform9 = new Platform();
        addObject(platform9, 995, 220);
        
        Platform platform10 = new Platform();
        addObject(platform10, 1237, 160);
        
        Ember ember = new Ember();
        addObject(ember, getHeight()/9, 540);
        
    }
    
}