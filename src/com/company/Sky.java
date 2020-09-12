package com.company;

import java.awt.*;

public class Sky implements Draw{
    int height;

    public Sky(int height, int width) {
        this.height = height;
        this.width = width;
    }

    int width;


    @Override
    public void draw(Graphics2D gr) {
        sky(gr, height, width);
    }

    private void sky(Graphics2D gr, int height, int width){
        gr.setColor(new Color(5,211,255));
        gr.fillRect(0, 0, width, height);
    }
}
