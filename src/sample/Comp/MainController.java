package sample.Comp;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import sample.Comp.Cell;
import sample.QuadTree.QuadTree;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable, Runnable {
    @FXML GridPane grid;
    @FXML StackPane draggable;
    private static QuadTree activeCells;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        for(int i = 0; i <grid.getPrefWidth()/20; i++){
            for(int j = 0; j<grid.getPrefHeight()/20; j++) {
                Cell g = new Cell(20,20, i, j);
                grid.add(g,i,j);
            }
        }
        System.out.println();
    }

    @Override
    public void run() {
    }
}
