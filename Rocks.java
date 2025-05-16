import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *  Eatable rock
 * 
 * @Lionson and Moses 
 * @today
 */
public class Rocks extends Actor
{
    int speed = 1;
    public Rocks()
    {
        setImage("images/rock.png");
    }
    public void act()
    {
        setLocation(getX(), getY() + speed);
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.endGame();
            world.removeObject(this);
        }
    }
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
