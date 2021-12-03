import greenfoot.*; 

public interface IGameState
{

   public abstract void doOngoingGame();
   public abstract void doPause();
   public abstract void doGameOver();   
}