import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private FightButton fightButton;
    private FightAction fightAction;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 750, 1,false); 
        GreenfootImage bg = new GreenfootImage("ClashInClassroom.jpg");
        bg.scale(getWidth(),getHeight());
        setBackground(bg);
        fightButton = new FightButton();
        fightAction = new FightAction();
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(fightButton,459,494);
        fightButton.setCommand(fightAction);
        fightAction.setReceiver(
            new Receiver()
            {
                public void doAction()
                {
                    if(Greenfoot.mouseClicked(fightButton))
                    {
                        Greenfoot.setWorld(new GameWorld());
                    }
                }
            }
        );
    }
}
