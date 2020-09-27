package com.company.obj;

import com.company.Draw;

import java.awt.*;

public class Rocks implements Draw {
    private double x;
    private double y;
    private double width;
    private double height;
    private Color c;


    public Rocks(double x, double y, double width, double height, Color c) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.c = c;

    }

    @Override
    public void draw(Graphics2D gr, int w, int h) {
        drawRock(gr, x * w, y * h, width * w, height * h, c);
    }

    private void drawRock(Graphics2D gr, double x, double y, double width, double height, Color c){
        gr.setColor(c);
//        int[] xPoints = {x, x + width / 5, x + 3 * width / 10  };
//        int[] yPoints = {y + height, y + 2 * height / 3, y + 3 * height / 5  };
//
//        gr.drawPolygon(xPoints, yPoints, 3);
        int[] xPoints = {(int)x, (int)(x + width / 6), (int)(x + width / 3), (int)(x + 3 *width / 4), (int)(x + width), (int)(x + width)};
        int[] yPoints = {(int)(y + height), (int)(y + 6 * height / 10), (int)(y + height / 5), (int)y , (int)(y + height / 6), (int)(y + height)};
        gr.fillPolygon(xPoints, yPoints, 6);

        //gr.fillRect(x, y, width, height);
    }
}
