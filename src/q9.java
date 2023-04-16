import java.util.Scanner;

public class q9 {
    
    public static void main(String[] args) {
        double[][] matrix = new double[4][4];
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a 4-by-4 matrix row by row:");
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        
        double sum = sumMajorDiagonal(matrix);
        
        System.out.println("Sum of the elements in the major diagonal is " + sum);
    }
    
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0.0;
        
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        
        return sum;
    }
}
