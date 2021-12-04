import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionsButton here.
 * 
 * @author (Harsh Sheth) 
 * @version (a version number or a date)
 */
public class InstructionsButton extends Button implements Invoker
{
    private ButtonAction instructionsButtonAction;
    private Instructions instructions;
    
    public InstructionsButton()
    {
        instructions = new Instructions();
    }
    public Instructions fetchInstructions()
    {
        return instructions;
    }
    /**
     * Act - do whatever the InstructionsButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.act();
    }
    public void hitButton()
    {
        instructionsButtonAction.performButtonAction();
    }
    public void setCommand(ButtonAction action)
    {
        this.instructionsButtonAction = action;
    }
}
