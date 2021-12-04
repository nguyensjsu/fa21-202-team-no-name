import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class WinGame extends GameState
{
       public void act()  {}
    
    public WinGame(GameWorld myWorld) {
        super(myWorld);
    }
    
    @Override
    public void doWin() {
        my_world.setState(this);
        GameEnd gameEnd = new GameEnd("Yay! You won!");
        my_world.addObject(gameEnd, my_world.getWidth()/2, my_world.getHeight()/2);
        Greenfoot.stop();
    }
}