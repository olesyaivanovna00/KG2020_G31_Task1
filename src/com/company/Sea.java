package com.company;

import java.awt.*;

public class Sea implements Draw {
    int y;
    int height;
    int width;
    int r;


    public Sea(int y, int height, int width, int r) {
        this.y = y;
        this.height = height;
        this.width = width;
        this.r = r;
    }

    private void sea(Graphics2D gr, int y, int height, int width){
        gr.setColor(Color.cyan);
        gr.fillRect(0, y, width, height);
    }

    private void waves(Graphics2D gr, int y, int height, int width, int r){
        gr.setColor(Color.BLUE);
//        for(int i = 0; i <= height / 2*r; i++) {
//            for (int j = 0; j <= width / 2*r; j++) {
//                if (i % 2 == 0){
//                    gr.drawOval(2 * r * j, y + 2 * r * i, 2 * r, 2 * r);
//                } else {
//                    gr.drawOval(- r + 2 * r * j, y + 2 * r * i, 2 * r, 2 * r);
//                }
//            }
//        }
    }

    @Override
    public void draw(Graphics2D gr) {
        sea(gr, y, height, width);
        waves(gr, y, height, width, r);
    }
}
