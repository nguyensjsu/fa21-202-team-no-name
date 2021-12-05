/**
 * Write a description of class FightAction here.
 * 
 * @author (Harsh Sheth) 
 * @version (a version number or a date)
 */
public class FightAction implements ButtonAction
{
    Receiver fightReceiver;
    
    /**
    * Sets the incoming receiver for fightReceiver
    */
    public void setReceiver(Receiver receiver)
    {
        this.fightReceiver = receiver;
    }
    
    /**
    * Perform action bounded to fightButton
    * Calls doAction
    */
    public void performButtonAction()
    {
        fightReceiver.doAction();
    }
}
