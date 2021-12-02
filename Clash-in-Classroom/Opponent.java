import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Opponent here.
 * 
 * @author (Harsh Sheth) 
 * @version (a version number or a date)
 */
public class Opponent extends GameActors
{
    public static int dir=0;
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
        if(dir==0)
        {
           setLocation(getX(),getY()-1);
           checkwalls();
        }
        if(dir==1)
        {
           setLocation(getX(),getY()+1);
           checkwalls();
        }
    }
    
    public void checkwalls()
   {
       if(getY() == 201)
       {
           setLocation(getX(),getY()+50);
           dir=1;                  
       }
       if(getY() == 549)
       {
           setLocation(getX(),getY()-50);
           dir=0;                  
       }
   }
}
