import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{

    /**
     * Constructor for objects of class Level_3.
     * 
     */
    public Level3()
    {    
        super(1337, 800, 1); 
        setBackground("Sky.jpg");
        
        Ground ground0 = new Ground();
        addObject(ground0, 197, 756);
        
        Ground ground1 = new Ground();
        addObject(ground1, 594, 756);

        Ground ground2 = new Ground();
        addObject(ground2, 988, 756);

        Ground ground3 = new Ground();
        addObject(ground3, 1311, 756);
        
        MusicPlayer music = new MusicPlayer(false);
        addObject(music, 335,102);
        
        Serai serai = new Serai(music);
        addObject(serai, getHeight()/2, 540);
        
        BOSS boss = new BOSS();
        addObject(boss, 1113, 585);
        
        End end = new End();
        addObject(end,951,401);
        

        
        
        
        
        
        
        
        
    }
}
