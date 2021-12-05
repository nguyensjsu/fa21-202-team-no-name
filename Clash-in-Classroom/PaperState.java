import greenfoot.*;
/**
 * Write a description of class PaperState here.
 * 
 * @author (Harsh Sheth) 
 * @version (a version number or a date)
 */
public class PaperState implements State
{
    // instance variables - replace the example below with your own
    private Fighter fighter;

    /**
     * Constructor for objects of class PaperState
     */
    public PaperState(Fighter fighter)
    {
        this.fighter = fighter;
    }

    /**
     * Creates new instance for paperRoll and initiate a throw from fighter
     * Also set count for paperLeft after throw
     */
    public void throwPaper()
    {
        World currentWorld = fighter.getWorld();
        PaperRoll paperRoll = new PaperRoll();
        currentWorld.addObject(paperRoll, fighter.getX()+fighter.getImage().getWidth()/2, fighter.getY());
        fighter.setPaperLeft();
    }
}
