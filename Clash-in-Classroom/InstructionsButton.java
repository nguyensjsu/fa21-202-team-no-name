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
    
    /**
     * Used to inform the click of instructionsButton 
     * perform whatever action needs to be executed
     */
    public void hitButton()
    {
        instructionsButtonAction.performButtonAction();
    }
    
    /**
     * Used to set what action needs to be performed on clicking the instructionsButton button,
     * passed as a parameter
     */
    public void setCommand(ButtonAction action)
    {
        this.instructionsButtonAction = action;
    }
}
