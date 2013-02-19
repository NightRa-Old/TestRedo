// Created by Ilan Godik

import java.util.Scanner;

public class LongestWord {

    public static int what(String s) {
        int x = 0;
        int pos = s.indexOf(' ');
        while (pos > -1) {
            if (pos > x) {
                x = pos;
            }
            s = s.substring(pos + 1);
            pos = s.indexOf(' ');
        }
        if (s.length() > x) {
            x = s.length();
        }
        return x;
    }

    public static void main(String[] args) {
        what("Hello world! How are you today brother?");
    }

    public static int getLongestWordLength(String s) {
        String[] words = s.split(" ");
        int maxLength = 0;
        for (String word : words) {
            if (word.length() > maxLength) maxLength = word.length();
        }
        return maxLength;
    }

    public static int getLongestWordLength1(String s) {
        int maxLength = 0;
        Scanner scanner = new Scanner(s);
        while (scanner.hasNext()) {
            String word = scanner.next();
            if (word.length() > maxLength) maxLength = word.length();
        }
        return maxLength;
    }

    public static int getLongestWordLength2(String s) {
        int length = 0;
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') length++;
            else {
                if (length > maxLength) maxLength = length;
                length = 0;
            }
        }
        if (length > maxLength) maxLength = length;
        return maxLength;
    }

    public static int getLongestWordLength3(String s) {
        int lastIndex = 0;
        int pos = 0;
        int length;
        int maxLength = 0;

        pos = s.indexOf(' ', pos + 1);

        while (pos != -1) {
            length = pos - lastIndex;
            if (length > maxLength) {
                maxLength = length;
            }
            lastIndex = pos + 1;
            pos = s.indexOf(' ', pos + 1);
        }
        length = s.length() - lastIndex;
        if (length > maxLength) maxLength = length;
        return maxLength;
    }

}
