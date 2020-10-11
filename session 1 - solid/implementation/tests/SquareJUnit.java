package test;
import main.Shape;
import main.Square;
import org.junit.Test;
import org.junit.Assert;

public class RectangleJUnit {
    @Test
    public void computeArea(){
        Shape square = new Square(5);
        double area = square.computeArea();
        Assert.assertEquals(25.0, sarea);
    }

    @Test
    public void changeParameter() {
        Shape square = new Square(2);
        rectangle.setSide(4);
        Assert.assertEquals(4.0, square.getSide());
    }
}

