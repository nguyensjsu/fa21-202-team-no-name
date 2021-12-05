import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * ScoreCard class is an Observer of PaperRoll and gets updated when PaperRoll is thrown
 * 
 * @author (Chinmay Kamerkar)
 * @version (a version number or a date)
 */
public class ScoreCard extends Actor implements Observer {
    private static int numPaperBalls = 8;
    private static int score = 0;
    private static ScoreCard instance;
    /**
    * Returns the singleton instance of ScoreCard 
    * @return instance
    */
    public static ScoreCard getInstance() {
        if (instance == null) {
            return new ScoreCard();
        }
        return instance;
    }

    /**
    * Returns the number of paper balls left 
    * @return  numPaperBalls
    */
    public int getPaperBallsLeft() {
        return numPaperBalls;
    }

    /**
    * Reduces the number of paper balls by 1
    * @return
    */
    public void setPaperBalls() {
        if (numPaperBalls > 0)
            numPaperBalls -= 1;
    }

    /**
    * Increases the score by 100
    * @return
    */
    public void setScore() {
        score += 100;
    }

    /**
    * Returns the current score
    * @return score
    */
    public int getScore() {
        return score;
    }

    /**
    * Resets the current score and number of paper balls
    * @return
    */
    public void reset_score() {
        numPaperBalls = 8;
        score = 0;
    }

    public void act() {
        // Add your action code here.
    }

    /**
    * reduces the number of paper balls of singleton instance by count 1
    * @return
    */
    public void updateBallsLeft() {
        ScoreCard.getInstance().setPaperBalls();
    }

    /**
    * Increases the current score of singleton instance by count 100
    * @return
    */
    public void updateScore() {
        ScoreCard.getInstance().setScore();
    }
}
