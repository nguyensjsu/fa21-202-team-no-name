import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PaperRoll here.
 * 
 * @author (Harsh Sheth)
 * @version (a version number or a date)
 */
public class PaperRoll extends GameActors implements Match {
    private Delay delay;

    /**
     * Act - do whatever the PaperRoll wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        move(5);
        checkResult();
        // the win/lose message is in OngoingGame.java
        if (isTouching(Opponent.class)) {
            getWorld().removeObject(this);
            notifyObservers();
        }
        ScoreCardDisplay.getInstance().updateDisplay();
    }

    /**
    * Notifies the Observer to update the score when it's a ball in bucket
    */
    public void notifyObservers() {
        ScoreCard.getInstance().updateScore();
    }

    /**
    * Checks the score and sets win/lose state
    */
    public void checkResult(){
        // win
        if(ScoreCard.getInstance().getScore() == 500){
            ((GameWorld)getWorld()).doWin();
        }
        // lose
        if (this.getX() > 900) {
            if (ScoreCard.getInstance().getPaperBallsLeft() == 0) {
                if (ScoreCard.getInstance().getScore() < 500) {
                    ((GameWorld)getWorld()).doLose();
                }
            }
        }
    }
}
