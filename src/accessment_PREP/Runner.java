package accessment_PREP;

public class Runner {
//    1. Create a public static method called **ascending** that takes in an `array` and that returns an `array`. Return the
//   `array` that was made in ascending order.
//
//    2. Create a public static method called **countWords** that takes in a `string` and returns how many words are inside that `string`
    public static int countWord(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) !=' '){
                count ++;
                while(str.charAt(i) != ' ' && i <str.length()-1){
                    i++;
                }
            }
        }
        return count;
    }
//
//    3. Create a public static method called **Calculator** that takes in two numbers and a mathematical operator + - / * and will perform a calculation with the given numbers
    public static double calculator(double num1, double num2, char op){
        if(op == '+'){
            return num1 + num2;
        }else if ( op == '-'){
            return num1 - num2;
        }else if (op == '/'){
            return num1/num2;
        }else if (op == '*'){
            return num1 * num2;
        }else{
            return 0; // we need something to return , so i will make that as else and return 0;
        }
    }
//
//    4. Create a public static method called **cardHidden** that takes a credit card number as a `string` and only displays the last four characters. The rest of the card number must be replaced by ************.
    public static String cardHidden(String cardNum){
        String hiddenCard  = "";
        for(int i = 0; i <cardNum.length(); i ++){
            if(i>= 4){
                hiddenCard += '*';
            }
        }hiddenCard += cardNum.substring(cardNum.length()-4);
        return hiddenCard;
    }


//
//    5. Create a public static method called **reverseOdd** that given a `string`, reverse all the words which have odd length. The even length words are not changed
    public static String reverseOdd(String str){
        String[] words = str.split("");
        String result = "";
        for(int i=0;  i < str.length(); i++ ){
            if(words[i].length() % 2 == 0) {
                result += words[i] + "";
            }else{

            }result += new StringBuilder(words[i]).reverse()+"";
        }return result;
    }
//
//    6. Create a package called **accessment_PREP.bigDinner**. Inside **accessment_PREP.bigDinner** create a class called **dinnerApp** where your main method will be in order to test the following questions
//
//7. Inside **accessment_PREP.bigDinner** create a new class called **Dinner**. Make instance fields that can't be accessed outside Dinner. These fields should be of type `String` named `appetizer`, `drink`, `side`, `meal`, and `dessert`. Create a constructor that sets the `appetizer`, `drink`, `side`, `meal`, and `dessert`. Write getters and setters for each property.
//
//            8. Create an interface named **Sentence** inside **accessment_PREP.bigDinner**
//            - Specify an instance method named `myDinner` that accepts no arguments and returns a `String`.
//
//
//            9. Change your **Dinner** class so that it implements the **Sentence** interface.
//            - The implementation of the `myDinner` method on Dinner class should return the following message:
//            ```
//    WOW! You have appetizer, meal, side, drink, and a dessert to top it off? That's one big dinner!
//            ```
//
//            - Remember to replace the instance properties of `appetizer`, `drink`, `side`, `meal`, and `dessert` to display the assigned values.
//
//10. Inside **dinnerApp** create a new instance of **Dinner** and make your new instance of **Dinner** use the **Sentence** interface# Oberon-Java-Asessment-Prep-Day2# Sirius-java-assessment-prep-v2
}
