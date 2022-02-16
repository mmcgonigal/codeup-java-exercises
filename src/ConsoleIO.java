import java.util.Scanner;

public class ConsoleIO {


    public static void main(String[] args) {
////      String name = "codeup";
////      System.out.printf("Hello there, %s. Nice to see you.%n", name); //printf  = print format
//        String greeting = "Salutations";
//        String name = "codeup";
//        System.out.printf("%s, %s!", greeting, name);
//        System.out.printf("%s, %s,", name, greeting);
//


       Scanner scanner = new Scanner(System.in); //create a Scanner object ,
       System.out.println("hello world, My name is ");
       String UserInput = scanner.nextLine();  //nextLine() will bring up user input( token)  with white space
       System.out.println ("oh Hello,"+UserInput+ ", nice to meet you");


       Scanner sc = new Scanner(System.in);
       System.out.println("Hello, My name is ");
       String UserName = scanner.next(); //next() will bring up only first token
       System.out.println ("oh Hello,"+UserName+ ", nice to meet you");







       }

    }








