public class ControlStatementsAndLoops {
    public static void main(String[] args){

        //CONTROL STATEMENT
        //allows us to control the flow of the code
        //operators - tools needed to control the flow
        // ==, !=, >,<, <= , >= // operators

        //boolean expression
        //java statement that results in either true or false.

        int myFavNum = 18; // statement
        boolean yesOrNo = myFavNum > 50 ; // result is a boolean

        System.out.println(yesOrNo);

        //logical operators
        //&&, ||,  &, |, !

        // if statement
        int age = 31;
        int bmi = 20;
        String hair = "curly";
        if(age > 30 && bmi < 100){
            System.out.println("still young and healthy! ");
        } else {
            System.out.println("other");
        }
//        if(hair == "curly"){
//            System.out.println("oh fun time!");
//        }else{
//            System.out.println("oops");
//        }


        // STRING COMPARISON

        // when you are comparing String , make sure use .equals("string") instead of ==

        //equals() method ===================================

        if (hair.equals("curly")){
            System.out.println(".equals() is necessary for string comparison ");
        }else {
            System.out.println("oops! ");
        }

        String myName = "Mina";
        String yourName = "mina" ;

        boolean nameMatching = myName.equals(yourName);
        System.out.println("nameMatching");
        boolean nameNoCase = myName.equalsIgnoreCase(yourName);

        //equalsIgnoreCase() method =====================================
        if (myName.equalsIgnoreCase(yourName)){
            System.out.println("this is the example of .equalsIgnoreCase()");
        }else{
            System.out.println("or not?! ");
        }

        //contains() method =================
        String a = "i love studying java" ;
        if(a.contains("love")){
            System.out.println("I like it better than js .");
        }else{
            System.out.println("nope. this is a  more difficult course than js.");
        }

        String b = "candy";
        int L = 0;
        if (b.equals("candy")){
            System.out.println("this is a candy");
        }else {
            System.out.println("this is a chocolate");
        }
        if(L==3) {
            System.out.println(" L is 3");
        }else{
            System.out.println(" L is not 3");
        }



        // LOOPS
        //iterating through an index /array

        //for
        for(int i = 0 ; i < 10 ; i++){
            System.out.println(" i is currently at: "+ i);
        }
        //while
        //not sure how many times it will loop
        //check the condition first before it starts looping
        int i = 0;
        while( i < 10 ){
            System.out.println("i is : " + i);
            i++;
        }
        int g = 0, sum=0;
        while (g <1000){
            sum += i++; //sum = 0 +1+ 2+ 3 +....+999
        }
        System.out.println(" 1+2+3+...+998+999 = " + sum);

        //do while
        //executes code once before checking
        int j = 0;
        while( j < 10 ){
            System.out.println("j 's number is : " + j);
            j++;
        }

        //continue

        int counter = 0;
        int k = 0;
        while(k < 10){
            k++;
            System.out.println("WHILE k is: " + k);
            if(k % 2 == 0) {
                counter +=2;
                continue;
            }
            System.out.println("counter: " + counter);

        }

        int score = 95;
        if (score >= 90){
            System.out.println("Your grade is A");
        }else if (score >= 80 && score <90){
            System.out.println("Your grade is B");
        }else if (score>= 70 && score <80 ){
            System.out.println("Your grade is C");
        }else if (score>=60 && score <70){
            System.out.println("Your grade is D");
        }else{
            System.out.println("Fail");
        }

        int N = 30;
        for(int m = N; m>30; m-- ){
            for(int h = m; h >0; h--){
                System.out.print("*");
            }
            System.out.println();
        }















    }




}
