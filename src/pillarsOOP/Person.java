package pillarsOOP;

public class Person {
    public String name ;
   private int age;

    public Person(String name){
        this.name = name;
    }
    public Person(){

    }
    public void sayHello() {
        System.out.println("hello from " + name + "!");
    }
    public void sayGoodBye(){
        System.out.println("adios " + name + "!");
        }
    public String getName() {
        return name;
    }
    }


