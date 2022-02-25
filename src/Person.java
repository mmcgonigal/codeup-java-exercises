//public class Person{
//    private String name;
//
//    public String getName(){
////TODO: return the person's name
//// getting it from private -- able to access public,
//        return name;
//    }
//
//    public void setName(String name){
////TODO: change the name field to the passed value
//        //setting it to new value
//        this.name = name;
//    }
//    public void sayHello(){
////TODO: print a message to the console using the person's name
//        System.out.println("Hello, My name is  " + name);
//    }
//    public Person(String name){
//        this.name = name;
//    }
//
//    public static void main(String[] args) {
//        Person user1 = new Person("Jane Doe");
//        System.out.println(user1.getName());
////
////        Person person1 = new Person("John"); //john
////        Person person2 = new Person("John"); //john
////        System.out.println(person1.getName().equals(person2.getName())); //true
////        System.out.println(person1 == person2); //false because it is string ?! need equals() ?!
//
//
////        Person person1 = new Person("John");
////        Person person2 = person1;
////        System.out.println(person1 == person2); //true , because new created object person2's value is person 1. // garbage collector will clear
//
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());  //john
//        System.out.println(person2.getName()); // john but person 1 john
//        person2.setName("Jane");
//        System.out.println(person1.getName()); //john ---> jane ---> because Person person2 = person1 ;
//        System.out.println(person2.getName()); //jane
//
//
//    }
//
//
//
//
//
//
//
//}