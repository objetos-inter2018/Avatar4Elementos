import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase del nivel 2
 * 
 * @author JSHC
 * @version 1.0 
 */
public class Nivel2 extends World
{
    Avatar aang;
    Counter water;
    Counter earth;
    Counter air;
    Counter fire;
    Counter life;
     /**
      * Constructor del nivel 2
      * 
      */
    public Nivel2()
    {    
        super(600, 400, 1, false); 
        aang = new Avatar(2);
        this.addObject(aang, 300, 335);
        
        counters();
    }
    /**
     * Metodo para el actuar del nivel 2
     */
    public void act()
    {
        addElements();
        addBonus();
        addEnemy();
    }
    /**
     * Metodo que crea, agrega e inicializa los contadores de elementos y de la vida
     */
    public void counters()
    {
        int elements = 20;
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
    /**
     * Metodo que crea y agrega los elementos
     */
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
    /**
     * Metodo que crea y agrega los bonus
     */
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
    /**
     * Metodo que crea y agrega los enemigos
     */
    public void addEnemy()
    {
        if(Greenfoot.getRandomNumber(2000)<2){
            int aleatorio = Greenfoot.getRandomNumber(550)+25;
            Magic m = new Magic();
            this.addObject(m, aleatorio, -25);
        }
        if(Greenfoot.getRandomNumber(2000)<6){
            int aleatorio = Greenfoot.getRandomNumber(550)+25;
            Ray r = new Ray();
            this.addObject(r, aleatorio, -25);
        }
        if(Greenfoot.getRandomNumber(2000)<4){
            int aleatorio = Greenfoot.getRandomNumber(550)+25;
            Bomb b = new Bomb();
            this.addObject(b, aleatorio, -25);
        }
    }
    /**
     * Metodo que decrementa el elemento agua
     */
    public void decreaseWater()
    {
        int newValue = water.getValue() - 1 ;
        if(water.getValue()>0)
            water.setValue(newValue);
        checkElements();
    }
    /**
     * Metodo que decrementa el elemento fuego
     */
    public void decreaseFire()
    {
        int newValue = fire.getValue() - 1 ;
        if(fire.getValue()>0)
           fire.setValue(newValue);
        checkElements();
    }
    /**
     * Metodo que decrementa el elemento tierra
     */
    public void decreaseEarth()
    {
        int newValue = earth.getValue() - 1 ;
        if(earth.getValue()>0)
            earth.setValue(newValue);
        checkElements();
    }
    /**
     * Metodo que decrementa el elemento aire
     */
    public void decreaseAir()
    {
        int newValue = air.getValue() - 1 ;
        if(air.getValue()>0)
            air.setValue(newValue);
        checkElements();
    }
    /**
     * Metodo que incrementa la vida del jugador
     */
    public void increaseLife()
    {
        int actualLife = life.getValue();
        if(life.getValue() <= 85)
        {
            life.setValue(actualLife +15);
        }
    }
    /**
     * Metodo que decrementa cierto numero de cada elemento
     */
    public void decreaseElements()
    {
        if(air.getValue() >= 5 && water.getValue() >= 5 && fire.getValue() >= 5 && earth.getValue() >= 5 )
        {
            int dec = 5;
            air.setValue(air.getValue()-dec);
            fire.setValue(fire.getValue()-dec);
            water.setValue(water.getValue()-dec);
            earth.setValue(earth.getValue()-dec);
        }
    }
    /**
     * Metodo que incrementa cierto numero de cada elemento
     */
    public void increaseElements()
    {
        if(air.getValue() <= 20-4 && water.getValue() <= 20-4 && fire.getValue() <= 20-4 && earth.getValue() <= 20-4 )
        {
            int inc = 4;
            air.setValue(air.getValue()+inc);
            fire.setValue(fire.getValue()+inc);
            water.setValue(water.getValue()+inc);
            earth.setValue(earth.getValue()+inc);
        }
    }
    /**
     * Metodo que cambia el contador vida a cero
     */
    public void removeLife()
    {
        life.setValue(0);
        checkLife();
    }
    /**
     * Metodo que checa si la vida a llegado a cero
     */
    public void checkLife()
    {
        if(life.getValue() == 0)
        {
            LostWorld w;
            w = new LostWorld();
            Greenfoot.setWorld(w);
        }
    }
    /**
     * Metodo que decrementa cierto valor la vida
     */
    public void decreaseLife()
    {
        int dec = 50;
        if(life.getValue() >= 50)
            life.setValue(life.getValue() - dec);
        else 
            if(life.getValue() < 50 )
                life.setValue(0);
        checkLife();
    }
    /**
     * Metodo que checa si los contadores de los elementos han llegado a cero
     */
    public void checkElements()
    {
        Nivel3 w;
        if(air.getValue() == 0 && water.getValue() == 0 && fire.getValue() == 0 & earth.getValue() == 0)
        {
             w = new Nivel3();
             Greenfoot.setWorld(w);
        }
    }
    /**
     * Metodo que llena el contador vida
     */
    public void fullLife()
    {
        life.setValue(100);
    }
}
