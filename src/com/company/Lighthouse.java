package com.company;

import java.awt.*;


public class Lighthouse implements Draw{
    int x;
    int y;
    int height;
    int width;



    public Lighthouse(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw(Graphics2D gr) {
        drawRoof(gr, x, y, height, width);
        drawPattern(gr, x, y);
        light(gr, x, y);
        cubicle(gr, x, y, height, width);
    }

    private void cubicle(Graphics2D gr, int x, int y, int height, int width){
        int x0 = x + width / 5;
        int y0 = y + height / 7;

        gr.setColor(Color.DARK_GRAY);
        gr.setStroke(new BasicStroke(width / 100, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        gr.drawRect(x0, y0,3 * width / 5, height / 7);
        int n = 7;
        int x1 = 3 * width / (5 * n);

        for (int i = 0; i < n; i++) {
            gr.drawLine(x0 + i * x1, y0, x0 + i * x1, y0 + height / 7);
        }


    }


    private void drawRoof(Graphics2D gr, int x, int y, int height, int width){
        gr.setColor(Color.DARK_GRAY);

        int ax = x + width / 2;
        int ay = y;
        int bx = x + width / 5;
        int by = y + height / 7;
        int cx = x + 4 * width / 5;
        int cy = y + height /7;

        int[] triangleX = {bx, ax, cx};
        int[] triangleY = {by, ay, cy};
        gr.fillPolygon(triangleX, triangleY, 3);

    }

    private void drawPattern(Graphics2D gr, int x, int y){
        int dx = x + width / 5;
        int dy = y + 2 * height / 7;
        for (int i = 0; i < 5; i++) {

            int[] trapezeX = { dx - i * width / 25, dx + 3 * width / 5 + i * width / 25,
                    dx + 3 * width / 5 + (i + 1) * width / 25, dx - (i + 1) * width / 25
            };

            int[] trapezeY = {dy + i * height / 7, dy + i * height / 7,
                    dy + (i + 1) * height / 7, dy + (i + 1) * height / 7
            };

            if (i % 2 == 0) {
                gr.setColor(new Color(205,205,205));
            } else {
                gr.setColor(Color.darkGray);
            }

            gr.fillPolygon(trapezeX, trapezeY, 4);



        }

    }

    private void light(Graphics2D gr, int x, int y){
        int x0 = x + (int) (0.5 * width);
        int y0 = y + 3 * height / 14;
        //int x1 = 0;
        int y1 = y + height / 7;
        //int x2 = 0;
        int y2 = y + 2 * height / 7;

        int[] xPoints = {x0, 0, 0};
        int[] yPoints = {y0, y1, y2};

        Color startColor = new Color (255,251,1);
        Color endColor = new Color(255,251,1, 0);



        GradientPaint gradient = new GradientPaint(x0, y0, startColor, 0, (y2 + y1) / 2, endColor);                    gr.setPaint(gradient);
        gr.setPaint(gradient);
        gr.fillPolygon(xPoints, yPoints, 3);



        gr.setColor(startColor);
        gr.fillRect(x0 - 3*width / 20, y + height / 7, 3*width / 10, height / 7);
     }
    
}
