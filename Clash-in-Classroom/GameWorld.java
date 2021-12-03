import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld here.
 * 
 * @author (Harsh Sheth) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{
    private Fighter fighter;
    private Opponent opponent;
    private ScoreCardDisplay scd;

    private GameState currentState;
    private GameState ongoingState;
    private GameState pauseState;
    private GameState gameoverState;
    /**
     * Constructor for objects of class GameWorld.
     * 
     */
    public GameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 650, 1,false);

        ongoingState = new OngoingGame(this);
        pauseState = new PauseGame(this);
        gameoverState = new GameOver(this);

        currentState = ongoingState;

        GreenfootImage gameImage = new GreenfootImage("classroomBackground.jpg");
        gameImage.scale(getWidth(),getHeight());
        setBackground(gameImage);
        opponent = new Opponent();
        scd = ScoreCardDisplay.getInstance();
        fighter = new Fighter();
        prepare();
    }
    
    private void prepare()
    {
        addObject(fighter,70,355);
        addObject(opponent,805,355);
        addObject(scd, 429, 77);
    }


    public GameState getState() {
        return currentState;
    }
    public void setState(GameState state) {
        this.currentState = state;
    }
    public GameState getOngoingState() {
        return this.ongoingState;
    }

    public GameState getPauseState() {
        return this.pauseState;
    }

    public GameState getGameOverState() {
        return this.gameoverState;
    }

    public void doOngoingGame() {
        this.currentState.doOngoingGame();
    }
    public void doPause() {
        this.currentState.doPause(); 
    }
    public void doGameOver() {
        this.currentState.doGameOver();
     }
}
