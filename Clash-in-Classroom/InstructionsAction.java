/**
 * Write a description of class HelpAction here.
 * 
 * @author (Harsh Sheth) 
 * @version (a version number or a date)
 */
public class InstructionsAction implements ButtonAction 
{
    Receiver instructionsReceiver;

    public void setReceiver(Receiver receiver)
    {
        this.instructionsReceiver = receiver;
    }
    public void performButtonAction()
    {
        instructionsReceiver.doAction();
    }
}
