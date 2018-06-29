import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Aire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Air extends Element
{
    /**
     * Act - do whatever the Aire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { 
        this.setLocation(getX()-7, getY()+3);
        this.setLocation(getX()+5, getY()+3);
    }
}
