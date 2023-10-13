//TASK: To greet any user when entering their name via the command line.

package task.simple.one;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("Hello, " + name);
        System.out.println();
    }
}
