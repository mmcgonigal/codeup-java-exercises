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

     public static int getInt(){  // 이니셜라이징 getInt
        // Scanner scanner = new Scanner(System.in);
       // int numInt = scanner.nextInt();
        // String numInt;
        int num =0;
         String numInt = getString(); // 이니셜라이징 getString method    그리고 그걸 numInt 에 넣음.
        try { //   그리고 28 . 29 다음 이 라인을 퍼폼 해라 ,
          num = Integer.parseInt(numInt);
            return num;
         }catch (Exception e){   // 만약 애러가 있을경우 , 그에러가 케치들 중에 하나 있을 경우 , 그 캐치 구문을 수행하면 됨 .
            System.out.println("e =  invalid input" + e.getMessage() );
            e.printStackTrace();
        }
        return num;
     }

     public static double getDouble(double min, double max){
         //Scanner scanner = new Scanner(System.in);
         System.out.println("enter floats");
         double numDbl;
         numDbl  = getString();
         try{

         }
         if(numDbl > min && numDbl < max){
             return numDbl;
         }else{
             getDouble(min, max);
         }
        return numDbl;
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