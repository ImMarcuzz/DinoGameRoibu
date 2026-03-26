package com.example.dino;

import javafx.scene.image.Image;

public class Sprite {
   private double x;
   private double y;
   private double width;
   private double height;
   private double vx;
   private double vy;
   private Image immagine;

    public Sprite(double x, double y, double width, double height, double vx, double vy, Image immagine) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.vx = vx;
        this.vy = vy;
        this.immagine = immagine;
    }

    public void update(long now){
        this.x += vx +
    }
}
