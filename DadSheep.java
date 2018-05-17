import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class DadSheep extends Animal
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    
    public DadSheep() {
        image1 = new GreenfootImage("sheep.png");
        image2 = new GreenfootImage("sheep2.png");
        setImage(image1);
    }
    
    public void act()
    {
        lookForWorm();
        checkKeypress();
        animate();
        move();
    }
    
    public void lookForWorm() {
        if (canSee(Worm.class)){
            eat(Worm.class);
            Greenfoot.playSound("slurp.wav");
        }   
    }
    
    public void checkKeypress(){
        if (Greenfoot.isKeyDown("left")) {
            turn(-4);
        } else if (Greenfoot.isKeyDown("right")) {
            turn(4);
        }
    }
    
    public void animate() {
        if (getImage() == image1) {
            setImage(image2);
        } else {
            setImage(image1);
        }
    }

}


