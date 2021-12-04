import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld here.
 * 
 * @author (Harsh Sheth)
 * @version (a version number or a date)
 */
public class GameWorld extends World {
    private Fighter fighter;
    private Opponent opponent;
    private ScoreCardDisplay scd;

    private GameState st;
    private GameState og;
    private GameState lg;
    private GameState wg;

    /**
     * Constructor for objects of class GameWorld.
     * 
     */
    public GameWorld() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 650, 1, false);

        og = new OngoingGame(this);
        lg = new LoseGame(this);
        wo = new WinGame(this);

        st = og;


        GreenfootImage gameImage = new GreenfootImage("classroomBackground.jpg");
        gameImage.scale(getWidth(), getHeight());
        setBackground(gameImage);
        opponent = new Opponent();
        ScoreCard.getInstance().reset_score();
        scd = ScoreCardDisplay.getInstance();
        fighter = new Fighter();
        prepare();
    }

    private void prepare() {
        addObject(fighter, 70, 355);
        addObject(opponent, 805, 355);
        addObject(scd, 429, 77);
    }

    public GameState getState() {
        return st;
    }
    public void setState(GameState state) {
        this.st = state;
    }
    public GameState getOngoingState() {
        return this.og;
    }

    public GameState getLoseState() {
        return this.lg;
    }

    public GameState getWinState() {
        return this.wg;
    }

    public void doOngoingGame() {
        this.st.doOngoingGame();
    }
    public void doLose() {
        this.st.doLose(); 
    }
    public void doWin() {
        this.st.doWin();
     }
}
