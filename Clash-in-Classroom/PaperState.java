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
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void throwPaper()
    {
        World currentWorld = fighter.getWorld();
        PaperRoll paperRoll = new PaperRoll();
        currentWorld.addObject(paperRoll, fighter.getX()+fighter.getImage().getWidth()/2, fighter.getY());
    }
}
