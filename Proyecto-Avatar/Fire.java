import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que forma parte de los elementos
 * 
 * @author JSHC 
 * @version 1.0
 */
public class Fire extends Element
{
    /**
     * Metodo para que Fire tenga movimiento
     */
    public void act() 
    {
       
        this.setLocation(getX(), getY()+4);
    }
    
}