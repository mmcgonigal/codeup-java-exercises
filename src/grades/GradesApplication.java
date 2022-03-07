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
        String userName;

        for(String key : students.keySet()){  //while iterating keySets from students hashmap, get keys
            System.out.printf("| %s |",key);
        }

        //pseudo ::
        //1.ask user  which student info he/she wants ?
                //1-1 if id is in the list - print out info
                //1-2 if user types id not on list , ask,if he wants to try again . 1-2.1 if yes, ask user info ,
        //                                                                          1-2.2 if no,  goodbye
        //2.ask if want to try another student.  2-1 if yes go back to 1
        //
        //
        //                                       2-2 if no , good bye
        String reply;
        String answer;
       do{ System.out.println("\nwhich student would you like to see more information on ? ");
         userName = scanner.next();
         if(students.containsKey(userName))
           System.out.println("GitHub user name : " + userName +" - "+ " Name : "+ students.get(userName).getName() +" - "+ " Average Grade : " + students.get(userName).getGradeAverage());




//             do {
         if (!students.containsKey(userName)) {
             System.out.printf("\nSorry, but no student found with github username of \"%s\" . ", userName);
//                     System.out.println("Would you like to see another student? [y/n]");
         }
//                 reply = scanner.next();
//                 if (reply.equalsIgnoreCase("n") || reply.equalsIgnoreCase("No")) ;
//                 break;
//             }while(reply.equalsIgnoreCase("y") || reply.equalsIgnoreCase("yes"));
           System.out.println("Would you like to see another student ? [y/n]");
           answer = scanner.next();

       }while(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes"));












    }
}
