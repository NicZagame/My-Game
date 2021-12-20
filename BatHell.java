import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BatHell here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BatHell extends World
{

    /**
     * Constructor for objects of class BatHell.
     * 
     */
    public BatHell()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1337, 900, 1); 
        
        setBackground("Hell.jpg");        
        Stone sg = new Stone();
        addObject(sg, 309,818);
        
        Stone sg1 = new Stone();
        addObject(sg1, 935,818);
        
        Stone sg2 = new Stone();
        addObject(sg2,1226,818);
        
        Stone sg3 = new Stone();
        addObject(sg3,311,76);
        
        Stone sg4 = new Stone();
        addObject(sg4,936,76);
        
        Stone sg5 = new Stone();
        addObject(sg5,1298,76);
        
        idlebat bat = new idlebat();
        addObject(bat, 60, 178);
        
        idlebat bat1 = new idlebat();
        addObject(bat1, 125, 178);
        
        idlebat bat3 = new idlebat();
        addObject(bat3, 185, 178);
        
        idlebat bat4 = new idlebat();
        addObject(bat4, 245, 178);
        
        idlebat bat5 = new idlebat();
        addObject(bat5, 305, 178);
        
        idlebat bat6 = new idlebat();
        addObject(bat6, 365, 178);
        
        idlebat bat7 = new idlebat();
        addObject(bat7, 425, 178);
        
        idlebat bat8 = new idlebat();
        addObject(bat8, 485, 178);
        
        idlebat bat9 = new idlebat();
        addObject(bat9, 545, 178);
        
        idlebat bat10 = new idlebat();
        addObject(bat10, 605, 178);
        
        idlebat bat11 = new idlebat();
        addObject(bat11, 665, 178);
        
        idlebat bat12 = new idlebat();
        addObject(bat12, 725, 178);
        
        idlebat bat13 = new idlebat();
        addObject(bat13, 785, 178);
        
        idlebat bat14 = new idlebat();
        addObject(bat14, 845, 178);
        
        idlebat bat15 = new idlebat();
        addObject(bat15, 905, 178);
        
        idlebat bat16 = new idlebat();
        addObject(bat16, 965, 178);
        
        idlebat bat17 = new idlebat();
        addObject(bat17, 1025, 178);
        
        idlebat bat18 = new idlebat();
        addObject(bat18, 1085, 178);
        
        idlebat bat19 = new idlebat();
        addObject(bat19, 1145, 178);
        
        idlebat bat20 = new idlebat();
        addObject(bat20, 1205, 178);
        
        idlebat bat21 = new idlebat();
        addObject(bat21, 1265, 178);
        
        BigBat big = new BigBat();
        addObject(big, 1002, 515);
        
        
        MusicPlayer music = new MusicPlayer(false);
        addObject(music, 335,102);
        
        Serai serai = new Serai(music);
        addObject(serai, 87, 624);
        
    
    }
}   
