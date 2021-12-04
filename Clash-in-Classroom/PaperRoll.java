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
        if (ScoreCard.getInstance().getScore() == 500) {
            GameEnd gameEnd = new GameEnd("Hurray! You won with a score of 500!");
            getWorld().addObject(gameEnd, getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            Greenfoot.stop();
        }
        move(5);
        if (this.getX() > 900) {
            if (ScoreCard.getInstance().getPaperBallsLeft() == 0) {
                if (ScoreCard.getInstance().getScore() < 500) {
                    GameEnd gameEnd = new GameEnd("Sorry! You are out of GUMBALLS... Oops... Paper Balls!");
                    getWorld().addObject(gameEnd, getWorld().getWidth() / 2, getWorld().getHeight() / 2);
                    Greenfoot.stop();
                }
            }
        }
        if (isTouching(Opponent.class)) {
            getWorld().removeObject(this);
            notifyObservers();
        }
        ScoreCardDisplay.getInstance().updateDisplay();
    }

    public void notifyObservers() {
        ScoreCard.getInstance().updateScore();
    }

}
