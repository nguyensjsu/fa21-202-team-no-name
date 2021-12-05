/**
 * Interface to click the button that will perform an action and
 * set the command for particular action
 * @author (Harsh Sheth) 
 * @version (a version number or a date)
 */
public interface Invoker  
{
    public void hitButton();
    public void setCommand(ButtonAction action);
}
