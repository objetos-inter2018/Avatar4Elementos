import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase principal de los Bonus
 * 
 * @author JSHC
 * @version 1.0
 */
abstract public class Bonus extends Actor
{
    /**
     * Metodo para actuar que hereda de actor
     */
    abstract public void act();
    /**
     * Metodo de movimiento de los Bonus
     */
    public void move()
    {
        this.setLocation(getX(), getY()+5);
    }
}
