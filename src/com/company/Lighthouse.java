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
        drawLighthouse(gr, x, y, height, width);
    }

    private void drawLighthouse(Graphics2D gr, int x, int y, int height, int width){
        gr.setColor(Color.DARK_GRAY);

        int ax = x + width / 2;
        int ay = y;
        int bx = x + width / 5;
        int by = y + height / 7;
        int cx = x + 4 * width / 5;
        int cy = y + height /7;
        int dx = x + width / 5;
        int dy = y + 2 * height / 7;
        int ex = x + 4 * width/ 5;
        int ey = y + 2* height / 7;
        int fx = x;
        int fy = y + height;
        int gx = x + width;
        int gy = y + height;

        //крыша
        int[] triangleX = {bx, ax, cx};
        int[] triangleY = {by, ay, cy};
        gr.fillPolygon(triangleX, triangleY, 3);

        //трапеция
        gr.setColor(Color.orange);
        gr.setStroke(new BasicStroke(2));
        int[] trapezeX = {dx, ex, gx, fx};
        int[] trapezeY = {dy, ey, gy, fy};
        gr.setStroke(new BasicStroke(4));

        gr.fillPolygon(trapezeX, trapezeY, 4);
        gr.setColor(Color.yellow);


        //то откуда светит свет
        gr.setColor(Color.black);
        gr.setStroke(new BasicStroke(2));
        gr.drawRect(bx, by,3 * width / 5, height / 7);

        drawPattern(gr, dx, dy);

    }

    private void drawPattern(Graphics2D gr, int x, int y){

        //gr.setColor(Color.darkGray);
        for (int i = 0; i < 5; i++) {

            int[] trapezeX = { x - i * width / 15, x + 3 * width / 5 + i * width / 15,
                    x + 3 * width / 5 + (i + 1) * width / 15, x - (i + 1) * width / 15
            };

            int[] trapezeY = {y + i * height / 7, y + i * height / 7,
                    y + (i + 1) * height / 7, y + (i + 1) * height / 7
            };
//            int[] trapezeX = {x - i * width / 7, x + 3 * width / 5 + i * width / 15,
//                              x - (i + 1) * width / 7, x + 3 * width / 5 + (i + 1) * width / 15};
//            int[] trapezeY = {y + i * height / 7, y + i * height / 7,
//                             y + (i + 1) * height, y + (i + 1) * height};

            if (i % 2 == 0) {
                gr.setColor(new Color(255,255,255,0));
                gr.setStroke() 
            } else {
                gr.setColor(Color.darkGray);
            }

            gr.fillPolygon(trapezeX, trapezeY, 4);

        }

    }
}
