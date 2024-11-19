// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class WinningScreen extends World
{

    /**
     * It sizes the background and displays the font
     */
    public WinningScreen()
    {
        super(800, 600, 1);
        showTextWithBigBlackFont("Congratulations, You Win!", 180, 200);
    }

    /**
     * It creates the text
     */
    public void showTextWithBigBlackFont(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new Font(50);
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString(message, x, y);
    }
}
