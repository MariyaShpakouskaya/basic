package util;

import java.util.Scanner;

public class ConsoleReader {
    public static int getIntFromConsole(Scanner scanner, int defaultValue) {
        int attemps = 0;
        while (attemps < 3) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                String input = scanner.next();
                System.out.println("Can't read. Integer value was expected. Your input was: " + input);
                attemps++;
                if (attemps < 3) {
                    System.out.print("Please, try again. Enter integer: ");
                }
            }
        }
        System.out.println("Set to default: " + defaultValue);
        return defaultValue;
    }

    public static int[] getIntArrayFromConsole(Scanner scanner, int lengthArray) {
        int[] array = new int[lengthArray];
        if (scanner.hasNextInt()) {
            for (int i = 0; i < lengthArray; i++) {
                array[i] = scanner.nextInt();
            }
            return array;
        } else {
            String input = scanner.next();
            System.out.println("Can't read. Integer value was expected. Your input was: " + input);
            System.out.println("Application is terminated");
        }
        System.exit(0);
        return null;
    }
}
