// Created by Ilan Godik

import java.util.Scanner;

public class DateConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String out = "IL Date\t\tUS Date\r\n";
        int countEquals = 0;

        System.out.println("Input ends with \"00/00/0000\".");

        System.out.print("Please enter a date:");
        String date = in.next();
        while(!date.equals("00/00/0000")){
            String USDate = convertToUSA(date);
            out += date+'\t'+USDate+"\r\n";
            if(date.equals(USDate)) countEquals++;

            System.out.print("Please enter a date:");
            date = in.next();
        }

        System.out.println(out);
        System.out.println("There were "+countEquals+" dates that are the same in the US and Israel.");
    }

    public static String convertToUSA(String date){
        final char SLASH = '/';
        int posSlash1 = date.indexOf(SLASH);
        String day = date.substring(0,posSlash1);
        int posSlash2 = date.indexOf(SLASH,posSlash1+1);
        String month = date.substring(posSlash1+1,posSlash2);
        String year = date.substring(posSlash2 + 1);
        String date1 = month+SLASH+day+SLASH+year;
        return date1;
    }
}
