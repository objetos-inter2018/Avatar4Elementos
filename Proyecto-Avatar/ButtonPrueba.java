import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonPrueba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonPrueba extends Actor
{
    /**
     * Act - do whatever the ButtonPrueba wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Nivel1 n = new Nivel1();
            Greenfoot.setWorld(n);
        }
    }    
}
