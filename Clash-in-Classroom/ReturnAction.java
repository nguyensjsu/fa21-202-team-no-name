/**
 * Write a description of class ReturnAction here.
 * 
 * @author (Harsh Sheth) 
 * @version (a version number or a date)
 */
public class ReturnAction implements ButtonAction
{
    Receiver returnReceiver;
    
    /**
    * Sets the incoming receiver for returnReceiver
    */
    public void setReceiver(Receiver receiver)
    {
        this.returnReceiver = receiver;
    }
    
    /**
    * Perform action bounded to returnButton
    * Calls doAction
    */
    public void performButtonAction()
    {
        returnReceiver.doAction();
    }
}
