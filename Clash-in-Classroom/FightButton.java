import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fightButton here.
 * 
 * @author (Harsh Sheth) 
 * @version (a version number or a date)
 */
public class FightButton extends Button implements Invoker
{
    ButtonAction fightButtonAction;
    
    /**
     * Act - do whatever the fightButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.act();
    }
    
    /**
     * Used to inform the click of fightButton 
     * perform whatever action needs to be executed
     */
    public void hitButton()
    {
        fightButtonAction.performButtonAction();
    }
    
    /**
     * Used to set what action needs to be performed on clicking the fightButton button,
     * passed as a parameter
     */
    public void setCommand(ButtonAction action)
    {
        this.fightButtonAction = action;
    }
}
