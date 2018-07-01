import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase del personaje principal del juego
 * 
 * @author JSHC
 * @version 1.0
 */
public class Avatar extends Actor
{
    private int mundo;
    /**
     * Constructor del avatar
     * @param m recibe el mundo del nivel en el que esta
     */
    public Avatar(int m){
        mundo = m;
    }
    /**
     * Metodo de para actuar del personaje
     */
    public void act() 
    {
        keys();
        catchElements();
        catchBonus();
        catchEnemy();
    }  
    /**
     * Metodo para agregar el moviemiento del personaje a traves del teclado
     */
    public void keys()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            if(this.getX()>35){
                this.setLocation(this.getX()-5,this.getY());
                this.setImage("Aang (1).png");
            }
            else
                this.setImage("Aang-PNG-Transparent-Image (1).png");
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            if(this.getX()<565)
                this.setLocation(this.getX()+5, this.getY());
            this.setImage("Aang (1).png");
        }
        else
            this.setImage("Aang-PNG-Transparent-Image (1).png");            
        if(Greenfoot.isKeyDown("up"))
        {
            this.setLocation(this.getX(),this.getY()-50);
            Greenfoot.delay(1);
            this.setLocation(this.getX(),this.getY()+50);
        }
    }
    /**
     * Metodo para inidcar lo que hace en caso de tocar los elementos
     */
    public void catchElements()
    {
        if(this.isTouching(Water.class)){
            this.removeTouching(Water.class);
            if(mundo==1)
            {
                Nivel1 w1 = (Nivel1)this.getWorld();
                w1.decreaseWater();
            } else if(mundo==2)
                    {
                        Nivel2 w2 = (Nivel2)this.getWorld();
                        w2.decreaseWater();
                    }
                    else if(mundo==3)
                        {
                            Nivel3 w3 = (Nivel3)this.getWorld();
                            w3.decreaseWater();
                        }
        }
        if(this.isTouching(Earth.class)){
            this.removeTouching(Earth.class);
            if(mundo==1)
            {
                Nivel1 w1 = (Nivel1)this.getWorld();
                w1.decreaseEarth();
            } else if(mundo==2)
                    {
                        Nivel2 w2 = (Nivel2)this.getWorld();
                        w2.decreaseEarth();
                    }
                    else if(mundo==3)
                        {
                            Nivel3 w3 = (Nivel3)this.getWorld();
                            w3.decreaseEarth();
                        }
        }
        if(this.isTouching(Air.class)){
            this.removeTouching(Air.class);
            if(mundo==1)
            {
                Nivel1 w1 = (Nivel1)this.getWorld();
                w1.decreaseAir();
            } else if(mundo==2)
                    {
                        Nivel2 w2 = (Nivel2)this.getWorld();
                        w2.decreaseAir();
                    }
                    else if(mundo==3)
                        {
                            Nivel3 w3 = (Nivel3)this.getWorld();
                            w3.decreaseAir();
                        }
        }
        if(this.isTouching(Fire.class)){
            this.removeTouching(Fire.class);
            if(mundo==1)
            {
                Nivel1 w1 = (Nivel1)this.getWorld();
                w1.decreaseFire();
            } else if(mundo==2)
                    {
                        Nivel2 w2 = (Nivel2)this.getWorld();
                        w2.decreaseFire();
                    }
                    else if(mundo==3)
                        {
                            Nivel3 w3 = (Nivel3)this.getWorld();
                            w3.decreaseFire();
                        }
        }
    }
    /**
     * Metodo para inidcar lo que hace en caso de tocar los bonus
     */
    public void catchBonus()
    {
        if(this.isTouching(Reduction.class)){
            this.removeTouching(Reduction.class);
            if(mundo==1)
            {
                Nivel1 w1 = (Nivel1)this.getWorld();
                w1.decreaseElements();
            } else if(mundo==2)
                    {
                        Nivel2 w2 = (Nivel2)this.getWorld();
                        w2.decreaseElements();
                    }
                    else if(mundo==3)
                        {
                            Nivel3 w3 = (Nivel3)this.getWorld();
                            w3.decreaseElements();
                        }
        }
        if(this.isTouching(LifePlus.class)){
            this.removeTouching(LifePlus.class);
            if(mundo==1)
            {
                Nivel1 w1 = (Nivel1)this.getWorld();
                w1.increaseLife();
            } else if(mundo==2)
                    {
                        Nivel2 w2 = (Nivel2)this.getWorld();
                        w2.increaseLife();
                    }
                    else if(mundo==3)
                        {
                            Nivel3 w3 = (Nivel3)this.getWorld();
                            w3.increaseLife();
                        }
        }
        if(this.isTouching(Quick.class)){
            this.removeTouching(Quick.class);
            if(mundo==1){
                Nivel1 w = (Nivel1)this.getWorld();
                w.fullLife();
            }else if(mundo==2){
                Nivel2 w = (Nivel2)this.getWorld();
                w.fullLife();
            }else if(mundo==3){
                Nivel3 w = (Nivel3)this.getWorld();
                w.fullLife();
            }
        }
    }   
    /**
     * Metodo para inidcar lo que hace en caso de tocar los enemigos
     */
    public void catchEnemy()
    {
        if(this.isTouching(Magic.class)){
            this.removeTouching(Magic.class);
            if(mundo==1){
                Nivel1 w = (Nivel1)this.getWorld();
                w.increaseElements();
            }else if(mundo==2){
                Nivel2 w = (Nivel2)this.getWorld();
                w.increaseElements();
            }else if(mundo==3){
                Nivel3 w = (Nivel3)this.getWorld();
                w.increaseElements();
            }
        }
        if(this.isTouching(Bomb.class)){
            if(mundo==1){
                Nivel1 w = (Nivel1)this.getWorld();
                w.removeLife();
            }else if(mundo==2){
                Nivel2 w = (Nivel2)this.getWorld();
                w.removeLife();
            }else if(mundo==3){
                Nivel3 w = (Nivel3)this.getWorld();
                w.removeLife();
            }
        }
        if(this.isTouching(Ray.class)){
            this.removeTouching(Ray.class);
           if(mundo==1){
                Nivel1 w = (Nivel1)this.getWorld();
                w.decreaseLife();
            }else if(mundo==2){
                Nivel2 w = (Nivel2)this.getWorld();
                w.decreaseLife();
            }else if(mundo==3){
                Nivel3 w = (Nivel3)this.getWorld();
                w.decreaseLife();
            }
        }
    }
}