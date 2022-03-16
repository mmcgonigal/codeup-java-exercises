import java.util.ArrayList;

public class Fibonacci {

    public static ArrayList<Integer> fibonacci(){
       ArrayList<Integer> fibo = new ArrayList<>();
        int firstNum = 1;
        int secondNum = 1;
        int nextNum = 0;
        fibo.add(firstNum);
        fibo.add(secondNum);

            for(int i = 2; i <15 ; i++ ){

                nextNum = firstNum + secondNum;
               firstNum = secondNum;
                secondNum = nextNum;

                fibo.add(nextNum);




            }
            return fibo;
        }




    public static void main(String[] args) {
        System.out.println(fibonacci());
    }
}
