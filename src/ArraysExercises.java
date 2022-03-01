import java.util.Arrays;

public class ArraysExercises {
    //Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

    //1. create static method named addPerson . public static Person[] addPerson(){}
    //2. (array of Person objects, single person object to add to the passed array)
    public static Person[] addPerson(Person [] personArr,Person person) {
//        return
//return lengthOf array =  array of Person objects+ 1,
        int newArr = personArr.length +1 ;
        Person [] nameOfPerson = new Person [newArr];
        for(int i = 0; i < newArr; i ++){
            System.out.println(nameOfPerson[i]);
        }
        return nameOfPerson;

    }




//addPerson(nameOfPerson,newPerson)

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        //System.out.println(numbers); // not working. must use Arrays.toString()

       Person person1  = new Person("Jane");
       Person person2 = new Person ("John");
       Person person3 =  new Person("Tom");


       Person [] nameOfPerson = {person1,person2,person3};

       System.out.println(nameOfPerson.length);

        for(int i = 0 ; i < 3; i ++){
            System.out.println(nameOfPerson[i].getName());
        }





    }
}
