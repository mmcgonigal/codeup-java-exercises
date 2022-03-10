package shapes;


import util.Input;

public class CircleApp {
    private static int count = 0;
    public static int getCount(){
        return count+1;
    }

    public static void main(String[] args) {
        Input input = new Input();
       do{
        System.out.println("please input any number to set radius for making circle");
        double radius = input.getDouble();
//        long radius = input.getScanner().nextLong();
//        double newRadius = (double)radius;
        Circle circle= new Circle(radius);

        count =  getCount();

        System.out.println("the area of this circle is  : " + circle.getArea(radius));
        System.out.println("the circumference of this circle is : " + circle.getCircumference(radius));

        System.out.println(" would you like to make more circle?[yes/no]");
//        String answer = input.getString();
        ;}while(input.yesNo());
       
        System.out.printf(" you have made %d number of circles now ",count);









        // what if input radius is not a number ?

        //System.out.println(radius);
        System.out.println();

    }


}
