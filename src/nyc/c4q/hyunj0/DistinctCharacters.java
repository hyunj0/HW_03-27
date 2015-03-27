package nyc.c4q.hyunj0;

import java.util.Scanner;

/**
 * Created by c4q-hyunj0, alizinha, ahhhlvin, lighterletter on 3/23/15.
 **/

//TODOS: work on error message for numbers

public class DistinctCharacters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word or sentence");
        String string = input.nextLine();
        System.out.println(uniqueCharacters(string));

    }

    public static String uniqueCharacters (String string) {
        String lowerString = string.toLowerCase();
        String distinctCharacters = "" + lowerString.charAt(0);
        for (int i = 1; i < lowerString.length(); i++) {
            String checkLetter = lowerString.substring(i, i + 1);
            if (distinctCharacters.contains(checkLetter)) {
                continue;
            } else {
                distinctCharacters = distinctCharacters + lowerString.charAt(i);
            }
        }
        return distinctCharacters;

    }
}
