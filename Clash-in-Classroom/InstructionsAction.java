/**
 * Write a description of class HelpAction here.
 * 
 * @author (Harsh Sheth) 
 * @version (a version number or a date)
 */
public class InstructionsAction implements ButtonAction 
{
    Receiver instructionsReceiver;

    /**
    * Sets the incoming receiver for instructoinsReceiver
    */
    public void setReceiver(Receiver receiver)
    {
        this.instructionsReceiver = receiver;
    }
    
    /**
    * Perform action bounded to instructionsButton
    * Calls doAction
    */
    public void performButtonAction()
    {
        instructionsReceiver.doAction();
    }
}
