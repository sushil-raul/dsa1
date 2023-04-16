import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of elements in array
        System.out.print("Enter number of elements of Array: ");
        int n = scanner.nextInt();

        // Read array elements
        int[] arr = new int[n];
        System.out.print("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find maximum and minimum elements and their occurrences
        int max = arr[0], min = arr[0], maxCount = 1, minCount = 1;
        int maxIndex = 0, minIndex = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxCount = 1;
                maxIndex = i;
            } else if (arr[i] == max) {
                maxCount++;
            }

            if (arr[i] < min) {
                min = arr[i];
                minCount = 1;
                minIndex = i;
            } else if (arr[i] == min) {
                minCount++;
                minIndex = i;
            }
        }

        // Output results
        System.out.println("Maximum element of Array is " + max + " and occurs " + maxCount + " times.");
        System.out.println("Minimum element of Array is " + min + " and occurs " + minCount + " times.");
        System.out.println("First occurrence of maximum element is at position " + (maxIndex + 1) + ".");
        System.out.println("Last occurrence of minimum element is at position " + (minIndex + 1) + ".");
    }
}
