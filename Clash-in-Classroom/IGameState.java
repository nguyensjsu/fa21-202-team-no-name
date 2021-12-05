import greenfoot.*; 

/**
 * Interface to perform actions on the world based on the state of the game
 */
public interface IGameState
{

   public abstract void doOngoingGame();
   public abstract void doLose();
   public abstract void doWin();   
}