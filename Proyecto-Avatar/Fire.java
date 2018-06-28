import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fire extends Element
{
    /**
     * Act - do whatever the Fire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Quick q;
    public Fire()
    {
        q = new Quick();
    }
    public void act() 
    {
        if(q.prueba1())
            move1();
        else 
            move2();  
    }
    public void move1()
    {
        this.setLocation(getX(), getY()+4);
    }
    public void move2()
    {
        this.setLocation(getX(), getY()+2);
    }
}