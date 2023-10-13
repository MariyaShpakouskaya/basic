//TASK: Display command line arguments in reverse order in the console window.

package task.simple.one;

import util.ConsoleReader;
import util.ResultPrinter;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int lengthArray = ConsoleReader.getIntFromConsole(scanner, 3);
        System.out.println("Enter arguments: ");
        int[] array = ConsoleReader.getIntArrayFromConsole(scanner, lengthArray);
        System.out.print("Sorted array is: ");
        ResultPrinter.ReversePrintArray(array);
        System.out.println();
    }
}
