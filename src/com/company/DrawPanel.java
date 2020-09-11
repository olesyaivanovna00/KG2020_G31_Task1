package com.company;

import javax.swing.*;
import java.awt.*;
import static java.lang.StrictMath.cos;
import static java.lang.StrictMath.sin;

public class DrawPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;

        //drawSun(gr, 400, 350, 50, 1000, 60, Color.pink);

        Boat b = new Boat(100, 400, 200, 200);
        //b.draw(gr);

        Lighthouse l = new Lighthouse(400, 100, 500, 300);
        //l.draw(gr);

        Sea s = new Sea(400, 400, 700, 30);
        s.draw(gr);
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