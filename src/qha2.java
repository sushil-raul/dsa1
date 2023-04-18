import java.util.Scanner;

public class ReverseLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines for input: ");
        int n = sc.nextInt();

        sc.nextLine();

        String[] s = new String[n];

        System.out.println("Enter lines:");
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextLine();
        }

        System.out.println("Lines in reverse order:");
        for (int j = n - 1; j >= 0; j--) {
            System.out.println(s[j]);
        }

        sc.close();
    }
}
