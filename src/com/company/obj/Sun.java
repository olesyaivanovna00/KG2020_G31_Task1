package com.company.obj;

import com.company.Draw;

import java.awt.*;
import java.awt.geom.Arc2D;

import static java.lang.StrictMath.cos;
import static java.lang.StrictMath.sin;

public class Sun implements Draw {
    private double x;
    private double y;
    private double r;
    private double R;
    private double n;


    public Sun(double x, double y, double r, double r1, double n) {
        this.x = x;
        this.y = y;
        this.r = r;
        R = r1;
        this.n = n;

    }

    @Override
    public void draw(Graphics2D gr, int w, int h) {
        drawSun(gr, x * w, y * h, r * h, R * w, n);
    }

    private void drawSun(Graphics2D gr, double x, double y, double r, double R, double n){
        Color startColor = new Color (215, 48, 19);
        Color endColor = new Color(246,71,71, 0);

        gr.setColor(startColor);
        float[] dash = {10};
        gr.setStroke(new BasicStroke((int)(R / 250),BasicStroke.CAP_ROUND,
                BasicStroke.JOIN_BEVEL, 10, dash, 1));


        gr.fill(new Arc2D.Float((int)(x - r), (int)(y - r), (int)(2 * r), (int)(2 * r), 0, 180, Arc2D.CHORD));
        double da = - Math.PI / n;
        for (int i = 0; i <= n; i++) {
            int dx1, dy1, dx2, dy2;

            dx1 = (int) (r * cos(da * i) + x);
            dy1 = (int) (r * sin(da * i) + y);
            dx2 = (int) (R * cos(da * i) + x);
            dy2 = (int) (R * sin(da * i) + y);

            GradientPaint gradient = new GradientPaint(dx1, dy1, startColor, dx2, dy2, endColor);

            gr.setPaint(gradient);

            gr.drawLine( dx1, dy1, dx2, dy2);
        }
    }
}
