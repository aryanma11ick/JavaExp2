import java.util.ArrayList;
import java.util.Scanner;

public class EvenOddSeparator {
    // Separates numbers into even and odd arrays
    public static void separator(Scanner scanner) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] % 2 == 0) {
                even.add(numbers[i]);
            } else {
                odd.add(numbers[i]);
            }
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
