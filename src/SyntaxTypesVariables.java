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
         myString = "banana";// -->this way works  BUT
        //String myString = "nectarine" ; // this way causes error
        System.out.println(myString);

        //4. change code to assign the value 3.14159 to myString
        //String.myString = 3.14159; --> does not work
        //myString = 3.14159; --> neither does this one.
        System.out.println(myString);

        //5. declaring an long variable named myNumber, but do not assign anything to it.
        //Next try to print out myNumber to console.  what happen??
        long myNumber;
        //System.out.println(myNumber); not working because it is not initialized

        //6.


















    }

}
