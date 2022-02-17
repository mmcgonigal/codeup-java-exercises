import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args){

        //1 Loops Basics

        // ⭐a.While

        //a-1 Create ️an integer  i with value of 5

//        int i = 5;

        //a-2,3 create a 'while' loop that runs so long as i  is less than or equal to 15
        //each loop iteration, output the current value of i, then increment i by one
//        while ( i <= 15){
//            System.out.println(i);
//                    i++ ;
//        }

        // ⭐️b.Do while

        //b-1 Create a "do-while" loop that will count by 2's starting with 0 and ending at 100.
        //follow each number with a new line.
//
//        int j = 0 ;
//        do{System.out.println(j);
//            j+=2;
//        }while(j < 100);

        //b-2 count 5's backwards from 100 to 10
////
//        int j  = 100;
//        do{  System.out.println(j);
//                j-=5 ;
//        } while (j <= 100 && j >= 10);

        //b-3 create a do-while loop that starts at 2,
        //and displays the number squared on each line while the number is less than 1,000,000.
        //2 4 16 256 65536 ......

        int j  = 2;
        int target = 1000000;
        do{System.out.println(j);
            j *= j ;
        } while ( j >=2 && j < target);

        //⭐️ c.For

        //refactor the previous thw exercises to use for loop instead.

        //for -a while --> for
//        for( int i = 5 ; i <= 15 ; i++ ){
//            System.out.println(i);
//        }

        //for -b do-while --> for
        //1. count by 2 up to 100
//        for( int i = 0; i <= 100; i+=2){
//            System.out.println(i);
//
//        }

        //2. count backwards by 5s  from 100 to 10
//        for(int i = 100; i >=10; i-=5 ){
//            System.out.println(i);
//        }
//

        //3. loop starts from 2  less than 1,000,000  result  2 4 16 256....
//        for(int i = 2; i < 1000000; i*=i){
//            System.out.println(i);
//        }



        // 2.Fizzbuzz

        // 2 write a program that prints the numbers from  1 -100
         //fizz = multiple of 3
        //buzz = miltiple of 5
        //fizzbuzz = multiple of both
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 & i % 5 ==0 ){
                System.out.println("fizz buzz");
            } else if ( i % 3 ==0){
                System.out.println("Fizz");
            } else if ( i % 5 ==0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }

        //3. display table of powers
        //creat Scanner
        //ask user to put integer
        //while user input number it will make table
        // put everything  in yes or no question of do you want to play more if / else  ?
        // then put everything into do while  so you can ask this question to the user again

        Scanner scanner = new Scanner(System.in);

//        String leftAlignFormat = "| %-6s | %-4d | %n";




        System.out.println("Do you want to play ?");
            String answer = scanner.nextLine();
            String yes = "yes";
            String no = "no";

            if (answer.equalsIgnoreCase(yes) || answer.contains("y") || answer.contains("Y")) {


                System.out.println("What number would you like to go up to?");
                int token2 = scanner.nextInt();
                System.out.println("Here is the table!");
                System.out.println("number | squared | cubed");
                int i = 0;
                while (i <= token2) {
                    System.out.println(i + "     |     " + i * i + "     |      " + i * i * i);
                    i++;
                }

            } else {
                System.out.println(" okay bye! ");
                scanner.close();
            }




            //4.convert given number grades into letter grades

        Scanner sc = new Scanner(System.in);
            String response ;
        do{
               System.out.println("What is your numeric grade?");
               int point = sc.nextInt();
               if (point <= 100 && point >= 88) {
                   System.out.println("A");
               } else if (point <= 87 && point >= 80) {
                   System.out.println("B");
               } else if (point <= 79 && point >= 67) {
                   System.out.println("C");
               } else if (point <= 66 && point >= 60) {
                   System.out.println("D");
               } else if (point <= 59 && point >= 0) {
                   System.out.println("F");
               }
            System.out.println("Do you want to know your corresponding letter grade? ");
            response = sc.nextLine();
           }while(response.equalsIgnoreCase("yes") || response.contains("y") || response.contains("Y") );






























    }
}
