package shapes;


import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("please input any number to set radius for making circle");
        double radius = input.getDouble();
//        long radius = input.getScanner().nextLong();
//        double newRadius = (double)radius;
        Circle circle= new Circle(radius);
        System.out.println("the area of this circle is  : " + circle.getArea(radius));
        System.out.println("the circumference of this circle is : " + circle.getCircumference(radius));

        System.out.println(" would you like to make more circle?[yes/no]");
        String answer = input.getString();
        ;









        // what if input radius is not a number ?

        //System.out.println(radius);
        System.out.println();

    }


}
