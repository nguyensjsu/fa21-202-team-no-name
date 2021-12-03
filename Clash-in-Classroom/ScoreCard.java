import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreCard here.
 * 
 * @author (Chinmay Kamerkar) 
 * @version (a version number or a date)
 */
public class ScoreCard extends Actor implements Observer
{
    private static int numPaperBalls = 7;
    private static int score = 0;
    /**
     * Act - do whatever the ScoreCard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public int getPaperBallsLeft()
    {
        return numPaperBalls;
    }
    
    public void setPaperBalls()
    {   
        if(numPaperBalls > 0) numPaperBalls -= 1;
    }
    
    public void setScore()
    {
        score += 100;
    }
    
    public int getScore()
    {
        return score;
    }
    
    public void reset_score()
    {
       numPaperBalls = 7;   
       score = 0;
    }
    
    public void act()
    {
        // Add your action code here.
    }
    
    public void updateScoreCard(GameActors subject)
    {
        setPaperBalls();
        setScore();
    }
}
