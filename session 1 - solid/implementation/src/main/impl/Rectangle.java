package impl;

import interfaces.Shape;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Rectangle(double width, double height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    public double computeArea(){
        return this.getWidth() * this.getHeight();
    }

}
