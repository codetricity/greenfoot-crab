import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        populateWorld();
    }
    
    public void populateWorld(){
        addObject(new DadSheep(), 150, 100);
        createLobster();
        createWorm();
    }
    
    public void createLobster(){
        addObject(new Lobster(), 200, 300);
        addObject(new Lobster(), 400, 200);
        addObject(new Lobster(), 500, 400);
    }
    
    public void createWorm(){
        for (int i =0; i<10; i++) {
            int x = Greenfoot.getRandomNumber(560);
            int y = Greenfoot.getRandomNumber(560);
            addObject(new Worm(), x, y);
        }
        
    }
}