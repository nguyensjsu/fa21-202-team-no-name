import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class GameState implements IGameState
{
    
    GameWorld my_world;
    
    public GameState(GameWorld myWorld) {
       this.my_world = myWorld;
    }
    
      /**
     * Act - do whatever the GameOverState wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void act()  {}
    
   public void doOngoingGame() {}
   public void doLose() {}
   public void doWin() {}
}