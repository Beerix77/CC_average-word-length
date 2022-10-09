import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        //Scanner keyboard = new Scanner(System.in);
        //String input = keyboard.nextLine();

        String test = "This is a string for testing average word length";

        String[] arr = test.split("");
        //System.out.println(Arrays.toString(arr));

        int words = 0;
        int letterCount = 0;

        ArrayList <Integer> letters = new ArrayList<>();

        for (String s : arr) {
            if (!s.equals(".") && !s.equals(",") && !s.equals("'") && !s.equals("!")
                    && !s.equals("?") && !s.equals(";") && !s.equals(":") && !s.equals("(")
                    && !s.equals(")") && !s.equals(" ")) {
                letterCount++;
            } else if (s.equals(" ")) {
                words++;
                letters.add(letterCount);
                letterCount = 0;
            }
        }
        System.out.println(letters);
        System.out.println(words);




        }
}
