import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a 3-by-4 matrix
        System.out.println("Enter a 3-by-4 matrix row by row:");
        double[][] matrix = new double[3][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        // Display the sum of each column
        for (int j = 0; j < matrix[0].length; j++) {
            System.out.println("Sum of the elements at column " + j + " is " + sumColumn(matrix, j));
        }
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }
}
