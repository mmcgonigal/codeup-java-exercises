package util;

import java.util.Scanner;

public class Input {

    private  Scanner scanner;


 public Input (){
    this. scanner = new Scanner(System.in);
 }

 public String getString(){
    return scanner.nextLine();
 }
 public int getInt(){
     return scanner.nextInt();
 }
 public double getDouble(double min, double max){
     double number  = scanner.nextDouble();
     if(number > min && number < max){
         return number;
     }else{
         getDouble(min, max);
     }
    return number;
 }

public static void main(String[] args) {

}

}