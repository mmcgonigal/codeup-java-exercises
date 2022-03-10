package Exception_lecture;

public class ExceptionTest {
    public static void main(String[] args) throws // this will find exception
            Exception{
        System.out.println(" I am above the exception"); // this will run because this is  before Exception right below.
      //  throw new Exception("Woops - Exception-error happened"); // this is the exception < throws  and throw difference>
//        System.out.println("Good morning Sirius!"); // after Exception above , this won't run , so i cant see,this code anymore .

        // Ok- that's an interesting experiment that shows an exception breaking a program and how it breaks,but how would i start to work around exception ?
         // A - Look at a try - catch block !

        try{
            // Code to break application here/..
            throw new RuntimeException("Something broke while running the application!!!!!!!!!!!!!!!");
        } catch (NullPointerException exceptionObject){  // instead of RuntimeException , inside catch, it is NullpointerException//
            System.out.println("here is an example of .getMessage() ---> " +exceptionObject.getMessage());
            exceptionObject.printStackTrace();

        } catch (RuntimeException exceptionObject){
            System.out.println("this is a runtime exception");
            System.out.println("Here is an example of .getMessage() -->" + exceptionObject.getMessage());
            exceptionObject.printStackTrace();
        } catch (Exception exceptionObject){
            System.out.println("this is a generic, top loevel exception");
            System.out.println("Here is an example if .getMessage() -> " + exceptionObject.getMessage());
        }
    }
}
