package org.code4all.GUNIX;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Handler implements KeyboardHandler {

    private Painter painter;
    private Keyboard keyboard;
    private PaintCanvas paintCanvas;
    private Cell cell;

    public Handler(Painter painter) {
        this.painter = painter;
        keyboard = new Keyboard(this);
        createKeyboardEvents();
    }

    public void createKeyboardEvents() {
        //move right
        KeyboardEvent keyboardEventRight = new KeyboardEvent();
        keyboardEventRight.setKey(KeyboardEvent.KEY_RIGHT);
        keyboardEventRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEventRight);

        //move left
        KeyboardEvent keyboardEventLeft = new KeyboardEvent();
        keyboardEventLeft.setKey(KeyboardEvent.KEY_LEFT);
        keyboardEventLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEventLeft);

        //move up
        KeyboardEvent keyboardEventUp = new KeyboardEvent();
        keyboardEventUp.setKey(KeyboardEvent.KEY_UP);
        keyboardEventUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEventUp);

        //move down
        KeyboardEvent keyboardEventDown = new KeyboardEvent();
        keyboardEventDown.setKey(KeyboardEvent.KEY_DOWN);
        keyboardEventDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEventDown);

        //paint
        KeyboardEvent keyboardEventPaint = new KeyboardEvent();
        keyboardEventPaint.setKey(KeyboardEvent.KEY_D);
        keyboardEventPaint.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEventPaint);

        //unpaint
        KeyboardEvent keyboardEventUnpaint = new KeyboardEvent();
        keyboardEventUnpaint.setKey(KeyboardEvent.KEY_E);
        keyboardEventUnpaint.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEventUnpaint);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_RIGHT:
                painter.moveRight();
                break;
            case KeyboardEvent.KEY_LEFT:
                painter.moveLeft();
                break;
            case KeyboardEvent.KEY_UP:
                painter.moveUp();
                break;
            case KeyboardEvent.KEY_DOWN:
                painter.moveDown();
                break;
            case KeyboardEvent.KEY_D:
                painter.paint();
                break;
            case KeyboardEvent.KEY_E:
                painter.unpaint();
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
