public class MethodsExercises {
    public static void main(String[] args) {
      System.out.println(addition(3,5));
        System.out.println(subtraction(3,10));
        System.out.println(multiplication(3,2));
        System.out.println(division(10,2));
        System.out.println(modulus(26,3));
        //System.out.println(division(32,0)); gave me an error , should give me 0 ?!
        System.out.println(multiplicationWithLoop(3,4));

    }

    //1 basic Arithmetic
    // a.  basic 4 arithmetic functions.
    // b. two parameter.
    // c. test your method to verify the output .
    // d.What happens if we try to divide by zero? what should happen?

    public static int addition(int num1, int num2){
       return num1 + num2;

    }

    public static double subtraction (double num1, double num2){
        return num2 - num1;

    }

    public static double multiplication(double num1, double num2){
        return num1 * num2;

    }

    public static int division(int num1, int num2){
        return num1 / num2;

    }

    public static int modulus (int num1, int num2){
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



}
