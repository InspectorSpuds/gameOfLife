package GameOfLife.Comp;
import java.util.HashSet;
import java.util.concurrent.BlockingQueue;


/*
    class Board
    Purpose: represents the board state for the game of life
*/
public class GameState implements Runnable{
    private BlockingQueue<HashSet<Cell>> stateUpdates;
    private HashSet<Cell> nextState;
    public final int waitTime = 5;
    @Override
    public void run() {

        try {
            Thread.sleep(1000*waitTime);
        } catch (InterruptedException e) {
            System.out.println("Thread wait is blocked");
        }
    }
    public void calculate() {

    }
}
