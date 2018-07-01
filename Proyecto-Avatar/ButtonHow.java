import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que representa el boton de indicaciones de juego
 * 
 * @author JSHC 
 * @version 1.0
 */
public class ButtonHow extends Actor
{
    /**
     * Metodo para actuar que hereda de actor
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            HowToPlayWorld w = new HowToPlayWorld();
            Greenfoot.setWorld(w);
        }
    }    
}
