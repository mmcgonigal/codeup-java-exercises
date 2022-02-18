import java.util.Scanner;

public class Bob {
    public static void main (String[] args){

        Scanner BobTheTeenage = new Scanner (System.in);

        String token;
        do {
           token = BobTheTeenage.nextLine();
            if (token.contains("?")) {
                System.out.println("Sure");
            } else if (token.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (token.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            }
        } while (token.startsWith("Bob,") || token.startsWith("") || token.startsWith("bob,") );
    }
}
