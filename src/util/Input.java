package util;

import java.util.Scanner;

public class Input {

    private  Scanner scanner;

    public Scanner getScanner(){
        return scanner;
    }


     public Input (){
        this. scanner = new Scanner(System.in);
     }

     public String getString() {
        return scanner.nextLine();
     }

     public int getInt(){
         return scanner.nextInt();
     }

     public double getDouble(double min, double max){
         System.out.println("enter floats");
         double number  = scanner.nextDouble();
         if(number > min && number < max){
             return number;
         }else{
             getDouble(min, max);
         }
        return number;
     }

     public boolean yesNo(){
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