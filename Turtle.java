import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A turtle who eat rocks
 * 
 * @Lionson And Moses
 * @yesterday
 */
public class Turtle extends Actor
{
    GreenfootSound ding = new GreenfootSound("ding.mp3"); 
    GreenfootImage[] flyRight = new GreenfootImage[5];
    GreenfootImage[] flyLeft = new GreenfootImage[5];  
    
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    
    public Turtle()
    {
        for(int i = 0; i< flyRight.length; i++)
        {
            flyRight[i] = new GreenfootImage("images/beefly/fly" + i + ".png");
            flyRight[i].scale(100,75);
        }
        
        for(int i = 0; i < flyLeft.length; i++)
        {
            flyLeft[i] = new GreenfootImage("images/beefly/fly" + i + ".png");
            flyLeft[i].mirrorHorizontally();
            flyLeft[i].scale(100,75);
        }
        
        animationTimer.mark();
        
        setImage(flyRight[0]);
    }
    
    //animate
    int imageIndex = 0;
    public void animateTurtle()
    {
        if(animationTimer.millisElapsed() < 100)
        {
            return;
        }
        animationTimer.mark();
        
        if(facing.equals("right"))
        {
            setImage(flyRight[imageIndex]);
            imageIndex = (imageIndex + 1) % flyRight.length;
        }
        else
        {
            setImage(flyLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % flyLeft.length;
        }

    }
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);
            facing = "left";
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(5);
            facing = "right";
        }
        
        eat();
        // animate
        
        animateTurtle();
    }
    public void eat()
    {
        //Eat and spawn
        if(isTouching(Rocks.class))
        {
            removeTouching(Rocks.class);
            MyWorld world = (MyWorld) getWorld();
            world.createRock();
            world.increaseScore();
            ding.play();
        }
    }
}
