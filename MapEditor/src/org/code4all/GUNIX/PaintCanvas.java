package org.code4all.GUNIX;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import javax.rmi.CORBA.Util;

public class PaintCanvas {

    public Rectangle square;
    private int width;
    private int height;
    private Cell[][] cells;

    public PaintCanvas(int width, int height) {
        this.width = width;
        this.height = height;

        //array of cells
        cells = new Cell[height][width];

        for (int j = 0; j < height; j++) {
            for (int i = 0; i < width; i++) {
                cells[j][i] = new Cell(j, i);
            }
        }
    }

    public Cell getCell(int j, int i) {
        return cells[j][i];
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


}
