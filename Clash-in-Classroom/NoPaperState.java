/**
 * Write a description of class NoPaperState here.
 * 
 * @author (Harsh Sheth) 
 * @version (a version number or a date)
 */
public class NoPaperState implements State
{
    // instance variables - replace the example below with your own
    private Fighter fighter;

    /**
     * Constructor for objects of class NoPaperState
     */
    public NoPaperState(Fighter fighter)
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
        fighter.setPaperLeft();
    }
}
