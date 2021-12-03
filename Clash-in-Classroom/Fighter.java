import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fighter here.
 * 
 * @author (Harsh Sheth) 
 * @version (a version number or a date)
 */
public class Fighter extends GameActors
{
    private PaperRoll paperRoll;
    private int paperRollsLeft;
    private State paperState;
    private State noPaperState;
    private State status = noPaperState;
    
    public Fighter()
    {
        paperState = new PaperState(this);
        noPaperState = new NoPaperState(this);
        paperRollsLeft = ScoreCard.getInstance().getPaperBallsLeft();
    }
    /**
     * Act - do whatever the Fighter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("w"))
        {
            if(getY() > 200)
                setLocation(getX(), getY()-3);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            if(getY() < 550)
                setLocation(getX(), getY()+3);
        }
        if(paperRollsLeft > 0)
        {
            status = paperState;
        }
        else
        {
            status = noPaperState;
        }
        if(Greenfoot.getKey() == "enter")
        {
            status.throwPaper();
        }
    }
    
    public void setStatus(State status) {
        this.status = status;
    }
    
    public State getNoPaperState(){
        return this.noPaperState;
    }
    
    public State getPaperState(){
        return this.paperState;
    }
    
    public void setPaperLeft()
    {
        System.out.println("reducing");
        this.paperRollsLeft -= 1;
        ScoreCard.getInstance().setPaperBalls();
    }
}
