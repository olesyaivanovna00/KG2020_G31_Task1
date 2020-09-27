package com.company.obj;

import com.company.Draw;

import java.awt.*;


public class Lighthouse implements Draw {
    private double x;
    private double y;
    private double height;
    private double width;



    public Lighthouse(double x, double y, double height, double width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw(Graphics2D gr, int w, int h) {
        drawRoof(gr, x * w, y * h, height * h, width * w);
        drawPattern(gr, x * w, y * h, height * h, width * w);
        light(gr, x * w, y * h, height * h, width * w);
        cubicle(gr, x * w, y * h, height * h, width * w);
    }

    private void cubicle(Graphics2D gr, double x, double y, double height, double width){
        double x0 = x + width / 5;
        double y0 = y + height / 7;

        gr.setColor(Color.DARK_GRAY);
        gr.setStroke(new BasicStroke((int)(width / 100), BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        gr.drawRect((int)x0, (int)y0,(int)(3 * width / 5), (int)(height / 7));
        int n = 7;
        int x1 = 3 * (int)width / (5 * n);

        for (int i = 0; i < n; i++) {
            gr.drawLine((int)(x0 + i * x1), (int)y0, (int)(x0 + i * x1), (int)(y0 + height / 7));
        }


    }


    private void drawRoof(Graphics2D gr, double x, double y, double height, double width){
        gr.setColor(Color.DARK_GRAY);

        int ax = (int)(x + width / 2);
        int ay = (int)y;
        int bx = (int)(x + width / 5);
        int by = (int)(y + height / 7);
        int cx = (int)(x + 4 * width / 5);
        int cy = (int)(y + height /7);

        int[] triangleX = {bx, ax, cx};
        int[] triangleY = {by, ay, cy};
        gr.fillPolygon(triangleX, triangleY, 3);

    }

    private void drawPattern(Graphics2D gr, double x, double y, double height, double width){
        int dx = (int)(x + width / 5);
        int dy = (int)(y + 2 * height / 7);
        for (int i = 0; i < 5; i++) {

            int[] trapezeX = { dx - (int)(i * width / 25), (int)(dx + 3 * width / 5 + i * width / 25),
                    (int)(dx + 3 * width / 5 + (i + 1) * width / 25), (int)(dx - (i + 1) * width / 25)
            };

            int[] trapezeY = {(int)(dy + i * height / 7), (int)(dy + i * height / 7),
                    (int)(dy + (i + 1) * height / 7), (int)(dy + (i + 1) * height / 7)
            };

            if (i % 2 == 0) {
                gr.setColor(new Color(205,205,205));
            } else {
                gr.setColor(Color.darkGray);
            }

            gr.fillPolygon(trapezeX, trapezeY, 4);



        }

    }

    private void light(Graphics2D gr, double x, double y,  double height, double width){
        int x0 = (int)(x + 0.5 * width);
        int y0 = (int)(y + 3 * height / 14);
        //int x1 = 0;
        int y1 = (int)(y + height / 7);
        //int x2 = 0;
        int y2 = (int)(y + 2 * height / 7);

        int[] xPoints = {x0, 0, 0};
        int[] yPoints = {y0, y1, y2};

        Color startColor = new Color (255,251,1);
        Color endColor = new Color(255,251,1, 0);



        GradientPaint gradient = new GradientPaint(x0, y0, startColor, 0, (y2 + y1) / 2, endColor);                    gr.setPaint(gradient);
        gr.setPaint(gradient);
        gr.fillPolygon(xPoints, yPoints, 3);



        gr.setColor(startColor);
        gr.fillRect((int)(x0 - 3 * width / 20), (int)(y + height / 7), (int)(3 * width / 10), (int)(height / 7));
     }
    
}
