// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class CannonBall extends Actor
{
    private Point2D position;
    private Vector2D velocity;
    private Vector2D acceleration;
    private static final double GRAVITY = 0.0;

    /**
     * Cannonball constructor
     */
    public CannonBall()
    {
        position = null;
        velocity =  new  Vector2D(0.0, 0.);
        acceleration =  new  Vector2D(0.0, GRAVITY);
    }

    /**
     * 
     */
    public void act()
    {
        eat();
        if (isGameOverTouchesLadyBug()) {
            transitionToGameOverScreen();
        }
    }

    /**
     * When the cannonball interescts with the ladybug it eats it
     */
    public void eat()
    {
        Actor Ladybug = getOneIntersectingObject(Ladybug.class);
        if (Ladybug != null) {
            World world = getWorld();
            world.removeObject(Ladybug);
        }
    }

    /**
     * It states if its true when the ladybug no longer appears in the world 
     */
    public boolean isGameOverTouchesLadyBug()
    {
        World world = getWorld();
        if (world.getObjects(Ladybug.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Transitions to the Game Over Screen when the cannon ball intersects with the ladybug.
     */
    public void transitionToGameOverScreen()
    {
        World gameOverScreen = getWorld();
        Greenfoot.setWorld(gameOverScreen);
        Greenfoot.playSound("lose.wav");
    }
}
