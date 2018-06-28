import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Earth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Earth extends Element
{
    /**
     * Act - do whatever the Earth wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Quick q;
    public Earth()
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
        this.setLocation(getX()+7, getY()+3);
        this.setLocation(getX()-5, getY()+3);
    }
    public void move2()
    {    
        this.setLocation(getX()+7, getY()+1);
        this.setLocation(getX()-5, getY()+1);
    }
}
