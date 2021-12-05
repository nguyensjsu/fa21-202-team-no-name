import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fighter here.
 * 
 * @author (Harsh Sheth)
 * @version (a version number or a date)
 */
public class Fighter extends GameActors {
    private PaperRoll paperRoll;
    private int paperRollsLeft;
    private State paperState;
    private State noPaperState;
    private State status = noPaperState;
    private Delay delay;
    
    /**
     * Constructor to set new instance for state of paper.
     * Also to set new instance to set delay
     */
    public Fighter() {
        paperState = new PaperState(this);
        noPaperState = new NoPaperState(this);
        delay = new Delay();
    }

    /**
     * Act - do whatever the Fighter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        paperRollsLeft = ScoreCard.getInstance().getPaperBallsLeft();
        if (Greenfoot.isKeyDown("w")) {
            if (getY() > 200)
                setLocation(getX(), getY() - 3);
        }
        if (Greenfoot.isKeyDown("s")) {
            if (getY() < 550)
                setLocation(getX(), getY() + 3);
        }
        if (paperRollsLeft > 1) {
            status = paperState;
        } else {
            status = noPaperState;
        }
        if (delay.millisecondsElapsed() > 2000) {
            if (Greenfoot.getKey() == "enter") {
                delay.shot();
                status.throwPaper();
            }
        }
    }

    /**
    * Sets the current state of paper
    */
    public void setStatus(State status) {
        this.status = status;
    }

    /**
    * Return the state of no paper
    * @return State
    */    
    public State getNoPaperState() {
        return this.noPaperState;
    }

    /**
    * Return the state of paper
    * @return State
    */   
    public State getPaperState() {
        return this.paperState;
    }

    /**
    * Set the count of Paper Left
    */   
    public void setPaperLeft() {
        ScoreCard.getInstance().setPaperBalls();
    }
}
