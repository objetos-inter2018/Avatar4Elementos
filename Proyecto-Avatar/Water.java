import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que forma parte de los elementos
 * 
 * @author JSHC 
 * @version 1.0
 */
public class Water extends Element
{
    /**
     * Metodo para que Water tenga movimiento
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