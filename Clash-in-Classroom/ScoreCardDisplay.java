import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreCardDisplay here.
 * 
 * @author (Chinmay Kamerkar) 
 * @version (a version number or a date)
 */
public class ScoreCardDisplay extends Actor
{
    /**
     * Act - do whatever the ScoreCardDisplay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static final Color transparent = new Color(0,0,0,0);
    private int ballsLeft = 0;
    GreenfootImage background; 
    GreenfootImage text;
    GreenfootImage mainDisplay;
    private static ScoreCardDisplay instance;
    public void act()
    {
        // Add your action code here.
    }
    
    public static ScoreCardDisplay getInstance() {
        if (instance == null) {
            GreenfootImage paperBallImage = new GreenfootImage("PaperRollSmall.png");
            paperBallImage.scale(40,40);
            instance = new ScoreCardDisplay(ScoreCard.getInstance().getPaperBallsLeft(), paperBallImage);
        }
        return instance;
    }
    
    
    
    public ScoreCardDisplay()
    {
    }
    
    public ScoreCardDisplay(int ballsLeft, GreenfootImage image) 
    {   
        //background = getImage();
        ballsLeft = ballsLeft;
        display(ballsLeft, image);
    }
    
    public void display(int ballsLeft, GreenfootImage image)
    {
        background = getImage();
        //mainDisplay = new GreenfootImage(500, 100);
        text = new GreenfootImage("     = " +  ballsLeft, 24, Color.BLACK, transparent);
        background.drawImage(image, 15, 20);
        background.drawImage(text, 40, 20);
        background.scale(150, 75);
        setImage(background);
    }
    
    public void setBallsLeft(int ballsLeft)
    {
        ballsLeft = ballsLeft;
    }
    
    public int getBallsLeft()
    {
        return ballsLeft;
    }
    
    public void updateDisplay()
    {
        //
        background.clear();
        GreenfootImage paperBallImage = new GreenfootImage("PaperRollSmall.png");
        paperBallImage.scale(40,40);
        System.out.println(ScoreCard.getInstance().getPaperBallsLeft());
        ScoreCardDisplay.getInstance().setBallsLeft(ScoreCard.getInstance().getPaperBallsLeft());
        display(getBallsLeft(), paperBallImage);
    }
    
}
