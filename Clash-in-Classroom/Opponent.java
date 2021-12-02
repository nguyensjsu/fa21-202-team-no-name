import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Opponent here.
 * 
 * @author (Harsh Sheth) 
 * @version (a version number or a date)
 */
public class Opponent extends GameActors
{
    public static boolean direction=true;
    /**
     * Act - do whatever the Opponent wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
    }
    
    public void move()
    {
        if(direction==true)
        {
           setLocation(getX(),getY()-1);
           validateMovement();
        }
        if(direction==false)
        {
           setLocation(getX(),getY()+1);
           validateMovement();
        }
    }
    
    public void validateMovement()
   {
       if(getY() == 201)
       {
           direction=false;                  
       }
       if(getY() == 549)
       {
           direction=true;                  
       }
   }
}
