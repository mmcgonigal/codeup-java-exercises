import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayLecture {

    public static int max(int a, int b){
        return (a > b)? a : b;
    }





    public static void main (String[] args){


        // HWAT ARE ARRAYS
        //--->Length of arrays MUST be defined before using in Java
        //all array store the same data type of the elements being stored in the array

        //HOW TO PROPERLY USE ARRAYS IN JAVA ;

        // CREATE AN ARRAY OF INTs

        //SYNTAX

        int[] texasTemps = new int[3];
        // creating a array Variable name called texasTemps , with length of 3
        //int[] - data type of the variable
        //texasTemps =var name
        //new int[3] = initializing new array of integers
        //[3] - length of the array being created
        //[][][] - length
        //0 1 2 - index
        texasTemps[0] = 36;
        texasTemps[1] = 45;
        texasTemps[2] = 86;
        System.out.println(texasTemps[1]);// print out the value of the element in the 1st index // 45

        //TODO : create an array of Strings that store 3 different weather string (sunny, rainy, etc)

        //1.declare data type of the variable -->String[] (String array -array of Strings
        //2. name our variable - weatherType
        //3. assigning it to a new value
        // the value is of data type " array of Strings' (String[])
        //2.save it to variable
        //3.create the array
        //4. specify the data type of the array
        //5. assign values to each of the elements in the array

        String [] weatherType = new String [3];
        //weatherType =[[][][]]
        weatherType[0] = "snowy";
        weatherType[1] = "sunny";
        weatherType[2] = "rainy";
        //[["snowy"],["sunny"],["rainy"]]
        System.out.println(weatherType[2]);

        //System.out.println(weatherType[4]); //throw an exception.

        //HANDLING MULTIPLE ELEMENTS AT A TIME
        //creat an array that holds my daily steps
        //data type if elements? long
        //data type - array
        //name the variable that holds the array - dailySteps
        // data type of the variable (dailySteps) ? long

        long [] dailySteps ={10000, 12000, 22000};
        System.out.println(dailySteps[0]);
        System.out.println(Arrays.toString(dailySteps));//⭐️⭐️ Arrays.toString(nameOfArray)⭐️⭐️

        //[[10000],[12000],[22000]]

        //this doesn't work! LENGTH MUCT BE DEFINED
//        long[] dailySteps;
//        dailySteps[0] = 30000;

        //TODO  Create an array of ints and prints out the array

        int [] arr = {1233,12334,234234,112341};
        System.out.println(Arrays.toString(arr));

        //TODO Lets create a method (nums) that return the sum of all integer in an array
        int sum =0; ;
        int [] arrOfNum = {1,2,3,4,5};
        for (int i = 0 ; i < 5; i ++){
            sum +=arrOfNum[i];
        }
        System.out.println(sum);

        //for (data type and name of variable :  name of the array we are iterating through ) :: for(String name : Names){sout(name)}


        int randomSum=0;
        int [] arrOfRandomNum = new int [10];
        for (int i = 0; i < 10 ; i++){
            arrOfRandomNum[i] = (int)(Math.random()*100 +1);
            System.out.println(arrOfRandomNum[i]);

           randomSum += arrOfRandomNum[i];
        }
        System.out.println(Arrays.toString(arrOfRandomNum));
        System.out.println(randomSum);

        //TODO SELF PRACTICE :: compare each array and bring put the biggest random integer between 1 - 99 index.

        int result = -1;
        int [] compareIndex = new int[20];
        for(int i = 0 ; i < 20 ; i ++) {
            compareIndex[i] = (int) (Math.random() * 100 + 1);
            System.out.println(Arrays.toString(compareIndex));
           result = max(result, compareIndex[i]);

        }
        System.out.println("the largest integer among random 1-99 number of 20 index is "+ result +" .");

        //ARRAY CLASS

        // ⭐️⭐️Arrays.fill()
        String [] languages = {"french","portuguese","dutch"};
        System.out.println(Arrays.toString(languages));
        Arrays.fill(languages,"french");
        System.out.println(languages);

        //⭐️⭐️Arrays.equals()
        String [] answer = {"apart","learn","knock"};
        String[] KenGuess = {"texas", "green", "array"};
        System.out.println(Arrays.equals(answer,KenGuess));

        // accept two parameters ( from what array are you comparing, to what array are you comparing)
        // returns a boolean

        //⭐️⭐️Arrays.copyOf()
        String [] lauraCopy = Arrays.copyOf(answer,2); // from index 0 to 2 of them.
        System.out.println(Arrays.toString(lauraCopy));

        //⭐️⭐️Arrays.sort()
        String [] language = {"french", "portuguese", "dutch"};
        System.out.println(Arrays.toString(language));
        Arrays.sort(language);
        System.out.println(Arrays.toString(language));  // automatic alphabetical order

        int [] randomNumbers = {1,3,45,6,2,3,4,54,};
        System.out.println(Arrays.toString(randomNumbers));
        Arrays.sort(randomNumbers); // automatic numeric order
        System.out.println(Arrays.toString(randomNumbers));

        //TODO Write a program that creates an array, and then prints the sum of the even and odd integers in a new array [sumOdd, sumEven]
        //example: [2,4,8,5,1,2];
        //output; [6,16]
        //reason: 2+4+8+2 = 16
        //5+1 = 6 (edited)
//
//        int [] addOddEven = new int [8];
//        for( int i = 0 ; i < 8; i++){
//            addOddEven[i] = (int)(Math.random()*100 +1);
//        }
//        int evenSum = 0;
//        int oddSum = 0;
//        for(int i = 0; i <10; i ++ ){
//            if (addOddEven[i] %2 == 0){
//                evenSum += addOddEven[i];
//            }else{
//                oddSum += addOddEven[i];
//            }
//        }
//        int [] sums = {evenSum,oddSum};
//        System.out.println(Arrays.toString(sums));
//

        // TWO DIMENSIONAL ARRAYS
        int [] myArr = new int[3];
        int [][] myMatrix = {{4,7,9},{1,5,9},{2,2,7}};
        System.out.println(Arrays.deepToString(myMatrix));
        // print out every nested element in the matrix
        //do a  loop
        //do another loop

        for(int[] rows: myMatrix){
            System.out.println("-----------this is a new row----------");
            for(int column: rows){
                System.out.println(column);
            }
        }

































    }
}
