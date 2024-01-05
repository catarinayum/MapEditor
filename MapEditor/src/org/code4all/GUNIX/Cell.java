package org.code4all.GUNIX;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {
    private Rectangle rectangle;
    private int col;
    private int row;
    private boolean isFilled;

    public Cell(int col, int row) {
        this.col = col;
        this.row = row;
        rectangle = new Rectangle(col * Utils.CELLSIZE + Utils.PADDING, row * Utils.CELLSIZE + Utils.PADDING, Utils.CELLSIZE, Utils.CELLSIZE);
        rectangle.draw();
    }

    public void fill() {
        isFilled = true;
        rectangle.fill();
    }

    public void unfill() {
        isFilled = false;
        rectangle.draw();
    }

    public boolean isFilled() {
        return isFilled;
    }
}
