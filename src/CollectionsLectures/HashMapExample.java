package CollectionsLectures;
import java.util.HashMap;
public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String, String> authorsBooks = new java.util.HashMap<>();
        authorsBooks.put("kurt Vonnegut", "Cat's Cradle");
        authorsBooks.put("J.D Salinger", "Franny and Zooey");

        //so - lets .get some keys and see their values.
        System.out.println("authorsBooks.get (\"Kurt vonnegut\")=  " + authorsBooks.get("Kurt Vonnegut"));
        System.out.println("authorsBooks.get(\"Issac Asimov\") = " + authorsBooks.get("Issac Asimov"));



    }
}
