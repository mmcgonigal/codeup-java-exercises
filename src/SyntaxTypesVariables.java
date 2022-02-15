public class SyntaxTypesVariables {

    public static void main (String[] args){
        // primitive data types
        //not objects
        //store values of specific type
        //byte, short, int, long, float, double, char, boolean (see chart in curriculum)


        //JS  -- > let, const, var , nameOfVar = value


//        in JAVA
        // 1. you MUST declare its data type before assigning it
        int myFavoriteNumber = 18 ;  // since data type is int , I can't assign 소수점 // myFavoriteNumber = identifier
        System.out.println(myFavoriteNumber);

        //let's store my favorite letter
        char myFavoriteLetter = 'M'; //myFavoriteLetter is an identifier.
        System.out.println(myFavoriteLetter);


        //boolean
        boolean isSunny = true;
        System.out.println(isSunny);

        //GOOD TO KNOW
        //int --> primitive /not an object, it is data type
        //Integer --> object --> give us access to manipulate the Integer as an object

        //double --> primitive
        //Double --> object

        //char --> primitive
        //Character --> object

        //wht not just use double for everything ?
        //it will affect how quickly the program runs.
        //use the correct data type to be more efficient.

        //Strings
        //strings are not primitive data type.
        //objects
        //declaring a variable of the String data type
        String school;
        // assign a value (initializing ) the variable
        school = "Codeup";
        System.out.println(school);

        String team = "Spurs";
        System.out.println(team);

        String student1, student2, student3;
        student1 = "Cody";
        student2 = "Nelson";
        student3 = "Jonathan";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println(student1 + student2 + student3);
        System.out.println(student1 + " " +student2 + " "+ student3);
        System.out.println(student1 + "\"" + student2 + " - " + student3);

        System.out.println(student1 + "\t" + student2 + student3);
















    }

}
