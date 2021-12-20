import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Music_player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MusicPlayer extends Actor
{
    private boolean musicPlayed;
    private GreenfootSound music0 = new GreenfootSound("track1.wav");
    private GreenfootSound music1 = new GreenfootSound("track2.wav");
    private GreenfootSound music2 = new GreenfootSound("track3.wav");
    private GreenfootSound music3 = new GreenfootSound("track4.wav");
    private GreenfootSound music4 = new GreenfootSound("track5.wav");
    private GreenfootSound music5 = new GreenfootSound("track6.wav");
    private GreenfootSound music6 = new GreenfootSound("track7.wav");
    private GreenfootSound music7 = new GreenfootSound("track8.wav");
    private GreenfootSound music8 = new GreenfootSound("track9.wav");
    private GreenfootSound music9 = new GreenfootSound("track10.wav");
    private GreenfootSound music10 = new GreenfootSound("BatHell.mp3");
    
    public MusicPlayer(boolean lvl1)
    {
        if(lvl1 ==true)
        {
            setImage("Music.png");
        }
        if(lvl1 == false)
        {
            setImage("tiny.png");
        }
    }
    /**
     * Act - do whatever the Music_player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKeys();
    }
    /**
     * : Music by Marllon Silva (xDeviruchi)
     */   
    public void checkKeys()
    {
        if (Greenfoot.isKeyDown("0"))
        {
            Track1();
        }
        if (Greenfoot.isKeyDown("1"))
        {
            Track2();
        }
        if (Greenfoot.isKeyDown("2"))
        {
            Track3();
        }
        if (Greenfoot.isKeyDown("3"))
        {
            Track4();
        }
        if (Greenfoot.isKeyDown("4"))
        {
            Track5();
        }
        if (Greenfoot.isKeyDown("5"))
        {
            Track6();
        }
        if (Greenfoot.isKeyDown("6"))
        {
            Track7();
        }
        if (Greenfoot.isKeyDown("7"))
        {
            Track8();
        }
        if (Greenfoot.isKeyDown("8"))
        {
            Track9();
        }
        if (Greenfoot.isKeyDown("9"))
        {
            Track10();
        }
        if (Greenfoot.isKeyDown("O"))
        {
            stopMusic();
        }
    }
    public void stopMusic()
    {
            music0.stop();
            music1.stop();
            music2.stop();
            music3.stop();
            music4.stop();
            music5.stop();
            music6.stop();
            music7.stop();
            music8.stop();
            music9.stop();
            music10.stop();
    }
        public void Track1()
    {
        if(!music0.isPlaying())
        {
            music0.playLoop();
            musicPlayed = true;
        }
    }
        public void Track2()
    {
        if(!music1.isPlaying())
        {
            music1.playLoop();
            musicPlayed = true;
        }
    }
        public void Track3()
    {
        if(!music2.isPlaying())
        {
            music2.playLoop();
            musicPlayed = true;
        }
    }
    public void Track4()
    {
        if(!music3.isPlaying())
        {
            music3.playLoop();
            musicPlayed = true;
        }
    }
    public void Track5()
    {
        if(!music4.isPlaying())
        {
            music4.playLoop();
            musicPlayed = true;
        }
    }
    public void Track6()
    {
        if(!music5.isPlaying())
        {
            music5.playLoop();
            musicPlayed = true;
        }
    }
    public void Track7()
    {
        if(!music6.isPlaying())
        {
            music6.playLoop();
            musicPlayed = true;
        }
    }
    public void Track8()
    {
        if(!music7.isPlaying())
        {
            music7.playLoop();
            musicPlayed = true;
        }
    }
    public void Track9()
    {
        if(!music8.isPlaying())
        {
            music8.playLoop();
            musicPlayed = true;
        }
    }
    public void Track10()
    {
        if(!music9.isPlaying())
        {
            music9.playLoop();
            musicPlayed = true;
        }
    }
    public void Track11()
    {
        if(!music10.isPlaying())
        {
            music10.playLoop();
            musicPlayed = true;
        }
    }
}
