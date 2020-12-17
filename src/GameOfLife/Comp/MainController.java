package GameOfLife.Comp;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import GameOfLife.QuadTree.QuadTree;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable, Runnable {
    @FXML GridPane grid; //the cell grid
    @FXML StackPane draggable; //the super container for the grid
    private static QuadTree activeCells;
    private GameState state;

    /*
        Name: initialize()
        Preconditions: URL Location, ResourceBundle Resources
        Process: initializes the gui by seeding the grid and performing other
        utility actions
        Postconditions: none
    */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        seedGrid();
    }

    @Override
    public void run() {

    }


    private void seedGrid() {
        for(int i = 0; i <grid.getPrefWidth()/20; i++){
            for(int j = 0; j<grid.getPrefHeight()/20; j++) {
                Cell g = new Cell(20,20, i, j);
                grid.add(g,i,j);
            }
        }
    }
}
