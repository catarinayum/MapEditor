package org.code4all.GUNIX;

public class Main {
    public static void main(String[] args) {
        PaintCanvas paintCanvas = new PaintCanvas(30,30);
        Painter painter = new Painter();
        Handler handler = new Handler(painter);
    }
}