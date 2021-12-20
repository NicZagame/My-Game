import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelE extends World
{

    /**
     * Constructor for objects of class LevelE.
     * 
     */
    public LevelE()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(832, 468, 1); 
        setBackground("Background.png");
        
        Platform2 platform1 = new Platform2();
        addObject(platform1,96, 367);
        
        Platform2 platform2 = new Platform2();
        addObject(platform2, 255, 367);
        
        Platform2 platform3 = new Platform2();
        addObject(platform3, 454, 367);
        
        Platform2 platform4 = new Platform2();
        addObject(platform4, 646, 367);
        
        Platform2 platform5 = new Platform2();
        addObject(platform5, 830, 367);
        
        Platform2 platform6 = new Platform2();
        addObject(platform6, 300, 200);
        
        shigginsduck shigd = new shigginsduck();
        addObject(shigd, 304,146);
        
        MusicPlayer music = new MusicPlayer(false);
        addObject(music, 335,102);
        
        Serai serai = new Serai(music);
        addObject(serai, 82, 314);
        
        Shiggins shig = new Shiggins();
        addObject(shig,792, 291);
    }
}
