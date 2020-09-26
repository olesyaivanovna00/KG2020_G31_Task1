package com.company;

import java.awt.*;
import java.awt.geom.Arc2D;

public class Boat implements Draw{
    private double x;
    private double y;
    private double height;
    private double width;

    public Boat(double x, double y, double height, double width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    private void boat(Graphics2D gr, double x, double y, double height, double width){
        gr.setColor(new Color(170,102,44));


        int x1 = (int)x;
        int y1 = (int)(y + 6 * height / 10);
        int x2 = (int)(x1 + width / 6);
        int y2 = (int)(y + height);
        int x3 = (int)(x + 5 * width / 6);
        int y3 = y2;
        int x4 = (int)(x + width);
        int y4 = y1;
        int[] xDots = {x1, x2, x3, x4};
        int[] yDots = {y1, y2, y3, y4};
        gr.fillPolygon(xDots, yDots, 4);

        gr.setColor(new Color(116,48,0));
        gr.drawPolygon(xDots, yDots, 4);


    }

    private void sail(Graphics2D gr, double x, double y, double height, double width) {
        gr.setStroke(new BasicStroke((int)(width / 60), BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

        int x1 = (int)(x + width / 2);
        int y1 = (int)(y + 6 * height / 10);
        int x2 = (int)(x + width / 6);
        int y2 = (int)((y + y1) / 2);
        int x3 = x1;
        int y3 = (int)y;
        int[] xDots = {x1, x2, x3};
        int[] yDots = {y1, y2, y3};

        gr.setColor(new Color(106, 90, 205));
        gr.fillPolygon(xDots, yDots, 3);
        gr.setColor(new Color(72, 61, 139));
        gr.drawPolygon(xDots, yDots, 3);

    }

    private void mast(Graphics2D gr, double x, double y, double height, double width){


        int x1 = (int)(x + width / 2);
        int y1 = (int)(y + 6 * height / 10);
        int x2 = x1;
        int y2 = (int)y;

        gr.setStroke(new BasicStroke((int)(width / 60), BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        gr.setColor(new Color(116,48,0));
        gr.drawLine(x1, y1, x2, y2);
    }

    private void nameOfBoat(Graphics2D gr, double x, double y, double height, double width){
        gr.setColor(Color.black);

        Font newFont = new Font("Helvetica", Font.ITALIC, (int)(width / 20));
        gr.setFont(newFont);
        gr.drawString("НАДЕЖДА", (int)(x + 3 * width / 5),  (int)(y + 7 * height / 10));
    }





    @Override
    public void draw(Graphics2D gr, int w, int h) {

        sail(gr, x * w, y * h, height * h, width * w);
        mast(gr, x * w, y * h, height * h, width * w);
        boat(gr, x * w, y * h, height * h, width * w);
        nameOfBoat(gr, x * w, y * h, height * h, width * w);

    }
}
