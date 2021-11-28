/**
 * Write a description of class FightAction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FightAction implements ButtonAction
{
    Receiver fightReceiver;
    
    public void setReceiver(Receiver receiver)
    {
        this.fightReceiver = receiver;
    }
    public void performButtonAction()
    {
        fightReceiver.doAction();
    }
}
