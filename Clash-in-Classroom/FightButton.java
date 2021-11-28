import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fightButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FightButton extends Button implements HitButton
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
    public void hitButton()
    {
        fightButtonAction.performButtonAction();
    }
    public void setAction(ButtonAction action)
    {
        this.fightButtonAction = action;
    }
}
