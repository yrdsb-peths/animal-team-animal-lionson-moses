import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Background
 * 
 * @IDK 
 * May 16
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry turtle", 150);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        setBackground("images/bricks3.jpg");
        addObject(titleLabel, getWidth()/2, 200);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    private void prepare()
    {
        Turtle turtle = new Turtle();
        addObject(turtle,908,171);
        turtle.setLocation(897,171);
        turtle.setLocation(908,216);
        Label label = new Label("Press <space> to start!", 50);
        addObject(label,480,384);
        label.setLocation(536,386);
        turtle.setLocation(900,198);
        label.setLocation(547,415);
        label.setLocation(645,348);
        label.setLocation(424,446);
        label.setLocation(424,380);
        label.setLocation(480,362);
        turtle.setLocation(935,208);
        label.setLocation(581,383);
        label.setLocation(519,407);
        Label label2 = new Label("Use \u2190 and \u2192 to move!", 50);
        addObject(label2,487,335);
        label2.setLocation(520,356);
    }
}
