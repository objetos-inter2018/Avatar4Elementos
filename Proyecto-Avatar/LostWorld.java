import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LostWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LostWorld extends World
{

    /**
     * Constructor for objects of class LostWorld.
     * 
     */
    public LostWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            AvatarIntro w = new AvatarIntro();
            Greenfoot.setWorld(w);
        }
    }
}
