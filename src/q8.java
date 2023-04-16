import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows of 2D-Array: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of Columns of 2D-Array: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.print("Enter elements of 2D-Array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("The elements of 2D array are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int[] row : arr) {
            for (int num : row) {
                sum += num;
            }
        }
        System.out.println("The sum of elements of the 2D-Array is " + sum);
    }
}
