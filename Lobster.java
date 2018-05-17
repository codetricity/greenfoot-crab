import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Animal
{
    public void act() 
    {
        turnAtEdge();
        randomTurn();
        lookForSheep();
        move();
    }
    
    public void turnAtEdge(){
        if (isAtEdge()){
            turn(17);
        }
    }
    
    public void randomTurn(){
        if (Greenfoot.getRandomNumber(100) < 10){
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
    }
    
    public void lookForSheep(){
        if (canSee(DadSheep.class)) {
            eat(DadSheep.class);
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
    }
}
