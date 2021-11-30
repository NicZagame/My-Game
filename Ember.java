import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Duke here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ember extends Actor
{
    private int speed = 7;
    private int vSpeed = 0;
    private int acceleration = 2;
    private int jumpStrength = 26;
    private String jump;
    
    
    
    /**
     * IMAGE CREDIT to Yuan Ag: yuan1935ag@hotmail.com
     */    
    public Ember()
    {
        this.jump = jump;
    }
    /**
     * Act - do whatever the Duke wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeys();
        checkFall();
        reset();
        
    }
    public void reset()
    {
        if (getX() >= getWorld().getWidth()-1)
        {
            setLocation(77, 540);
            vSpeed=0;
        }
        if(getY() >= 798)
        {
            setLocation(77, 540);
            vSpeed=0;
        }
    }
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            moveRight();
            setImage("Ember1.png");
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
            moveLeft();
            setImage("EmberLeft.png");
        } 
        
        if (Greenfoot.isKeyDown("space")&& onPlatform())
        {
            jump();
        } 
    }
    public void checkFall()
    {
        if(onPlatform())
        {
            vSpeed = 0;
        }
        else
        {
            fall();
        }
    }
    public boolean onPlatform()
    {
        Actor under = getOneObjectAtOffset( 0, getImage().getHeight()/2, Platform.class);
        
        return under != null;
    }
    public void detectPlatform()
    {
        for(int i = 0; i < vSpeed;i++)
        {
            Actor under = getOneObjectAtOffset( 0, getImage().getHeight()/2, Platform.class);
            if(under != null)
            {
                vSpeed = i;
        
            }
        }
    }
    public void fall()
    {
        detectPlatform();
        setLocation (getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    public void moveRight()
    {
        setLocation (getX() + speed, getY());
    }
    public void jump()
    {
        vSpeed = -jumpStrength;
        fall();
    }
    public void moveLeft()
    {
        setLocation (getX() - speed, getY());
    }
    public void mouse()
    {
        MouseInfo mi = Greenfoot.getMouseInfo();
        if (mi != null)
        {
            int buttonNumber = mi.getButton();
            int clickCount = mi.getClickCount();
            if(buttonNumber == 1 && clickCount >= 6)
            {
                Greenfoot.setWorld(new LevelE());
                
            }
            
        }
    }
    public void nextLevel()
    {
       Actor portal = getOneIntersectingObject(Portal.class); 
       if(portal == null)
       {
           
       }
       else
       {
           Greenfoot.setWorld(new Level2());
       }
    }
    
}