/**
 * Interface to for buttons to perform actions and 
 * the receivers of their actions
 * @author (Harsh Sheth) 
 * @version (a version number or a date)
 */
public interface ButtonAction  
{
    public void performButtonAction();
    public void setReceiver(Receiver receiver);
}
