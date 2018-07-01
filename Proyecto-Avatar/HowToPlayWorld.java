import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase del mundo de las instrucciones del juego
 * 
 * @author JSHC 
 * @version 1.0
 */
public class HowToPlayWorld extends World
{
    /**
     * Constructor del mundo de HowToPlayWorld
     */
    public HowToPlayWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    /**
     * Metodo actuar del mundo HowToPlayWorld
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            AvatarIntro w = new AvatarIntro();
            Greenfoot.setWorld(w);
        }
    }
}
