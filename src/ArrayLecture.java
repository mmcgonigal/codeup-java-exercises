import java.util.Arrays;

public class ArrayLecture {

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
















    }
}
