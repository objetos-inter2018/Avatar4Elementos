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
    Quick q;
    Avatar aang;
    public Air()
    {
        q = new Quick();
        aang = new Avatar(5);
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
        this.setLocation(getX()-7, getY()+11);
        this.setLocation(getX()+5, getY()+11);
    }
    public void move2()
    {
        this.setLocation(getX()-7, getY()+2);
        this.setLocation(getX()+5, getY()+2);
    }
}
