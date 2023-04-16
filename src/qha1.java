import java.util.Scanner;

public class qha1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int c = scanner.nextInt();

        if (a + b == c) {
            System.out.println(a + " + " + b + " = " + c);
        } else if (a == b - c) {
            System.out.println(a + " = " + b + " - " + c);
        } else if (a * b == c) {
            System.out.println(a + " * " + b + " = " + c);
        } else {
            System.out.println("The numbers cannot be used in a correct arithmetic formula.");
        }
    }
}
