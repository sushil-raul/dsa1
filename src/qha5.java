public class qha5 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        int maxRowOnes = 0, maxColOnes = 0;
        int maxRowIndex = 0, maxColIndex = 0;
        
        // Initialize matrix with random 0s and 1s
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }
        
        // Print the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // Check rows for the most 1s
        for (int i = 0; i < matrix.length; i++) {
            int rowOnes = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    rowOnes++;
                }
            }
            if (rowOnes > maxRowOnes) {
                maxRowOnes = rowOnes;
                maxRowIndex = i;
            }
        }
        
        // Check columns for the most 1s
        for (int i = 0; i < matrix[0].length; i++) {
            int colOnes = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) {
                    colOnes++;
                }
            }
            if (colOnes > maxColOnes) {
                maxColOnes = colOnes;
                maxColIndex = i;
            }
        }
        
        // Print the results
        System.out.println("The largest row index: " + maxRowIndex);
        System.out.println("The largest column index: " + maxColIndex);
    }
}
