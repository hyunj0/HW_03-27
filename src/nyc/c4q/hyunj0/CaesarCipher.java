package nyc.c4q.hyunj0;

import java.util.Scanner;

/**
 * Class for Encoding and Decoding CaesarCiphers
 */
public class CaesarCipher {

    //made a method to check the int values of the characters in the two cipher strings
    //caesar cipher is a substitution cipher so the text length must equal for all characters to be replaced
    //the difference is the amount of letters to shift by
    //since the alphabet has 26 letters, subtract the difference from 26 to get the offset amount
    public static boolean codeBreaker (String cipherTextOne, String cipherTextTwo) {
        int difference = 0;
        if (cipherTextOne.length() == cipherTextTwo.length()) {
            for (int i  = 0; i < cipherTextOne.length(); i++) {
                for (int j = 0; j < cipherTextTwo.length(); j++) {
                    difference = (int) cipherTextTwo.charAt(i) - (int) cipherTextOne.charAt(i);
                }
                System.out.println(difference);
            }
        } else {
            return false;
        }
        if (cipherTextOne.equals(encode(cipherTextTwo, 26 - difference))) {
            return true;
        } else {
            return false;
        }
    }

    public static String decode(String enc, int offset) {
        return encode(enc, 26 - offset);
    }

    public static String encode(String enc, int offset) {
        offset = offset % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append((char) ('A' + (i - 'A' + offset) % 26 ));
                } else {
                    encoded.append((char) ('a' + (i - 'a' + offset) % 26 ));
                }
            } else {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to encode");

        String input = sc.nextLine();
        String encoded = CaesarCipher.encode(input, 25);
        System.out.println(encoded);

        String decoded = CaesarCipher.decode(encoded, 25);
        System.out.println(decoded);

        System.out.println(codeBreaker(encoded, decoded));
    }
}