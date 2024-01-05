package org.code4all.GUNIX;

import javax.rmi.CORBA.Util;
import java.awt.*;

public class GridPosition {
    private int col;
    private int row;
    private Painter painter;

    public GridPosition(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int colToX() {
        return col * Utils.CELLSIZE + Utils.PADDING;
    }

    public int rowToY() {
        return row * Utils.CELLSIZE + Utils.PADDING;
    }

    //addToCol to save pos
    public void addToCol() {
        col++;
    }

    public void removeCol() {
        col--;
    }

    public void addToRow(){
        row++;
    }

    public void removeRow(){
        row--;
    }
}
