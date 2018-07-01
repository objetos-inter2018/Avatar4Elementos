import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que forma parte de los elementos
 * 
 * @author JSHC 
 * @version 1.0
 */
public class Earth extends Element
{
    /**
     * Metodo para que Earth tenga movimiento
     */
    public void act() 
    {
        
        this.setLocation(getX()+7, getY()+3);
        this.setLocation(getX()-5, getY()+3);
    }
}
