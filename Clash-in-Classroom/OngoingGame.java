import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class OngoingGame extends GameState
{
    
    public OngoingGame(GameWorld myWorld) {

        super(myWorld);

    }
    @Override
       public void doWin() {
            my_world.setState(my_world.getWinState());
            GameEnd gameEnd = new GameEnd("Yay! You won!");
            my_world.addObject(gameEnd, my_world.getWidth()/2, my_world.getHeight()/2);
            Greenfoot.stop();
        }
    
    @Override
    public void doLose() {
        my_world.setState(my_world.getLoseState());
        GameEnd gameEnd = new GameEnd("Yay! You lose!");
        my_world.addObject(gameEnd, my_world.getWidth() / 2, my_world.getHeight() / 2);
        Greenfoot.stop();
    }
}