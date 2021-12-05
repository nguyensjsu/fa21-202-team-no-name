import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * GameEnd class displays message on screen at the end of game
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameEnd extends Actor
{
    /**
     * Act - do whatever the GameEnd wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
