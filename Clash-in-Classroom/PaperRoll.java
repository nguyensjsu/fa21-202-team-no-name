import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PaperRoll here.
 * 
 * @author (Harsh Sheth) 
 * @version (a version number or a date)
 */
public class PaperRoll extends GameActors implements Match
{
    /**
     * Act - do whatever the PaperRoll wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkGameStatus();
        move(5);
        if(isTouching(Opponent.class))
        {
            getWorld().removeObject(this);
            notifyObservers();
        }
        ScoreCardDisplay.getInstance().updateDisplay();
    }
    
    public void notifyObservers()
    {
        ScoreCard.getInstance().updateScore();
    }
    
    public void checkGameStatus(){
        if(ScoreCard.getInstance().getScore() == 500){
            ((GameWorld)getWorld()).doGameOver();
        }
    }
}
