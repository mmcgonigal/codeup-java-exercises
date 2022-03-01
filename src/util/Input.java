package util;

import java.util.Scanner;

public class Input {

    private  Scanner scanner;

    public Scanner getScanner(){
        return scanner;
    }


     public  Input (){
        this. scanner = new Scanner(System.in);
     }

     public static String getString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
     }

     public static int getInt(){
         Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
     }

     public static double getDouble(double min, double max){
         Scanner scanner = new Scanner(System.in);
         System.out.println("enter floats");
         double number  = scanner.nextDouble();
         if(number > min && number < max){
             return number;
         }else{
             getDouble(min, max);
         }
        return number;
     }

     public static boolean yesNo(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("please enter [yes /no/y/n] ");
         String answer = scanner.nextLine();
         if(answer.equalsIgnoreCase("yes")|| answer.equalsIgnoreCase("y") ){
             return true;
         }else if(answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")){
             return false;
         }else{
             return yesNo();
         }
     }




public static void main(String[] args) {

}

}