// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Ladybug extends Actor
{

    /**
     * Act - do whatever the Hero wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (isGameWon()) {
            transitionToWinningScreen();
        }
    }

    /**
     * Moves the Ladybug around the world
     */
    public void moveAndTurn()
    {
        move(6);
        if (Greenfoot.isKeyDown("right")) {
            turn(3);
        }
        if (Greenfoot.isKeyDown("left")) {
            move(-3);
        }
    }

    /**
     * It states if its true when the ladybug touches the finish location it 
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (world.getObjects(FinishLocation.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Transitions to the Winning Screen when the Ladybug reaches, touches, the final location.
     */
    public void transitionToWinningScreen()
    {
        World winningScreen =  new  WinningScreen();
        Greenfoot.setWorld(winningScreen);
        Greenfoot.playSound("win.wav");
    }
}
