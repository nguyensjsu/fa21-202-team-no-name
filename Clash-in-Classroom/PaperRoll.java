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
        if (isTouching(Opponent.class)) {
            getWorld().removeObject(this);
            notifyObservers();
        }
        ScoreCardDisplay.getInstance().updateDisplay();
    }

    public void notifyObservers() {
        ScoreCard.getInstance().updateScore();
    }

    public void checkResult(){
        if(ScoreCard.getInstance().getScore() == 500){
            ((GameWorld)getWorld()).doWin();
        }

        if (this.getX() > 900) {
            if (ScoreCard.getInstance().getPaperBallsLeft() == 0) {
                if (ScoreCard.getInstance().getScore() < 500) {
                    ((GameWorld)getWorld()).doLose();
                }
            }
        }
    }
}
