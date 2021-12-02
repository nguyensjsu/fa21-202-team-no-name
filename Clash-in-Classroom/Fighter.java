import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fighter here.
 * 
 * @author (Harsh Sheth) 
 * @version (a version number or a date)
 */
public class Fighter extends GameActors
{
    private PaperRoll paperRoll;
    /**
     * Act - do whatever the Fighter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("w"))
        {
            if(getY() > 200)
                setLocation(getX(), getY()-3);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            if(getY() < 550)
                setLocation(getX(), getY()+3);
        }
        if(Greenfoot.isKeyDown("enter"))
        {
            getWorld().addObject(paperRoll, getX(), getY());
        }
    }
}
