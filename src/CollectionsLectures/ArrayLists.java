
package CollectionsLectures;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {

        ArrayList<Integer> favNumbers = new ArrayList<>();
        //favNumbers.size();

        //Lets add some elements to our arrayList
        favNumbers.add(7);
        System.out.println("favNumbers = " + favNumbers);
        //I'd like to add in a number before it [index 0] that is my
        favNumbers.add(0,222);
        favNumbers.add(2,13);

        System.out.println("favNumbers = " + favNumbers);
        System.out.println("favNumbers.size() = " + favNumbers.size());

        // Let's go GET something at index X
        favNumbers.get(2);
        System.out.println("myFavorite favoritenum =  " + favNumbers.get(2));

        // how can i find element 7 from the array  ?
        favNumbers.indexOf(7);
        System.out.println("favNumber has element 7 in index " + favNumbers.indexOf(7));

        //there are 2 "7" elements ,
        favNumbers.add(7);
        System.out.println(favNumbers);
        favNumbers.lastIndexOf(7);
        System.out.println("favNumbers.lastIndexOf(7) "  + favNumbers.lastIndexOf(7));

        //.remove() -- lets remove 7
        // System.out.println(favNumbers.remove(2));
        //System.out.println("favNumbers.remove(7) = " + favNumbers.remove(2));
        Integer toRemove = new Integer(7);
        favNumbers.remove(toRemove);
        System.out.println("favNumbers = " + favNumbers);










    }


}
