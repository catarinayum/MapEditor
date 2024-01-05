package org.code4all.GUNIX;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.sql.SQLOutput;

public class Painter {
    private Rectangle cursor;
    private Cell cell;
    private Color color;
    private int col;
    private int row;
    PaintCanvas paintCanvas = new PaintCanvas(30, 30);
    private GridPosition gridPosition;

    public Painter() {
        gridPosition = new GridPosition(0, 0);
        cursor = new Rectangle(gridPosition.colToX(), gridPosition.rowToY(), Utils.CELLSIZE+1, Utils.CELLSIZE+1);
        cursor.setColor(Color.PINK);
        cursor.draw();
        cursor.fill();
    }

    public void moveRight() {
        if (gridPosition.getCol() != paintCanvas.getWidth() - 1) {
            gridPosition.addToCol();
            cursor.translate(Utils.CELLSIZE, 0);
        }
    }

    public void moveLeft() {
        if (gridPosition.getCol() > 0) {
            gridPosition.removeCol();
            cursor.translate(-Utils.CELLSIZE, 0);
        }
    }

    public void moveUp() {
        if (gridPosition.getRow() > 0) {
            gridPosition.removeRow();
            cursor.translate(0, -Utils.CELLSIZE);
        }
    }

    public void moveDown() {
        if (gridPosition.getRow() != paintCanvas.getHeight() - 1) {
            gridPosition.addToRow();
            cursor.translate(0, Utils.CELLSIZE);
        }
    }

    public void paint() {
        paintCanvas.getCell(gridPosition.getCol(), gridPosition.getRow()).fill();
    }

    public void unpaint() {
        cell = paintCanvas.getCell(gridPosition.getCol(), gridPosition.getRow());
        if (cell.isFilled()) {
            cell.unfill();
        }
    }
}
