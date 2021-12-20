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
        addObject(platform2, 692, 710);
        
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
        addObject(platform8, 733, 249);
        
        Platform platform9 = new Platform();
        addObject(platform9, 978, 402);
        
        Platform platform10 = new Platform();
        addObject(platform10, 1237, 244);
        
        Portal2 portal2 = new Portal2();
        addObject(portal2,48,100);
        
        MusicPlayer music = new MusicPlayer(false);
        addObject(music, 335,102);
        
        Mushroom mush0 = new Mushroom();
        addObject(mush0,450,529);
        
        Mushroom mush1 = new Mushroom();
        addObject(mush1,1071,636);
        
        Mushroom mush2 = new Mushroom();
        addObject(mush2,1318,515);
        
        Mushroom mush3 = new Mushroom();
        addObject(mush3,918,370);
        
        Minimush mush4 = new Minimush();
        addObject(mush4, 1313, 210);
        
        Tortle spikyboi0 = new Tortle();
        addObject(spikyboi0, 765,672);
        
        Tortle spikyboi1 = new Tortle();
        addObject(spikyboi1, 662,212);
        
        
        
        
        
        
        
        
        
        Serai serai= new Serai(music);
        addObject(serai, 79, 622);
        
    }
    
}