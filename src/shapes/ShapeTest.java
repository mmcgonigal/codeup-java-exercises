package shapes;

import org.w3c.dom.css.Rect;

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4,5);
        System.out.println(box1.getArea(box1.getLength(), box1.getWidth()));
        System.out.println(box1.getPerimeter(box1.getLength(), box1.getWidth()));

        Rectangle box2 = new Square(5);
        //System.out.println(box2.getArea(box2.getSide()));








    }
}
