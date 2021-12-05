/**
 * Write a description of class Delay here.
 * 
 * @author (Harsh Sheth) 
 * @version (a version number or a date)
 */
public class Delay  
{
    private long lastshot = System.currentTimeMillis();
    
    /**
    * Sets the current milliseconds for current paperRoll instance
    */
    public void shot()
    {
        lastshot = System.currentTimeMillis();
    }
    
    /**
     * Returns the amount of milliseconds that have elapsed since shot()
     * was last called.  This timer runs irrespective of Greenfoot's
     * act() cycle, so if you call it many times during the same Greenfoot frame,
     * you may get different values returned.
     */
    public int millisecondsElapsed()
    {
        return (int) (System.currentTimeMillis() - lastshot);
    }
}
