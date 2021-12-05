import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * ScoreCardDisplay class displays the content of the ScoreCard on the GameWorld
 * 
 * @author (Chinmay Kamerkar)
 * @version (a version number or a date)
 */
public class ScoreCardDisplay extends Actor {
    private static final Color transparent = new Color(0, 0, 0, 0);
    GreenfootImage background;
    GreenfootImage text;
    GreenfootImage scoreText;
    GreenfootImage mainDisplay;
    private static ScoreCardDisplay instance;

    public void act() {
        // Add your action code here.
    }

    /**
    * Returns the singleton instance of ScoreCardDisplay 
    * @return instance
    */
    public static ScoreCardDisplay getInstance() {
        if (instance == null) {
            GreenfootImage paperBallImage = new GreenfootImage("PaperRollSmall.png");
            paperBallImage.scale(40, 40);
            instance = new ScoreCardDisplay(ScoreCard.getInstance().getPaperBallsLeft() - 1, paperBallImage);
        }
        return instance;
    }

    public ScoreCardDisplay() {
    }


    /**
    * This is parametrized of constructor of ScoreCardDisplay which will create an instance of ScoreCardDisplay using ScoreCard singleton
    * @param ballsLeft number of balls left
    * @param image GreenfootImage of paperroll
    * @return
    * @see GreenfootImage
    */
    public ScoreCardDisplay(int ballsLeft, GreenfootImage image) {
        // background = getImage();
        background = getImage();
        display(ScoreCard.getInstance().getPaperBallsLeft() - 1, ScoreCard.getInstance().getScore(), image);
    }


    /**
    * This method will set the image of ScoreCardDisplay class
    * @param ballsLeft number of balls left
    * @param score current score
    * @param image GreenfootImage of paperroll
    * @return
    * @see GreenfootImage
    */
    public void display(int ballsLeft, int score, GreenfootImage image) {
        background = getImage();
        // mainDisplay = new GreenfootImage(500, 100);
        if (ballsLeft < 0)
            ballsLeft = 0;
        text = new GreenfootImage("     = " + ballsLeft, 24, Color.BLACK, transparent);
        scoreText = new GreenfootImage("Score   = " + score, 24, Color.BLACK, transparent);
        background.drawImage(image, 15, 20);
        background.drawImage(text, 40, 20);
        background.drawImage(scoreText, 20, 70);
        background.scale(150, 75);
        setImage(background);
    }

    /**
    * This method will update the image of ScoreCardDisplay class by changing the number of balls left and score
    * @return
    */
    public void updateDisplay() {
        //
        background.clear();
        setImage("BackgroundScoreImage.jpg");
        GreenfootImage paperBallImage = new GreenfootImage("PaperRollSmall.png");
        paperBallImage.scale(40, 40);
        // ScoreCardDisplay.getInstance().setBallsLeft(ScoreCard.getInstance().getPaperBallsLeft());
        display(ScoreCard.getInstance().getPaperBallsLeft() - 1, ScoreCard.getInstance().getScore(), paperBallImage);
    }

}
