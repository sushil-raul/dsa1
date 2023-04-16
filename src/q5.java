
import java.util.*;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
    	int n = sc.nextInt();
        int result = sum_Of_Digits(n);
        System.out.println("Sum of digits of " + n + " until the number is a single digit is " + result);
    }
    
    public static int sum_Of_Digits(int n) {
        int sum = 0;
        while (n > 0 || sum > 9) {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
