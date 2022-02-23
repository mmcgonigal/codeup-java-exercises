import java.util.Scanner;

public class oop_recap {  //sandwich  // class is like a frame for an object. /or factory to instance(create new object)
    // 클래스를 이용하여, 현실세계의 특정한 물건을 지칭할 수 있음. 가장 많이 사용되는 대표적인 예가 Node Class, 이는 하나의 장소나 위치를 의미할 수 도 있음.

    //bluePrint -- > these belows are PROPERTIES 속성 , 성격, 사물에 대한 성질을 묶어서 나타낸것, // what kind of properties does the class have ? ex ) sandwich : bread, meat , veggies, cheese, sauce
    public String firstName; //bread
    public String lastName; // meat
    public int age;
    public String relationship;



    public String sayHi (){
        return ("hello from " + firstName);
    }

//
//    // constructor --> a special method : return type
    public oop_recap(String firstName,String lastName ) {          //  this part goes with not the default part.
        this.firstName = firstName; // this will get the value from
        this.lastName = lastName; // this will g
        this.age = 0 ; // all meat are out except ham so all sandwich will have ham. -default
        this.relationship = "undefined"; // set to default.


    }

    //second constructor for user provide all info.
    public oop_recap(String firstName,String lastName, int age, String relationship){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.relationship = relationship;
    }



    public static void main(String[] args) {

        // this is creating an INSTANCE of a person  //
        // and they are filled with properties and value. //
        // thid only works when i dont have constructor //

        // once constructor is created, original class with fields seems not working.. ?

        /////////////////////Scenario 1 ///////////////////////
//        oop_recap user1 = new oop_recap();
//        user1.firstName = "mina";
//        user1.lastName = "mcgonigal";
//        user1.age = 35 ;
//        user1.relationship = "married";
//        System.out.println(user1.sayHi());

// Constructor overloading
        // Before : We were using our default constructor and assigning all fields manually...-->Scenario 1

        // NOW with constructor

        // first constructor
        oop_recap user2 =new oop_recap("jane", "doe");
        System.out.println(user2.firstName);
        System.out.println(user2.lastName);
        System.out.println(user2.age);
        System.out.println(user2.relationship);
        System.out.println(user2.sayHi());

        Scanner mcScanner = new Scanner(System.in); // created instance
        mcScanner.nextLine(); // call the instance to use.

        // second constructor
        oop_recap user3 = new oop_recap("jon","doe", 30, "complicated");
        System.out.println(user3.firstName);
        System.out.println(user3.lastName);
        System.out.println(user3.age);
        System.out.println(user3.relationship);





    }
}
