import java.util.Scanner;

public class MethodsExercises {

    //1 basic Arithmetic
    // a.  basic 4 arithmetic functions.
    // b. two parameter.
    // c. test your method to verify the output .
    // d.What happens if we try to divide by zero? what should happen?

    public static int addition(int num1, int num2) {
        return num1 + num2;

    }

    public static double subtraction(double num1, double num2) {
        return num2 - num1;

    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;

    }

    public static int division(int num1, int num2) {
        return num1 / num2;

    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;

    }
    //Food for thought  : what happens if we try to divide by zero

    //*** BONUS**//

    //create your multiplication without * operator (loop might be helpful)

    //pseudo ::
    //1, input 2 argument,
    //2 first arg
    public static int multiplicationWithLoop(int num1, int num2) {
        int answer = 0;
        for (int i = 1; i <= num2; i++) {
            answer += num1;
        }
        return answer;

    }
//
//    //3*4 = 3+3+3+3
//    public static int multiplicationWithRecursion(int num1, int num2){
//        int sum = 0;
//        if(num2 == 0){
//            return num1;
//        }else{
//            if(num2 == 1){
//                sum= num1;
//            }else if( num2 = 2){
//                sum= num1 + num1;
//            }
//            }
//        }
//    }


    //    // create a method that validates that user input is in a certain range,
//    public static int getInteger(int min, int max){
//        Scanner scanner = new Scanner (System.in);
//        System.out.println("please enter the integer between " + min + " and " + max);
//        int userInput = scanner.nextInt();
//        if((userInput> min) && (userInput<max)){
//            System.out.println(userInput + " is a valid number.");
//
//        }else{
//            System.out.println(userInput + " is not a valid number.\n Please try again.");
//            getInteger(min,max);
//        }
//        return
//    }
    //5! = 1 x 2 x 3 x 4 x 5
    public static long factorial(long number) {
        long sum = 1;
        if ((number < 1) || (number < 10)) {
            Scanner validation = new Scanner(System.in);
            System.out.println("Please enter valid number");
            long userInput = factorial(validation.nextLong());
        } else if(number > 1 && number < 10){
            for (int i = 1; i <= number; i++) {
                sum = sum * i;
            }

        }return sum;
    }


        public static void main (String[]args){


//        System.out.println(addition(3,5));
//        System.out.println(subtraction(3,10));
//        System.out.println(multiplication(3,2));
//        System.out.println(division(10,2));
//        System.out.println(modulus(26,3));
//        //System.out.println(division(32,0)); gave me an error , should give me 0 ?!
//        System.out.println(multiplicationWithLoop(3,4));
//        System.out.println(getInteger(5,25));
//        System.out.println(getInteger(6,10));

            //bonus 3.

            Scanner factorialResponse = new Scanner(System.in);
            System.out.println(" please input any integer between 1 to 10");
            long num = factorialResponse.nextInt();
            System.out.println(factorial(num));


        }

}