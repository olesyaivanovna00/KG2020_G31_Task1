package com.company;

import java.awt.*;

public class Rocks implements Draw {
    int x;
    int y;
    int height;
    int width;

    public Rocks(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw(Graphics2D gr) {
        drawRock(gr, x, y, height, width);
    }

    private void drawRock(Graphics2D gr, int x, int y, int height, int width){
        gr.setColor(Color.darkGray);
        int[] xPoints = {x, x + width / 20};
        int[] yPoints = {y + height, y + height / 2 };

        gr.drawPolygon(xPoints, yPoints, 2);
    }
}
