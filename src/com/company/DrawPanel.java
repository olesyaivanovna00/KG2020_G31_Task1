package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;

import static java.lang.StrictMath.cos;
import static java.lang.StrictMath.sin;

public class DrawPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;

        //drawSun(gr, 400, 350, 50, 1000, 60, Color.pink);


        Sea sea = new Sea(getHeight(), getWidth());
        sea.draw(gr);

        Sky sky = new Sky(getHeight() / 3, getWidth());
        sky.draw(gr);

        Boat boat = new Boat(getWidth() / 7, 2 * getHeight() / 5, getHeight() / 3, getWidth() / 3);
        boat.draw(gr);


        Lighthouse lighthouse = new Lighthouse(3 * getWidth() / 4, getHeight() / 6, (int) (getHeight() * 0.75), getWidth() / 4);
        lighthouse.draw(gr);

        Rocks rock2 = new Rocks(7 * getWidth() / 10, 7 * getHeight() / 10, getWidth() - 7 * getWidth() / 10, getHeight() - 7 * getHeight() / 10, new Color(190, 190, 190));
        rock2.draw(gr);

        gr.fill(new Arc2D.Float(240, 150, 80, 60, 0, 90, Arc2D.CHORD));

    }

    public static void drawSun(Graphics2D gr, int x, int y, int r, int R, int n, Color c){
        gr.setColor(c);
        gr.fillOval(x - r, y - r, 2 * r, 2 * r);
        double da = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            double dx1, dy1, dx2, dy2;
            dx1 = r * cos(da * i) + x;
            dy1 = r * sin(da * i) + y;
            dx2 = R * cos(da * i) + x;
            dy2 = R * sin(da * i) + y;
            gr.drawLine((int) dx1, (int)dy1, (int)dx2, (int)dy2);
        }
    }
}