// class - defining the class
// HelloWorld is the name of the class and it matches the name of the .java file
public class HelloWorld {

    //method- similar to a function in javascript
    //main method --> specific method in java that acts as our entry point when running java
    //(similar to starting point in a board game)
    //like the front door of a house, you have to go through the door to get to any of the other rooms .

    public static void main(String[] args){
        //public - pinned for later
        //static - pinned for later
        //void - for now, it means this method doesn't expect anything to be refunded
        //main - name of our method, main is keyword that is going to be searched as the entry point.
        //String[] args - passing in a string array named args

        //print out "wcw.txt world" to the console
        System.out.println("cool");



        ///////////////////////////////////////// EXERCISE  /////

        //1. create an int variable names myFavoriteNumber.
        int myFavoriteNumber = 527;
        System.out.println(myFavoriteNumber);

        //2. create a string variable names myString
        String myString = "test";
        System.out.println(myString);

        //3. change your code to assign a character value to myString
        // myString = "banana";// -->this way works  BUT
//        String myString = "nectarine" ; // this way causes error
        // myString = "b";
        System.out.println(myString);

        //4. change code to assign the value 3.14159 to myString
        //String.myString = 3.14159; //--> does not work
        //myString = 3.14159; --> neither does this one.
        System.out.println(myString);

        //5. declaring an long variable named myNumber, but do not assign anything to it.
        //Next try to print out myNumber to console.  what happen??
        //long myNumber;
        //System.out.println(myNumber);//not working because it is not initialized

        //6. change code to assign value of 3.14 to myNumber
        //float myNumber = 3.14f; //gives red-line because 3.14's data type is double.
        //float myNumber = 3.1;    // this works with "f"
        //System.out.println(myNumber);

        //7. change code to assign the value 123L to my number
        //long myNumber = 123L;
        //System.out.println(myNumber); // result of 123

        //8. change code to assign value 123 to myNumber
        //long myNumber = 123;
        //System.out.println(myNumber); // result of 123 same as long myNumber = 123L
        //WHY ? -->google says "a whole number is assumed to be an int and decimal is assumed to be a double." ....??

        //9. change code to declare myNumber as a float and assign value to it.
        //float myNumber = 3.14; //error says incompatible types.
        //2WAYS TO FIX IT ?!
        //double myNumber = 3.14;
        // System.out.println(myNumber);

        // second way -- casting ?!
        float myNumber = 3.14f;
        //System.out.println(myNumber);
        double my22Number;
        my22Number= (double) myNumber;
//
        //10.
        int x = 5;
        System.out.println(x++); //5 post Increment
        System.out.println(x); //6

        int y = 5;
        System.out.println(++y);//6 pre increment
        System.out.println(y);//6

        //11. try create variable name class
//        String class = "wcw.txt";
//        System.out.println(class); // not a statement, class cant be identifier

        //12.
        String theNumberThree = "three";
        Object o = theNumberThree; // Object o = "three"
        System.out.println(o); // "three"
        //int three = (int) o;  // meaning , integer valueable of identifier three = "three" into number?!
        //System.out.println(three); // String cannot be cast to class
        //int three = (int) "three"; // still no because "three" is string and you cant cast that to number

        //13 . rewrite shorthand assignment operators.
        int j = 4;
        //j = k + 5;
        j += 5;
        System.out.println(j); //9

        int a = 3;
        int b = 4;
        //a = b * a;
        a *=b;
        System.out.println(a); //12

        int m = 10;
        int n = 2;
        m /= n ; //
        n-=m;  // /
        System.out.println(m);
        System.out.println(n);

        //14. what happens if assign value of number larger than type can hold ?

        // byte bigNumber = 280;
        // System.out.println(bigNumber); // message:  incompatible types: possible lossy conversion from int to byte

        //What happens if increment a numeric variable past the type's capacity?

        byte l = 127;
        l++;
        System.out.println(l);  // instead of being int l =128 , it because -128 ... why ?





    }

}
