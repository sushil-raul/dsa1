public class qha3 {
    public static int[] dotProduct(int[] a, int[] b) {
        int n = a.length;
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            c[i] = a[i] * b[i];
        }

        return c;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] c = dotProduct(a, b);

        // print the dot product
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
