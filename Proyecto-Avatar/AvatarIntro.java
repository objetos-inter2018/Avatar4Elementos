import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AvatarIntro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AvatarIntro extends World
{

    /**
     * Constructor for objects of class AvatarIntro.
     * 
     */
    ButtonHow b;
    Nivel1 n1;
    public AvatarIntro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        b = new ButtonHow();
        this.addObject(b, 436, 345);
        this.showText("Start", 155, 340);
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            n1 = new Nivel1();
            Greenfoot.setWorld(n1);
        }
    }
}
