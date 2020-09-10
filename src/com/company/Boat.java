package com.company;

import java.awt.*;

public class Boat implements Draw{
    int x;
    int y;
    int height;
    int width;

    public Boat(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    private void drawBoat(Graphics2D gr, int x, int y, int height, int width){
        gr.setColor(Color.orange);

        int x1 = x + width;
        int y1 = y;
        int x2 = x1 - width / 5;
        int y2 = y + height / 3;
        int x3 = x + width / 5;
        int y3 = y2;
        int[] xDots = {x, x1, x2, x3};
        int[] yDots = {y, y1, y2, y3};
        gr.fillPolygon(xDots, yDots, 4);
    }

    private void drawSail(Graphics2D gr, int x, int y, int height, int width) {
        gr.setColor(Color.pink);
        int sx1 = x + width / 2;
        int sy1 = y;
        int sx2 = sx1;
        int sy2 = y - 2 * height / 3;
        int sx3 = sx1 - width / 5;
        int sy3 = (sy1 + sy2) / 2;
        int[] xDots = {sx1, sx2, sx3};
        int[] yDots = {sy1, sy2, sy3};
        gr.fillPolygon(xDots, yDots, 3);


    }




    @Override
    public void draw(Graphics2D gr) {
        drawBoat(gr, x, y, height, width);
        drawSail(gr, x, y, height, width);
    }
}
