import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameOver extends GameState
{
       public void act()  {}
    
    public GameOver(GameWorld myWorld) {
        super(myWorld);
    }
    
    @Override
    public void doGameOver() {
        my_world.setState(this);
        GameEnd gameEnd = new GameEnd("Yay! You won!");
        my_world.addObject(gameEnd, my_world.getWidth()/2, my_world.getHeight()/2);
        Greenfoot.stop();
    }
}