/**
 * Write a description of class ReturnAction here.
 * 
 * @author (Harsh Sheth) 
 * @version (a version number or a date)
 */
public class ReturnAction implements ButtonAction
{
    Receiver returnReceiver;
    
    public void setReceiver(Receiver receiver)
    {
        this.returnReceiver = receiver;
    }
    public void performButtonAction()
    {
        returnReceiver.doAction();
    }
}
