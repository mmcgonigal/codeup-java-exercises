import java.util.Locale;

public class Strings {
    public static void main (String[] args){

        //Strings
        //object
        String myName = "mina";
        String otherName = "MINA";
//
//        myName = {
//                value : "Mina",
//                endsWith : function (string){check to see if the  mayName's value ends with  certain string such as "a"  => because of this , dot.notation for method does not work.
//
//        }

        if(myName.equals(otherName)){
            System.out.println("names match");
        }else {
            System.out.println("not match");
        }

        //immutable --> the value can not change
        String greeting = " Hello" ;
        greeting = greeting + "he";
        System.out.println("greeting");


        //string Manipulation
        String sentence = "The quick brown fox jumped over the lazy dog";

        //.charAt(int index) --> find a character at a given index
        System.out.println(sentence.charAt(0));
        char findingChar = sentence.charAt(8);
        System.out.println(findingChar);

        //.indexOf(String subString) -->
        System.out.println(sentence.indexOf("quick")); // finds first string that matches so in this case would be "q"  and will be 4 --> return int value ( -1 if not found)

        System.out.println(sentence.indexOf("j"));

        //.length() -->doen't accept paras , returns an int (starts at 1 )
        System.out.println(sentence.length());

        //replace(String the thing we replacing, String replacing)  --> it's gonna replace
        System.out.println(sentence.replace("quick", "quicka"));
        System.out.println(sentence);

        String sentence2 =  "Thea quicka browna foxaa jumped over the lazy doga";
        System.out.println(sentence2.substring(5,10));
        System.out.println(sentence2);

        System.out.println(sentence2.toLowerCase(Locale.ROOT));
        System.out.println(sentence2);










    }
}
