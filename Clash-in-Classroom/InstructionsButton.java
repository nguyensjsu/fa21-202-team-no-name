import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionsButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionsButton extends Button implements Invoker
{
    ButtonAction instructoinsButtonAction;
    private Instructions instructions;
    
    public InstructionsButton()
    {
        instructions = new Instructions();
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
        instructoinsButtonAction.performButtonAction();
    }
    public void setCommand(ButtonAction action)
    {
        this.instructoinsButtonAction = action;
    }
    public Instructions fetchInstructions()
    {
        return instructions;
    }
}
