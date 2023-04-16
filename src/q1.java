import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer greater than 2: ");
        int n = sc.nextInt();

        int count = 0;
        while (n >= 2) {
            n /= 2;
            count++;
        }

        System.out.println("The number of times to divide by 2 is: " + count);
    }
}
