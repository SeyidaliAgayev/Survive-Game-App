package util;

import java.util.Scanner;

public class InputUtil {
    public static int requiredIntInput(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(title);
        return scanner.nextInt();
    }
}
