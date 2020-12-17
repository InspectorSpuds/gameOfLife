package GameOfLife.Comp;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
public class Cell extends Rectangle {
    private boolean alive = false;
    public final int row; //y coordinate
    private final int col; //x coordinate

    public Cell(int width, int height, int col, int row) {
        super(width,height);
        this.setFill(Color.WHITE);
        this.setStroke(Color.BLACK);
        this.row = row;
        this.col = col;
        this.setBehaviors();
    }
    private void setBehaviors() {
        this.setOnMouseEntered(t -> this.setFill(Color.LIGHTBLUE));
        this.setOnMouseExited(t -> {
            if (!this.isAlive()) {
                this.setFill(Color.WHITE);
            } else {
                this.setFill(Color.AQUA);
            }
        });
        this.setOnMouseClicked(t -> {
            if (!this.isAlive()) {
                this.setFill(Color.AQUA);
                this.setAlive(true);
            } else {
                this.setFill(Color.WHITE);
                this.setAlive(false);
            }
        });
    }
    public void setAlive(boolean state) {
        this.alive = state;

    }

    public boolean isAlive() {
        return this.alive;
    }
}
