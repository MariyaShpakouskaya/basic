package util;

public class ResultPrinter {
    public static void ReversePrintArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }
}
