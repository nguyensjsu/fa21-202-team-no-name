import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class OngoingGame extends GameState
{
    
    public OngoingGame(GameWorld myWorld) {

        super(myWorld);

    }
    @Override
       public void doGameOver() {
            my_world.setState(my_world.getGameOverState());
        }
    
    @Override
    public void doPause() {
        my_world.setState(my_world.getPauseState());
        GameEnd gameEnd = new GameEnd("Yay! You won!");
        my_world.addObject(gameEnd, my_world.getWidth()/2, my_world.getHeight()/2);
        Greenfoot.stop();
    }
}