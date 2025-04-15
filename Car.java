import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Car extends Actor
{
    public void act() {
        move(-10);
        
        if (getX() <= 0) {
            resetCar();
        }
        
        if (isTouching(Hero.class)){
            SadFace sadFace = new SadFace();
            getWorld().addObject (sadFace, 300, 200);
            getWorld().removeObject(this);
        }
    }
    
    public void resetCar(){
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0){
            setLocation(600, 100);
        } else {
            setLocation(600, 300);
        }
    }
}
