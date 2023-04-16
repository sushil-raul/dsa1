public class q4 {
    public static void main(String[] args) {
        char[] arr = {'C', 'A', 'R' ,'B' ,'O' ,'N'};

        // Nested loops to generate all possible combinations
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (i != j && j != k && i != k) {
                        System.out.println("" + arr[i] + arr[j] + arr[k]);
                    }
                }
            }
        }
    }
}
