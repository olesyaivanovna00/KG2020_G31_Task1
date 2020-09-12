package com.company;

import java.awt.*;

public class Sea implements Draw {

    int height;
    int width;


    public Sea(int height, int width) {
        this.height = height;
        this.width = width;
    }

    private void sea(Graphics2D gr, int height, int width){
        gr.setColor(new Color(9,157,254));
        gr.fillRect(0, height/4, width, height);
    }

    private void waves(Graphics2D gr, int height, int width){
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
//        for ( int x=0;x<width;x++ ) {
//            y = (int)(20*Math.sin( Math.toRadians(x))) + height;
//            gr.fillOval( x,y,2,2 );
//        }
//
//
//        for ( int x=0;x<width;x++ ) {
//            y = (int)(20*Math.sin( Math.toRadians(x))) + height + 10;
//            gr.fillOval( x,y,2,2 );
//        }
    }

    @Override
    public void draw(Graphics2D gr) {
        sea(gr, height, width);
       // waves(gr,height, width);
    }
}
