import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class WinGame extends GameState
{
       public void act()  {}
    
    public WinGame(GameWorld myWorld) {
        super(myWorld);
    }
    
    @Override
    public void doOngoingGame() {
        my_world.setState(my_world.getOngoingState());
    }
}