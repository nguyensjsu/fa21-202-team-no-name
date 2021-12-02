import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Harsh Sheth) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private FightButton fightButton;
    private FightButton fightButtonInstruction;
    private InstructionsButton instructionButton;
    private FightAction fightAction;
    private InstructionsAction instructionAction;
    private ReturnButton returnButton;
    private ReturnAction returnAction;
    private GreenfootSound mainSound;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 750, 1,false); 
        GreenfootImage mainImage = new GreenfootImage("ClashInClassroom.jpg");
        mainImage.scale(getWidth(),getHeight());
        setBackground(mainImage);
        mainSound = new GreenfootSound("bensound-ukulele.mp3");
        fightButton = new FightButton();
        fightButtonInstruction = new FightButton();
        instructionButton = new InstructionsButton();
        fightAction = new FightAction();
        instructionAction = new InstructionsAction();
        returnButton = new ReturnButton();
        returnAction = new ReturnAction();
        prepare();
    }
    
    public void act()
    {
        mainSound.playLoop();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(fightButton,457,500);
        addObject(instructionButton, 85, 671);
        fightButton.setCommand(fightAction);
        instructionButton.setCommand(instructionAction);
        fightAction.setReceiver(
            new Receiver()
            {
                public void doAction()
                {
                    if(Greenfoot.mouseClicked(fightButton) || Greenfoot.mouseClicked(fightButtonInstruction))
                    {
                        Greenfoot.setWorld(new GameWorld());
                    }
                }
            }
        );
        instructionAction.setReceiver(
            new Receiver()
            {
                public void doAction()
                {
                    if(Greenfoot.mouseClicked(instructionButton))
                    {
                        Instructions instruction = instructionButton.fetchInstructions();
                        addObject(instruction, getWidth()/2, 450);
                        addObject(fightButtonInstruction,655,655);
                        addObject(returnButton, 16, 216);
                        returnButton.setCommand(returnAction);
                        fightButtonInstruction.setCommand(fightAction);
                    }
                }
            }
        );
        returnAction.setReceiver(
            new Receiver()
            {
                public void doAction()
                {
                    if(Greenfoot.mouseClicked(returnButton))
                    {
                        mainSound.stop();
                        Greenfoot.setWorld(new MyWorld());
                    }
                }
            }
        );
    }
}
