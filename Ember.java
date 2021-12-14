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
    GifImage serai = new GifImage("Righthover.gif");
    GifImage serai1 = new GifImage("Lefthover.gif");
    private MusicPlayer music;
    
    
    
    /**
     * : Music by Marllon Silva (xDeviruchi)
     */
    public Ember(MusicPlayer music)
    {
        this.jump = jump;
        this.music = music;
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
        nextLevel();
        mouse();
        nextLevel2();
        Enemies();
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
            setImage(serai.getCurrentImage());
            
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
            moveLeft();
            setImage(serai1.getCurrentImage());
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
       if(portal != null)
       {
          Greenfoot.setWorld(new Level2()); 
          music.stopMusic();
       }
       
    }
    public void Enemies()
    {
       if(isTouching(Tortle.class))
       {
          setLocation(77, 540);
            vSpeed=0;
           
       }
       if(isTouching(Mushroom.class))
       {
          setLocation(77, 540);
            vSpeed=0;
       }
       
    }
    public void nextLevel2()
    {
       Actor portal2 = getOneIntersectingObject(Portal2.class); 
       if(portal2!= null)
       {
          Greenfoot.setWorld(new Level3()); 
          music.stopMusic();
       }
       
    }
    
}