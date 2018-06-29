import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Water here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Water extends Element
{
    /**
     * Act - do whatever the Water wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int alt = Greenfoot.getRandomNumber(2)+1;
        if(alt==1)
        {
            setLocation(getX()+30,getY()+5);
        }
        else
            setLocation(getX()-25, getY()+5);
    }
}