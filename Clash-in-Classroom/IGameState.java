import greenfoot.*; 

public interface IGameState
{

   public abstract void doOngoingGame();
   public abstract void doLose();
   public abstract void doWin();   
}