package com.company.obj;

import com.company.Draw;

import java.awt.*;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.QuadCurve2D;

public class Sea implements Draw {

    private double height;
    private double width;


    public Sea(double height, double width) {
        this.height = height;
        this.width = width;
    }

    private void sea(Graphics2D gr, double height, double width){
        gr.setColor(new Color(5, 113, 184));
        gr.fillRect(0, (int) height / 4, (int) width, (int) height);
    }

    private void waves(Graphics2D gr, double height, double width){
        gr.setColor(new Color(28, 62, 167));

//        CubicCurve2D c = new CubicCurve2D.Double(0, height , 100, 100, -300, 0, width, height);
//        gr.fill(c);

        for (int i = 0; i < height; i++) {
            for ( int x = 0; x < width; x++ ) {
                int y;
                y = (int) ((30 * Math.sin(Math.toRadians(x))) + height - i * 50);
                gr.fillOval(x, y, 2, 2);
            }
        }

    }

    private void sunTrail(Graphics2D gr, double height, double width){

        Color startColor = new Color (246,71,71);
        Color endColor = new Color(246,71,71, 0);

        //GradientPaint gradient = new GradientPaint(width / 2, height / 4, startColor, width, height, endColor);
        gr.setPaint(new GradientPaint((int) (width / 2), (int) (height / 4), startColor, (int)width, (int)height, endColor));

        gr.fillRect((int) (width / 2), (int)(height/4),(int) width, (int)height);

        //gradient = new GradientPaint(width / 2, height / 4, startColor, 0, height, endColor);
        gr.setPaint(new GradientPaint((int) (width / 2), (int) (height / 4), startColor, 0, (int)height, endColor));

        gr.fillRect(0, (int)(height/4), (int)(width / 2), (int)height);

    }

    @Override
    public void draw(Graphics2D gr, int w, int h) {
        sea(gr, h * height, w * width);
        waves(gr, h * height, w * width);
        sunTrail(gr, h * height, w * width);

    }
}
