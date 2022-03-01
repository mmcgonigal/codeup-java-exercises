import java.util.*;

public class ServerNameGenerator {
//    private String[] arr;
//
//    public  String[] getArray(){
//        return arr;
//    }
//    public void setArr(String[] arr) {
//        this.arr = arr;
//    }





    //TODO Create a method that will return a random element from an array of strings.

//   // method for random number 0-9 ::
//    public int randomIndex(){
//       int number = (int)(Math.random()*10);
//       return number;
//    }

   // int ranNumber = 0;
    public static int randomNumber (String[] arr){
        Random random = new Random();

       int ranNumber = random.nextInt(arr.length);
        return ranNumber;
    }


    public static void main(String[] args) {

        //TODO Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.

        String [] adj = {"charming","cruel","fantastic","perfect","beautiful","dirty","funny","gorgeous","strict","obnoxious","annoying"};
        String [] noun = {"Jane Doe","John Doe","Thomas","George","monkey","bird","purse","dino","car","truck","backpack","cat","dog"};
        System.out.println(adj[randomNumber(adj)]);
        System.out.println(adj[randomNumber(adj)]);
        System.out.println(noun[randomNumber(adj)]);

        String randomAdj = adj[randomNumber(adj)];
        String randomNoun = noun[randomNumber(adj)];

        System.out.println("Here is your server name :  ");
        System.out.println(randomAdj + "-" +randomNoun);



       // System.out.println(Arrays.toString(adj[randomNumberAdj()]));
    }




}
