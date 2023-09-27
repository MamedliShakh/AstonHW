package Aston.Trainee.Methods;

import java.util.Scanner;

public class Input {
    public static String getLine() {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        return text;
    }

    public static String[] getArray(){
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String[] result = text.split(" ");
        return result;
    }
}
