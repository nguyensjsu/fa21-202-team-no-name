import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class OngoingGame extends GameState
{
    
    public OngoingGame(GameWorld myWorld) {

        super(myWorld);

    }
    @Override
       public void doWin() {
            my_world.setState(my_world.getWinState());
            GameEnd gameEnd = new GameEnd("Hurray! You won with a score of 500!");
            my_world.addObject(gameEnd, my_world.getWidth()/2, my_world.getHeight()/2);
            Greenfoot.stop();
        }
    
    @Override
    public void doLose() {
        my_world.setState(my_world.getLoseState());
        GameEnd gameEnd = new GameEnd("Sorry! You are out of GUMBALLS... Oops... Paper Balls!");
        my_world.addObject(gameEnd, my_world.getWidth() / 2, my_world.getHeight() / 2);
        Greenfoot.stop();
    }
}