import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld here.
 * 
 * @author (Harsh Sheth) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{
    private Fighter fighter;
    private Opponent opponent;
    private ScoreCardDisplay scd;
    /**
     * Constructor for objects of class GameWorld.
     * 
     */
    public GameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 650, 1,false);
        GreenfootImage gameImage = new GreenfootImage("classroomBackground.jpg");
        gameImage.scale(getWidth(),getHeight());
        setBackground(gameImage);
        fighter = new Fighter();
        opponent = new Opponent();
        scd = ScoreCardDisplay.getInstance();
        prepare();
    }
    
    private void prepare()
    {
        addObject(fighter,70,355);
        addObject(opponent,805,355);
        addObject(scd, 429, 77);
    }
}
