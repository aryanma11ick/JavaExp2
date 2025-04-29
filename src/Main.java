/*
Name  : Aryan Mallick
PRN   : 23070126021
Batch : A1
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Separating even and odd numbers
        EvenOddSeparator.separator(scanner);

        // Finding smallest distance pair
        SmallestNeighborDistance.findClosestPair();

        // Array <-> ArrayList conversion
        ArrayConversion.convert();

        scanner.close();
    }
}
