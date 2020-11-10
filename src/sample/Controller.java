package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML GridPane grid;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        for(int i = 0; i <grid.getPrefWidth()/20; i++){
            for(int j = 0; j<grid.getPrefHeight()/20; j++) {
                Square g = new Square(20,20);
                g.setFill(Color.WHITE);
                g.setStroke(Color.BLACK);
                g.setOnMouseClicked(t -> g.setFill(Color.AQUA));
                g.setOnMouseDragOver(new EventHandler <MouseDragEvent>()
                {
                    public void handle(MouseDragEvent event)
                    {
                        g.setStroke(Color.AZURE);
                    }
                });
                g.setOnMouseDragged(t->g.setFill(Color.AZURE));
                grid.add(g,i,j);
            }
        }
        System.out.println(grid.getChildren().get(0).toString());
    }
}
