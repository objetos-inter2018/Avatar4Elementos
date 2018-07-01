import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase del mundo perdedor
 * 
 * @author JSHC 
 * @version 1.0
 */
public class LostWorld extends World
{

    /**
     * Constructor del LostWorld
     */
    public LostWorld()
    {    
        super(600, 400, 1); 
    }
    /**
     * Metodo de actua del mundo LostWorld
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
