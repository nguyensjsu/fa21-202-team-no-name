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
        /*if (ScoreCard.getInstance().getScore() == 500) {
            GameEnd gameEnd = new GameEnd("Yay! You won!");
            getWorld().addObject(gameEnd, getWorld().getWidth() / 2, getWorld().getHeight() / 2);
            Greenfoot.stop();
        }*/
        //checkWin();
        move(5);
        //checkLose();
        checkResult();
        /*if (this.getX() > 900) {
            System.out.println("out");
            if (ScoreCard.getInstance().getPaperBallsLeft() == 0) {
                if (ScoreCard.getInstance().getScore() < 500) {
                    GameEnd gameEnd = new GameEnd("Yay! You lose!");
                    getWorld().addObject(gameEnd, getWorld().getWidth() / 2, getWorld().getHeight() / 2);
                    Greenfoot.stop();
                }
            }
        }*/
        if (isTouching(Opponent.class)) {
            System.out.println("destroy");
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
            System.out.println("out");
            if (ScoreCard.getInstance().getPaperBallsLeft() == 0) {
                if (ScoreCard.getInstance().getScore() < 500) {
                    ((GameWorld)getWorld()).doLose();
                }
            }
        }
    }

    /*public void checkWin(){
        if(ScoreCard.getInstance().getScore() == 500){
            ((GameWorld)getWorld()).doWin();
        }
    }

    public void checkLose(){
        if (this.getX() > 900) {
            System.out.println("out");
            if (ScoreCard.getInstance().getPaperBallsLeft() == 0) {
                if (ScoreCard.getInstance().getScore() < 500) {
                    ((GameWorld)getWorld()).doLose();
                }
            }
        }
    }*/


}
