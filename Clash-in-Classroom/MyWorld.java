import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Harsh Sheth)
 * @version (a version number or a date)
 */
public class MyWorld extends World {
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
    public MyWorld() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 650, 1, false);
        GreenfootImage mainImage = new GreenfootImage("ClashInClassroomUpdated.png");
        mainImage.scale(getWidth(), getHeight());
        setBackground(mainImage);
        mainSound = new GreenfootSound("bensound-ukulele.mp3");
        fightButton = new FightButton();
        fightButtonInstruction = new FightButton();
        instructionButton = new InstructionsButton();
        fightAction = new FightAction();
        instructionAction = new InstructionsAction();
        returnButton = new ReturnButton();
        returnAction = new ReturnAction();
        ScoreCard.getInstance().reset_score();
        ScoreCardDisplay.getInstance().updateDisplay();
        prepare();
    }

    public void act() {
        mainSound.playLoop();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     * It also contains button receiver's to perform actions
     */
    private void prepare() {
        addObject(fightButton, 457, 435);
        addObject(instructionButton, 85, 570);
        fightButton.setCommand(fightAction);
        instructionButton.setCommand(instructionAction);
        // Fight Button Receiver
        fightAction.setReceiver(
                new Receiver() {
                    public void doAction() {
                        if (Greenfoot.mouseClicked(fightButton) || Greenfoot.mouseClicked(fightButtonInstruction)) {
                            Greenfoot.setWorld(new GameWorld());
                        }
                    }
                });
        // Instructions Button Receiver
        instructionAction.setReceiver(
                new Receiver() {
                    public void doAction() {
                        if (Greenfoot.mouseClicked(instructionButton)) {
                            Instructions instruction = instructionButton.fetchInstructions();
                            addObject(instruction, getWidth() / 2, 395);
                            addObject(fightButtonInstruction, 655, 595);
                            addObject(returnButton, 18, 161);
                            returnButton.setCommand(returnAction);
                            fightButtonInstruction.setCommand(fightAction);
                        }
                    }
                });
        // Return Button Receiver
        returnAction.setReceiver(
                new Receiver() {
                    public void doAction() {
                        if (Greenfoot.mouseClicked(returnButton)) {
                            mainSound.stop();
                            Greenfoot.setWorld(new MyWorld());
                        }
                    }
                });
    }
}
