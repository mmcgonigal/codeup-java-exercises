import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
//        sayHi();
//        System.out.println(sayHello("orange"));
//        System.out.println(userName());
//        System.out.println(addTwo());
//
    }

    // version 1
    public static void sayHello(int times) {
        for (int i = 0; i < times; i += 1) {
            sayHello();
        }
    }


    // version 2
    public static void sayHello() {
        sayHello("Hello", "World");
    }
    // version 3
    public static void sayHello(String name) {
        sayHello("Hello", name);
    }
    // version 4
    public static void sayHello(String greeting, String name) {
        System.out.println(greeting + ", " + name + "!");
    }




//    //public static void sayHi(){}
//    // public : the specific can be accessed by other package and classes
//    //static : not declaring specific primitive type
//    //void/String/int ...-> return type
//    public static void sayHi(){
//        System.out.println  ( "hi");
//
//    }
//    public static String sayHello(String name){
//        return "Hello " + name;
//    }
//
//
//
//    //1.wrtite a method that accepts username from input and returns "hello , userInput"
//
//    public static String userName(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("what is your id?");
//        String userId = scanner.next();
//
//       return userId;
//    }

    public static int addTwo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("give me two number");
        int no1 = scan.nextInt();
        int no2 = scan.nextInt();
        return no1+no2;

    }
    // RECURSION
    //often have infinite loops UNLESS break/stopping point
//    public static void sayHello(){
//        sayHello();
//    }

    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return; //exits
        }
        System.out.println(n);
        count(n - 1);
    }






}
