package com.company;

import com.company.obj.*;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    private static Sea sea = new Sea(1, 1);
    Sky sky = new Sky(0.33, 1);
    Sun sun = new Sun(0.5, 0.33, 0.1, 1, 20);
    Boat boat = new Boat(0.14, 0.4, 0.3, 0.3);
    Lighthouse lighthouse = new Lighthouse(0.75, 0.2, 0.75, 0.25);
    Rocks rock2 = new Rocks(0.7, 0.7, 0.3, 0.3, new Color(190, 190, 190));






    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;

        sea.draw(gr, getWidth(), getHeight());

        sky.draw(gr, getWidth(), getHeight());

        sun.draw(gr, getWidth(), getHeight());

        boat.draw(gr, getWidth(), getHeight());


        lighthouse.draw(gr, getWidth(), getHeight());

        rock2.draw(gr, getWidth(), getHeight());

//        gr.fill(new Arc2D.Float(240, 150, 80, 60, 0, 90, Arc2D.CHORD));

    }


}