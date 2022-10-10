import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scanner keyboard = new Scanner(System.in);
        //String input = keyboard.nextLine();

        String test = "This is a string for testing average word length";
        // concatenate String to include a " " at end of phrase; enables iteration method to include final word.
        String amendedTest = test + " ";


        //Create Array with individual chars of String
        String[] arr = amendedTest.split("");
        System.out.println(Arrays.toString(arr));


        // initialise variables
        int words = 0;
        int letterCount = 0;

        // create new ArrayList object for storing all word lengths
        ArrayList<Integer> letters = new ArrayList<>();


        // iterate through Array counting letters and omitting punctuation. When " " is detected, a word is counted.
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals(".") && !arr[i].equals(",") && !arr[i].equals("'") && !arr[i].equals("!")
                    && !arr[i].equals("?") && !arr[i].equals(";") && !arr[i].equals(":") && !arr[i].equals("(")
                    && !arr[i].equals(")") && !arr[i].equals(" ")) {
                letterCount++;
            } else if (arr[i].equals(" ")) {
                words++;
                letters.add(letterCount);
                letterCount = 0;            // reset letter count per word
            }
        }
        System.out.println(letters);
        System.out.println(words);


        // calculate average word length
        int lettersTotal = 0;
        int averageWord = 0;

        // use 'get' since using ArrayList
        for (int i = 0; i < letters.size(); i++){
            lettersTotal += letters.get(i);
        }
        //System.out.println(lettersTotal);
        averageWord = lettersTotal/words;
        System.out.println("Average word length is: " + averageWord);

    }

}
