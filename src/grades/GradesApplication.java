package grades;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();  // created HashMap named students that has <keys: ID , value : Student instance>

        //created 4 student objects, with 4 grades.
        Student mina = new Student ("mina");
        mina.addGrade(70);
        mina.addGrade(100);
        mina.addGrade(85);
        mina.addGrade(90);

        Student jane = new Student("jane");
        jane.addGrade(90);
        jane.addGrade(55);
        jane.addGrade(100);
        jane.addGrade(89);

        Student john = new Student("john");
        john.addGrade(85);
        john.addGrade(100);
        john.addGrade(96);
        john.addGrade(89);

        Student smith = new Student("smith");
        smith.addGrade(100);
        smith.addGrade(100);
        smith.addGrade(100);
        smith.addGrade(98);

        //add  each Student objects to the map using .put(key-->ID,value-->name of object)
        students.put("mina.m",mina);
        students.put("maryJ.d",jane);
        students.put("john.d",john);
        students.put("granny",smith);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome\n Here are the Github usernames for our students. ");

        for(String key : students.keySet()){  //while iterating keySets from students hashmap, get keys
            System.out.printf("| %s |",key);
        }
        System.out.println("which student would you like to see more information on ? ");







    }
}
