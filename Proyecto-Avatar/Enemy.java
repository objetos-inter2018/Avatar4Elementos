import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase principal de los enemigos
 * 
 * @author JSHC
 * @version 1.0
 */
abstract public class Enemy extends Actor
{
    /**
     * Metodo para actuar que hereda de actor
     */
    abstract public void act();
    /**
     * Metodo de movimiento de los enemigos
     */
    public void move()
    {
        this.setLocation(getX(), getY()+8);
    }
}
