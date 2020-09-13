package com.company;

import java.awt.*;

public class Rocks implements Draw {
    int x;
    int y;
    int width;
    int height;
    Color c;


    public Rocks(int x, int y, int width, int height, Color c) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.c = c;

    }

    @Override
    public void draw(Graphics2D gr) {
        drawRock(gr, x, y, width, height, c);
    }

    private void drawRock(Graphics2D gr, int x, int y, int width, int height, Color c){
        gr.setColor(c);
//        int[] xPoints = {x, x + width / 5, x + 3 * width / 10  };
//        int[] yPoints = {y + height, y + 2 * height / 3, y + 3 * height / 5  };
//
//        gr.drawPolygon(xPoints, yPoints, 3);
        int[] xPoints = {x, x + width / 6, x + width / 3, x + 3 *width / 4, x + width, x + width};
        int[] yPoints = {y + height, y + 6 * height / 10, y + height / 5, y , y + height / 6, y + height};
        gr.fillPolygon(xPoints, yPoints, 6);

        //gr.fillRect(x, y, width, height);
    }
}
