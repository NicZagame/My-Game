import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shigginsduck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shigginsduck extends Easteregg
{
    private int timer;
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    
    
    public shigginsduck()
    {
        image1 = new GreenfootImage("duck1.png");
        image2 = new GreenfootImage("duck3.png");

        
    }
    /**
     * Act - do whatever the shigginsduck wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        timer++;
        bouncyDuck();
        shigCheck();
        
    }
    public void shigCheck()
    {
        if(getImage() == image1)
        {
            
        }
        if(getImage() == image2)
        {
            
        }
        
    }
    public void bouncyDuck()
    {
         
       if(timer >= 25)
       {
           setImage(image1);
           
       }
       if(timer >=55)
       {
           
           setImage(image2);
           timer=0;
       }
    }
    
}
