package shapes;


import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input scan = new Input();
        System.out.println("please input any number to set radius for making circle");
        long radius = scan.getScanner().nextLong();
        double newRadius = (double)radius;
        Circle circle= new Circle(radius);
        System.out.println("the area of this circle is  : " + circle.getArea(newRadius));
        System.out.println("the circumference of this circle is : " + circle.getCircumference(newRadius));

        System.out.println(" would you like to make more circle?[yes/no]");
        String answer = scan.getString();
        ;









        // what if input radius is not a number ?

        //System.out.println(radius);
        System.out.println();

    }


}
