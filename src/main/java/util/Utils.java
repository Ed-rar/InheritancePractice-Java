package util;

import java.util.Scanner;

public class Utils {

    static Scanner input = new Scanner(System.in);

    public static String inputString(){
        return input.nextLine();
    }

    public static int inputInt(){
        return Integer.parseInt(input.nextLine());
    }

    public static double inputDouble(){
        return Double.parseDouble(input.nextLine());
    }

    public static char inputChar(){
        return input.nextLine().charAt(0);
    }

    public static void closeScanner(){
        input.close();
    }
}
