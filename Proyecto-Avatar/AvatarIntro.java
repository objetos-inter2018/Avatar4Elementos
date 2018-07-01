import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase del mundo de inicio del juego
 * 
 * @author JSHC
 * @version 1.0
 */
public class AvatarIntro extends World
{
    ButtonHow b;
    Nivel1 n1;
    /**
     * Constructor del mundo AvatarIntro
     */
    public AvatarIntro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        b = new ButtonHow();
        this.addObject(b, 436, 345);
        this.showText("Start", 155, 340);
    }
    /**
     * Metodo actuar del mundo AvatarIntro
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            n1 = new Nivel1();
            Greenfoot.setWorld(n1);
        }
    }
}
