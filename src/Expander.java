// Created by Ilan Godik

import java.util.Scanner;

public class Expander {

    //Input: A string.
    //Output: An expanded string.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String s = in.next();
        System.out.println("The expanded string is: " + expandString(s));
    }

    //Expands the string
    public static String expandString(String s) {
        String expanded = "";
        for (int i = 0; i < s.length() - 1; i++) {
            char currentChar = s.charAt(i);
            char nextChar = s.charAt(i + 1);
            if (!isNumber(currentChar)) {
                if (isNumber(nextChar)) {
                    for (int j = 0; j < getNum(nextChar); j++) {
                        expanded += currentChar;
                    }
                } else {
                    expanded += currentChar;
                }
            }
        }
        expanded += s.charAt(s.length() - 1);
        return expanded;
    }

    //Returns true if the char represents a number between 2 to 9.
    public static boolean isNumber(char c) {
        return c >= '2' && c <= '9';
    }

    //Returns the corresponding integer of the char.
    public static int getNum(char c) {
        return c - '0';
    }
}
