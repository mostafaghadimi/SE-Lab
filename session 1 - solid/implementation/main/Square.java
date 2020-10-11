package main;
import main.Shape;

public class Square implements Shape {
    private double side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public Square(double side){
        this.setSide(side);
    }

    double computeArea() {
        return getSide() * getSide();
    }

    void changeParameter(double side) {
        this.setSide(side);
    }
}
