package util;


import java.util.Scanner;

public class Input {


    private Scanner scanner;

    public Scanner getScanner() {
        return scanner;
    }
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }



    public Input(){
        scanner = new Scanner(System.in);
    }


    public String getString(){
        System.out.println("Please enter any String");
        String string = scanner.next();
        return string;
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return this.scanner.nextLine();
    }


    public boolean yesNo(){
        System.out.println("Please answer yes or no");
        String answer = scanner.next();
        if(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")){
            return true;
        }else{
            return false;
        }
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        return yesNo();
    }

    public int getInt(){
        System.out.println("please type in any integer");
        int num = this.scanner.nextInt();
        return num;
    }
    public int getInt(int min, int max){
        int answer;
        do{System.out.printf("please enter integer between %d and %d. %n",min, max);
        answer = scanner.nextInt();}
        while(answer > max || answer < min);
        return answer;
    }

    public double getDouble(){
        System.out.println("Please enter any decimal number");
        return this.scanner.nextDouble();
    }
    public double getDouble(double min, double max){
        double userInput;
        do{
            System.out.printf("Please enter decimal number between %f and %f. %n",min ,max );
            userInput =  scanner.nextDouble();
        }while(userInput >max || userInput < min);
        return userInput;
    }

//
//    private  Scanner scanner;
//
//    public Scanner getScanner() {
//        return scanner;
//    }
////    public Scanner getScanner(){
////        return scanner;
////    }
//
//
//     public Input (){
//        this.scanner = new Scanner(System.in);
//     }
//
//     public static String getString() {
//
//        return scanner.nextLine();
//     }
//
//     public static int getInt(){  // ?????????????????? getInt
//        int num =0;
//         String numInt = getString(); // ?????????????????? getString method    ????????? ?????? numInt ??? ??????.
//        try { //   ????????? 28 . 29 ?????? ??? ????????? ?????? ?????? ,
//          num = Integer.parseInt(numInt);
//            return num;
//         }catch (Exception e){   // ?????? ????????? ???????????? , ???????????? ????????? ?????? ?????? ?????? ?????? , ??? ?????? ????????? ???????????? ??? .
//            System.out.println("e =  invalid input" + e.getMessage() );
//            e.printStackTrace();
//        }
//        return num;
//     }
//
////     public static double getDouble(double min, double max){
////         //Scanner scanner = new Scanner(System.in);
////         System.out.println("enter floats");
////         double numDbl;
////         numDbl  = getString();
////         try{
////
////         }
////         if(numDbl > min && numDbl < max){
////             return numDbl;
////         }else{
////             getDouble(min, max);
////         }
////        return numDbl;
////     }
//
//     public static boolean yesNo(){
//
//         String answer = this.scanner.nextLine();
//         if(answer.equalsIgnoreCase("yes")|| answer.equalsIgnoreCase("y") ){
//             return true;
//         }else if(answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")){
//             return false;
//         }else{
//             return yesNo();
//         }
     }





