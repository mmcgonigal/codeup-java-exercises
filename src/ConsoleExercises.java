import java.util.Formatter ;
import java.util.Scanner;
public class ConsoleExercises {

    public static void main(String[] args){

        ////////////////////////////////////Exercises. ////

//////////Explore the Scanner Class
        //1. copy this code
        //double pi = 3.14159F; //  sout result : 3.141590118408203
        double pi = 3.14159;
        float almostPi = (float)pi;
//        double almostPi = 3.14;
//        System.out.println(pi);
//        System.out.println(almostPi);
        //write some java code that uses the variable pi  output:  //The value of (pi) is approximately 3.14.
       //double almostPi = 3.14;
        System.out.println(pi);
        System.out.println(almostPi);
        System.out.println("The value of Pi is approximately " + almostPi);

        //formatting
        System.out.format("The value of  Pi is approximately %f%n", almostPi);



        ////////////// Explore the Scanner Class

        //1 Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        Scanner scanner = new Scanner(System.in);
                System.out.print("Enter any integer number");
                int inputNumber = scanner.nextInt();  // the anticipated input is number so:  int identifier = name of Scanner class .nextInt()
                System.out.println("you put number " + inputNumber);
                // what happens if user put in other than integer ?  = error : because i already declared data type of inputNumber = int, and  nextInt() is expecting int as next token .
                //String inputNumber = scanner.nextInt(); //  was not able to execute, because inputNumber required String but int is provided.

        //2. prompt user to enter 3 words and store each of them in a separate variable  then display them back in cosole , each on a new line,
        // Scanner , request user to put input , put each token into separate variable.
        Scanner scan = new Scanner(System.in);
                System.out.println("enter 3 different words");
                String tokenOne = scan.nextLine();
                String tokenTwo = scan.nextLine();
                String tokenThree = scan.nextLine();

                System.out.println(tokenOne);
                System.out.println(tokenTwo);
;               System.out.println(tokenThree);
//                System.out.println(tokenOne+ "%n" + tokenTwo + "%n" + tokenThree + "%n"); // this didn't work  result : hamburger%nnoodle%nkalbi%n
                //System.out.println(tokenOne +tokenTwo + tokenThree); no. did not work neither.   result : hamburgernoodlekalbi

        // what happens if you enter less than 3 words ? : nothing happens, just waiting for user token
        // what happens if you enter moer than 3 words?  did not get a change to do that .

        //3. Prompt user to enter a sentence, then store that sentence in a string variable using the "next" method ,  then display back to the user
        Scanner sc = new Scanner(System.in);
                System.out.println("please enter a sentence.");
        String sentence = sc.nextLine();
        System.out.println(" you just wrote : " + sentence );

        //do you capture all the words?  --> no , you need nextLine() for that
        // rewrite the above using nextLine()


        //Calculate the perimeter and area of codeup's classroom

        // assume the room is perfect rectangles.
        //assume that the user will enter valid numeric data for length and width .

        //1. Prompt the user to enter values of length and width of the classroom at code up use nextLine()

        Scanner scanRoom = new Scanner(System.in);
//        scanRoom.useDelimiter("\n");
        System.out.println("please enter the value of length and value of width in order of length then width");
//
//        THIS IS WHEN TOKEN IS "INTEGER"
//        int width = scanRoom.nextInt();
//        int length = scanRoom.nextInt();
//        System.out.println(scanRoom.nextInt() * scanRoom.nextInt());


//        THIS IS WHEN TOKEN IS "STRING"
        String width = scanRoom.nextLine();  //30
        String length = scanRoom.nextLine(); //40
       // double heightNum = scanRoom.nextDouble();  // bonus , add code to accept decimals.

        System.out.println(width); //30
        System.out.println(length); //40

        //int widthNumber = parseInt(int)width; x
        //int widthNumber =parseInt (width, int radix); x
       int widthNum = Integer.parseInt(width);  // as an example : double a = Double.parseDouble("5")  --> returns 5.0
       int lengthNum = Integer.parseInt(length);
        System.out.println(widthNum); //30
        System.out.println(lengthNum); //40   I do not see any difference on console... but i know values are integer.

        int area = widthNum * lengthNum ;
        int perimeter = (widthNum *2) + (lengthNum * 2);
//        double volume = widthNum * lengthNum * heightNum;
        System.out.println("The are of the room is : " + area + " and the perimeter of the room is :  " + perimeter ) ;
//        System.out.println ("The volumn of the room is : " + volume ) ;


        ////////Bonuses/////////

        //added code to accept decimal : line 85;
        //added useDelimiter("\n") : line 73 ;
        //added result of volume : line 99 , line 101


        // rewrite code with nextInt  : line 76 -79
























    }
}
