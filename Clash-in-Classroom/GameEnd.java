import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * GameEnd class displays message on screen at the end of game
 * @author Chinmay 
 * @version (a version number or a date)
 */
public class GameEnd extends Actor
{
    public void act()
    {
        // Add your action code here.
    }
    
    /**
     * A parametrized constructor of GameEnd that will set the image of GameEnd object with the message
     * @param message message to be displayed
     * @return
     */
    public GameEnd(String message) 
    {
        setImage(new GreenfootImage(message, 30, Color.WHITE, Color.BLACK));
    }   
}
