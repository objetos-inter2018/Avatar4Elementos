import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel3 extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    Avatar aang;
    Counter water;
    Counter earth;
    Counter air;
    Counter fire;
    Counter life;
    public Nivel3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(600, 400, 1, false); 
        aang = new Avatar(this,3);
        this.addObject(aang, 300, 335);
        
        counters();
    }
    public void act()
    {
        addElements();
        addBonus();
        addEnemy();
    }
    public void counters()
    {
        int elements = 25;
        water = new Counter("Water: ");
        water.setValue(elements);
        this.addObject(water, 38, 10);
        
        earth = new Counter("Earth: ");
        earth.setValue(elements);
        this.addObject(earth, 39, 34);
        
        air = new Counter("Air: ");
        air.setValue(elements);
        this.addObject(air, 128, 34);
       
        fire = new Counter("Fire: ");
        fire.setValue(elements);
        this.addObject(fire, 130, 10);
        
        life = new Counter("Aang: ");
        life.setValue(100);
        this.addObject(life, 536, 20);        
    }
    public void addElements()
    {
        if(Greenfoot.getRandomNumber(2000)<15){
            int aleatorio = Greenfoot.getRandomNumber(550)+25; // variable par que aparezcan los enemigos de manera aleatoria
            Air a1 = new Air();
            this.addObject(a1, aleatorio, -25);
        }
        if(Greenfoot.getRandomNumber(2000)<15){
            int aleatorio = Greenfoot.getRandomNumber(550)+25; // variable par que aparezcan los enemigos de manera aleatoria
            Fire f1 = new Fire();
            this.addObject(f1, aleatorio, -25);
        }
        if(Greenfoot.getRandomNumber(2000)<20){
            int aleatorio = Greenfoot.getRandomNumber(550)+25; // variable par que aparezcan los enemigos de manera aleatoria
            Water w1 = new Water();
            this.addObject(w1, aleatorio, 50);
        }
        if(Greenfoot.getRandomNumber(2000)<15){
            int aleatorio = Greenfoot.getRandomNumber(550)+25; // variable par que aparezcan los enemigos de manera aleatoria
            Earth e1 = new Earth();
            this.addObject(e1, aleatorio, -25);
        }
    }
    public void addBonus()
    {
        if(Greenfoot.getRandomNumber(2000)<2){
            int aleatorio = Greenfoot.getRandomNumber(550)+25;
            Quick q = new Quick();
            this.addObject(q, aleatorio, -25);
        }
        if(Greenfoot.getRandomNumber(2000)<2){
            int aleatorio = Greenfoot.getRandomNumber(550)+25;
            Reduction r = new Reduction();
            this.addObject(r, aleatorio, -25);
        }
        if(Greenfoot.getRandomNumber(2000)<2){
            int aleatorio = Greenfoot.getRandomNumber(550)+25;
            LifePlus l = new LifePlus();
            this.addObject(l, aleatorio, -25);
        }
    }
    public void addEnemy()
    {
        if(Greenfoot.getRandomNumber(2000)<1){
            int aleatorio = Greenfoot.getRandomNumber(550)+25;
            Magic m = new Magic();
            this.addObject(m, aleatorio, -25);
        }
        if(Greenfoot.getRandomNumber(2000)<3){
            int aleatorio = Greenfoot.getRandomNumber(550)+25;
            Ray r = new Ray();
            this.addObject(r, aleatorio, -25);
        }
        if(Greenfoot.getRandomNumber(4000)<3){
            int aleatorio = Greenfoot.getRandomNumber(550)+25;
            Bomb b = new Bomb();
            this.addObject(b, aleatorio, -25);
        }
    }
    public void decreaseWater()
    {
        int newValue = water.getValue() - 1 ;
        if(water.getValue()>0)
            water.setValue(newValue);
        checkElements();
    }
    public void decreaseFire()
    {
        int newValue = fire.getValue() - 1 ;
        if(fire.getValue()>0)
           fire.setValue(newValue);
        checkElements();
    }
    public void decreaseEarth()
    {
        int newValue = earth.getValue() - 1 ;
        if(earth.getValue()>0)
            earth.setValue(newValue);
        checkElements();
    }
    public void decreaseAir()
    {
        int newValue = air.getValue() - 1 ;
        if(air.getValue()>0)
            air.setValue(newValue);
        checkElements();
    }
    public void increaseLife()
    {
        int actualLife = life.getValue();
        if(life.getValue() <= 75)
        {
            life.setValue(actualLife + 25);
        }
    }
    public void decreaseElements()
    {
        if(air.getValue() > 5 && water.getValue() > 5 && fire.getValue() > 5 && earth.getValue() > 5 )
        {
            int dec = 5;
            air.setValue(air.getValue()-dec);
            fire.setValue(fire.getValue()-dec);
            water.setValue(water.getValue()-dec);
            earth.setValue(earth.getValue()-dec);
        }
    }
    public void increaseElements()
    {
        if(air.getValue() <= 20-5 && water.getValue() <= 20-5 && fire.getValue() <= 20-5 && earth.getValue() <= 20-5 )
        {
            int inc = 5;
            air.setValue(air.getValue()+inc);
            fire.setValue(fire.getValue()+inc);
            water.setValue(water.getValue()+inc);
            earth.setValue(earth.getValue()+inc);
        }
    }
    public void removeLife()
    {
        life.setValue(0);
        checkLife();
    }
    public void checkLife()
    {
        if(life.getValue() == 0)
        {
            LostWorld w;
            w = new LostWorld();
            Greenfoot.setWorld(w);
        }
    }
    public void decreaseLife()
    {
        int dec = 25;
        if(life.getValue() >= 25)
            life.setValue(life.getValue() - dec);
        checkLife();
    }
    public void checkElements()
    {
        Nivel3 w;
        if(air.getValue() == 0 && water.getValue() == 0 && fire.getValue() == 0 & earth.getValue() == 0)
        {
             w = new Nivel3();
             Greenfoot.setWorld(w);
        }
    }
    public int getworld(){
        return 3;
    }
}
