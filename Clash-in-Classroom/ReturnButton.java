import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ReturnButton here.
 * 
 * @author (Harsh Sheth) 
 * @version (a version number or a date)
 */
public class ReturnButton extends Button implements Invoker
{
    ButtonAction returnButtonAction;
    /**
     * Act - do whatever the ReturnButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.act();
    }
    
    /**
     * Used to inform the click of hitButton 
     * perform whatever action needs to be executed
     */
    public void hitButton()
    {
        returnButtonAction.performButtonAction();
    }
    
    /**
     * Used to set what action needs to be performed on clicking the returnButton button,
     * passed as a parameter
     */
    public void setCommand(ButtonAction action)
    {
        this.returnButtonAction = action;
    }
}
