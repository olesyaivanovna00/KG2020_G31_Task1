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

    private void boat(Graphics2D gr, int x, int y, int height, int width){
        gr.setColor(new Color(170,102,44));

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

    private void sail(Graphics2D gr, int x, int y, int height, int width) {

        int sx1 = x + width / 2;
        int sy1 = y;
        int sx2 = sx1;
        int sy2 = y - 2 * height / 3;
        int sx3 = sx1 - width / 5;
        int sy3 = (sy1 + sy2) / 2;
        int[] xDots = {sx1, sx2, sx3};
        int[] yDots = {sy1, sy2, sy3};


        gr.setColor(new Color(255,102,102));
        gr.fillPolygon(xDots, yDots, 3);

    }

    private void mast(Graphics2D gr, int x, int y, int height, int width){
        int sx1 = x + width / 2;
        int sy1 = y;
        int sx2 = sx1;
        int sy2 = y - 2 * height / 3;

        gr.setStroke(new BasicStroke(width / 60, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        gr.setColor(new Color(170,102,44));
        gr.drawLine(sx1, sy1, sx2, sy2);
    }

    private void nameOfBoat(Graphics2D gr, int x, int y, int height, int width){
        gr.setColor(Color.black);

        Font newFont = new Font("Helvetica", Font.ITALIC, width / 20);
        gr.setFont(newFont);
        gr.drawString("НАДЕЖДА", x + 3 * width / 5, y + height / 10);
    }





    @Override
    public void draw(Graphics2D gr) {
        mast(gr, x, y, height, width);
        sail(gr, x, y, height, width);
        boat(gr, x, y, height, width);
        nameOfBoat(gr, x, y, height, width);

    }
}
