package test;
import main.Shape;
import main.Rectangle;
import org.junit.Test;
import org.junit.Assert;

public class RectangleJUnit {
    @Test
    public void computeArea(){
        Shape rectangle = new Rectangle(2, 3);
        double area = rectangle.computeArea();
        Assert.assertEquals(6.0, area);
    }

    @Test
    public void changeWidth() {
        Shape rectangle = new Rectangle(3, 4);
        rectangle.setWidth(5);
        Assert.assertEquals(5, rectangle.getWidth());
    }

    @Test
    public void changeHeight() {
        Shape rectangle = new Rectangle(3, 4);
        rectangle.setHeight(6);
        Assert.assertEquals(6, rectangle.getHeight());
    }
}

