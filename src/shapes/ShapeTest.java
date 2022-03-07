package shapes;

public class ShapeTest {


    public static void main(String[] args) {
        Measurable myShape;

        myShape  = new Square(10);
        double sArea = myShape.getArea();
        System.out.println("Square area is : " + sArea);
        double sPerimeter = myShape.getPerimeter();
        System.out.println("square perimeter is : " + sPerimeter);

        myShape = new Rectangle(8,9);
        double rArea = myShape.getArea();
        System.out.println("Rectangle area is  : " + rArea);
        double rPerimeter = myShape.getPerimeter();
        System.out.println("Rectangle perimeter is " + rPerimeter);




//        Rectangle box1 = new Rectangle(4,5);
//        System.out.println(box1.getArea(box1.getLength(), box1.getWidth()));
//        System.out.println(box1.getPerimeter(box1.getLength(), box1.getWidth()));
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea(box2.getLength(), box2.getWidth()));

        //Square box3 = new Square(4);
        //box3.getArea(4);








    }
}
