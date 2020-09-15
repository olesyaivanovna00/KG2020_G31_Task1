package com.company;

import java.awt.*;
import java.awt.geom.Arc2D;

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

    private void boat(Graphics2D gr, int x, int y, int height, int width){
        gr.setColor(new Color(170,102,44));

        int x1 = x + width / 4;
        int y1 = y;
        int x2 = x;
        int y2 = y -  width / 4;
        int x3 = x + width;
        int y3 = y - 2 * width / 5;
        int x4 = x + 3 * width / 4;
        int y4 = y;

        gr.draw(new Arc2D.Float(x1, y1, width / 4, height / 4, 180, 90, Arc2D.OPEN));
        gr.draw(new Arc2D.Float(x2, y2, width, y2 - y3, 180, 90, Arc2D.OPEN));
//        int x1 = x;
//        int y1 = y + 6 * height / 10;
//        int x2 = x1 + width / 6;
//        int y2 = y + height;
//        int x3 = x + 5 * width / 6;
//        int y3 = y2;
//        int x4 = x + width;
//        int y4 = y1;
//        int[] xDots = {x1, x2, x3, x4};
//        int[] yDots = {y1, y2, y3, y4};
//        gr.fillPolygon(xDots, yDots, 4);
//
//        gr.setColor(new Color(116,48,0));
//        gr.drawPolygon(xDots, yDots, 4);


    }

    private void sail(Graphics2D gr, int x, int y, int height, int width) {

        int x1 = x + width / 2;
        int y1 = y + 6 * height / 10;
        int x2 = x + width / 6;
        int y2 = (y + y1) / 2;
        int x3 = x1;
        int y3 = y;
        int[] xDots = {x1, x2, x3};
        int[] yDots = {y1, y2, y3};

        gr.setColor(new Color(106, 90, 205));
        gr.fillPolygon(xDots, yDots, 3);
        gr.setColor(new Color(72, 61, 139));
        gr.drawPolygon(xDots, yDots, 3);

    }

    private void mast(Graphics2D gr, int x, int y, int height, int width){
        int x1 = x + width / 2;
        int y1 = y + 6 * height / 10;
        int x2 = x1;
        int y2 = y;

        gr.setStroke(new BasicStroke(width / 60, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        gr.setColor(new Color(116,48,0));
        gr.drawLine(x1, y1, x2, y2);
    }

    private void nameOfBoat(Graphics2D gr, int x, int y, int height, int width){
        gr.setColor(Color.black);

        Font newFont = new Font("Helvetica", Font.ITALIC, width / 20);
        gr.setFont(newFont);
        gr.drawString("НАДЕЖДА", x + 3 * width / 5,  y + 7 * height / 10);
    }





    @Override
    public void draw(Graphics2D gr) {

        sail(gr, x, y, height, width);
        mast(gr, x, y, height, width);
        boat(gr, x, y, height, width);
        nameOfBoat(gr, x, y, height, width);

    }
}
