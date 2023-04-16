public class qha4 {
    public static void main(String[] args) {
        double[][] a = {{1.0, 2.0, 3.0}, {4.0, 5.0, 6.0}};
        double[][] b = {{7.0, 8.0, 9.0}, {10.0, 11.0, 12.0}};
        
        double[][] sum = addMatrix(a, b);
        
        // print the input matrices
        System.out.println("Matrix A:");
        printMatrix(a);
        
        System.out.println("Matrix B:");
        printMatrix(b);
        
        // print the sum matrix
        System.out.println("Sum of matrices A and B:");
        printMatrix(sum);
    }
    
    public static double[][] addMatrix(double[][] a, double[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        double[][] sum = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }
    
    public static void printMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
