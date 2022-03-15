public class SyntaxTypesVariables {

    public static void main (String[] args){
        // primitive data types
        //not objects
        //store values of specific type
        //byte, short, int, long, float, double, char, boolean (see chart in curriculum)

//
//        //JS  -- > let, const, var , nameOfVar = value
//
//
////        in JAVA
//        // 1. you MUST declare its data type before assigning it
//        int myFavoriteNumber = 18 ;  // since data type is int , I can't assign 소수점 // myFavoriteNumber = identifier
//        System.out.println(myFavoriteNumber);
//
//        //let's store my favorite letter
//        char myFavoriteLetter = 'M'; //myFavoriteLetter is an identifier.
//        System.out.println(myFavoriteLetter);
//
//
//        //boolean
//        boolean isSunny = true;
//        System.out.println(isSunny);
//
//        //GOOD TO KNOW
//        //int --> primitive /not an object, it is data type
//        //Integer --> object --> give us access to manipulate the Integer as an object
//
//        //double --> primitive
//        //Double --> object
//
//        //char --> primitive
//        //Character --> object
//
//        //wht not just use double for everything ?
//        //it will affect how quickly the program runs.
//        //use the correct data type to be more efficient.
//
//        //Strings
//        //strings are not primitive data type.
//        //objects
//        //declaring a variable of the String data type
//        String school;
//        // assign a value (initializing ) the variable
//        school = "Codeup";
//        System.out.println(school);
//
//        String team = "Spurs";
//        System.out.println(team);
//
//        String student1, student2, student3;
//        student1 = "Cody";
//        student2 = "Nelson";
//        student3 = "Jonathan";
//
//        System.out.println(student1);
//        System.out.println(student2);
//        System.out.println(student3);
//
//        System.out.println(student1 + student2 + student3);
//        System.out.println(student1 + " " +student2 + " "+ student3);
//        System.out.println(student1 + "\"" + student2 + " - " + student3);
//
//        System.out.println(student1 + "\t" + student2 + student3);
//
//        //RESERVED WORDS
//        //abstract continue for new switch assert default goto package synchronized boolean do if private this break double implements protected throw byte else import public throws case enum instanceof return transient catch extends int short try char final interface static void class finally long strictfp volatile const float native super while//
//
//
//        //Arithmetic Expression.
//         //3, 9
//        int firstNum = 3;
//        int secondNum = 9;
//        int result = firstNum + secondNum ;
//        System.out.println(result);
//
//        //120 ,120
////        byte firstEX = 120;
////        byte secondEX = 120 ;
////        int resultEX = firstEX + secondEX;
////        System.out.println(resultEX);
////        System.out.println(firstEX + " " + secondEX);
//
//        //
//        byte exp1 = 120;
//        byte exp2 = 125;
//        exp1++;
//        System.out.println(exp1);
//
//        // JS  --> let , var , const
//        // JS --> const, doesn't allow you to reassign
//
//        //java --> 'final' keyword
//        // final keyword --> you cannot re-assign the variable once it's been declared
//
//        final String myName = "mina";
//        //myName = "banana" ; -->  I cannot change myName to banana because it is final.
//
//        //CASTING   --> don't fret if you don't fully understand  yet .
//        //coerce  -->  persuade an unwilling person to do something forcefully.
//
//
//        int myInteger = 900;
//        long morePrecise = myInteger;
//
//        System.out.println(myInteger);
//        System.out.println(morePrecise);
//
//        // explicit casting (coercing the pi (double) in to an int data type )
//        double pi = 3.14159;
//        int almostPi = (int) pi;
//        System.out.println(almostPi);
//


        ///////////////////////////////////////// EXERCISE /////

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

        //8. change code to assign value 123 to myNumber❓
        //long myNumber = 123;
        //System.out.println(myNumber); // result of 123 same as long myNumber = 123L
        //WHY ? -->google says "a whole number is assumed to be an int and decimal is assumed to be a double." ....??

        //9. change code to declare myNumber as a float and assign value to it.
        //float myNumber = 3.14; //error says incompatible types.❓
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
