package util;

public class InputTest {
    public static void main(String[] args){
        Input input = new Input();
        String string =  input.getString();
        System.out.println(string);
        boolean likePizza = input.yesNo();
        System.out.println(likePizza);


    }
}
