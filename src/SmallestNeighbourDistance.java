public class SmallestNeighborDistance {
    // Finds index of the first of two neighboring elements with smallest difference
    public static void findClosestPair() {
        int[] arr = {4, 9, 1, 3, 8, 7};

        if (arr.length < 2) {
            System.out.println("Array needs at least two elements.");
            return;
        }

        int minDiff = Math.abs(arr[1] - arr[0]);
        int index = 0;

        for (int i = 1; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i + 1] - arr[i]);
            if (diff < minDiff) {
                minDiff = diff;
                index = i;
            }
        }

        System.out.println("Closest pair: " + arr[index] + " and " + arr[index + 1]);
        System.out.println("Index of first number: " + index);
    }
}
