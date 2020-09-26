package com.company;

import java.awt.*;

public class Sky implements Draw{
    private double height;
    private double width;

    public Sky(double height, double width) {
        this.height = height;
        this.width = width;
    }




    @Override
    public void draw(Graphics2D gr, int w, int h) {
        sky(gr, height * h, width * w);
    }

    private void sky(Graphics2D gr, double height, double width){
        gr.setColor(new Color(5,211,255));
        gr.fillRect(0, 0, (int) width,(int) height);
    }
}
