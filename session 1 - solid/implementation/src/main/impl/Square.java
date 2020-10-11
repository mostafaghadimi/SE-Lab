package impl;

import interfaces.Shape;

public class Square implements Shape {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side){
        this.setSide(side);
    }

    public double computeArea() {
        return this.getSide() * this.getSide();
    }

}
